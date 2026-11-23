package aula1.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

final class ArquivoCsv {

    static final Path DIRETORIO_PADRAO = Path.of("dados");

    private final Path arquivo;
    private final List<String> cabecalho;
    private final int tamanhoChave;

    ArquivoCsv(Path arquivo, List<String> cabecalho, int tamanhoChave) {
        this.arquivo = arquivo.toAbsolutePath().normalize();
        this.cabecalho = cabecalho;
        this.tamanhoChave = tamanhoChave;
    }

    void salvar(List<String> campos) throws IOException {
        List<String> chave = obterChave(campos);
        synchronized (ArquivoCsv.class) {
            List<List<String>> registros = buscar();
            if (procurar(registros, chave) >= 0) {
                throw new IllegalArgumentException("Registro já cadastrado em " + arquivo.getFileName() + ": " + chave);
            }
            registros.add(campos);
            gravar(registros);
        }
    }

    void alterar(List<String> campos) throws IOException {
        List<String> chave = obterChave(campos);
        synchronized (ArquivoCsv.class) {
            List<List<String>> registros = buscar();
            int indice = procurar(registros, chave);
            if (indice < 0) {
                throw new NoSuchElementException("Registro não encontrado em " + arquivo.getFileName() + ": " + chave);
            }
            registros.set(indice, campos);
            gravar(registros);
        }
    }

    void apagar(List<String> chave) throws IOException {
        validarChave(chave);
        synchronized (ArquivoCsv.class) {
            List<List<String>> registros = buscar();
            int indice = procurar(registros, chave);
            if (indice >= 0) {
                registros.remove(indice);
                gravar(registros);
            }
        }
    }

    List<List<String>> buscar() throws IOException {
        String texto;
        try {
            texto = Files.readString(arquivo);
        } catch (NoSuchFileException e) {
            return new ArrayList<>();
        }

        List<List<String>> registros = Csv.ler(texto);
        if (registros.isEmpty() || !registros.remove(0).equals(cabecalho)) {
            throw new IOException("Cabeçalho inválido em " + arquivo);
        }
        for (List<String> registro : registros) {
            if (registro.size() != cabecalho.size()) {
                throw new IOException("Quantidade de campos inválida em " + arquivo);
            }
        }
        return registros;
    }

    private void gravar(List<List<String>> registros) throws IOException {
        List<List<String>> conteudo = new ArrayList<>();
        conteudo.add(cabecalho);
        conteudo.addAll(registros);

        Files.createDirectories(arquivo.getParent());
        Path temporario = Files.createTempFile(arquivo.getParent(), "registro-", ".tmp");
        try {
            Files.writeString(temporario, Csv.escrever(conteudo));
            Files.move(temporario, arquivo, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } finally {
            Files.deleteIfExists(temporario);
        }
    }

    private List<String> obterChave(List<String> campos) {
        List<String> chave = campos.subList(0, tamanhoChave);
        validarChave(chave);
        return chave;
    }

    private void validarChave(List<String> chave) {
        for (String campo : chave) {
            if (campo == null || campo.isBlank()) {
                throw new IllegalArgumentException("Preencha a chave do registro em " + arquivo.getFileName());
            }
        }
    }

    private int procurar(List<List<String>> registros, List<String> chave) {
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).subList(0, tamanhoChave).equals(chave)) {
                return i;
            }
        }
        return -1;
    }
}
