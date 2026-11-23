package aula1.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

final class Csv {

    private Csv() {
    }

    static String escrever(List<List<String>> registros) {
        StringBuilder texto = new StringBuilder();
        for (List<String> registro : registros) {
            StringJoiner campos = new StringJoiner(",");
            for (String campo : registro) {
                campos.add(escapar(campo));
            }
            texto.append(campos).append("\r\n");
        }
        return texto.toString();
    }

    private static String escapar(String campo) {
        if (campo == null) {
            return "";
        }
        if (campo.isEmpty() || campo.contains(",") || campo.contains("\"")
                || campo.contains("\r") || campo.contains("\n")) {
            return "\"" + campo.replace("\"", "\"\"") + "\"";
        }
        return campo;
    }

    static List<List<String>> ler(String texto) throws IOException {
        Cursor cursor = new Cursor(texto);
        List<List<String>> registros = new ArrayList<>();

        while (!cursor.fim()) {
            List<String> registro = new ArrayList<>();
            registro.add(cursor.lerCampo());
            while (cursor.consumir(',')) {
                registro.add(cursor.lerCampo());
            }
            if (!cursor.fim() && !cursor.consumir('\n')) {
                if (!cursor.consumir('\r')) {
                    throw new IOException("Separador inválido no CSV.");
                }
                cursor.consumir('\n');
            }
            registros.add(registro);
        }
        return registros;
    }

    private static final class Cursor {
        private final String texto;
        private int posicao;

        private Cursor(String texto) {
            this.texto = texto;
        }

        private boolean fim() {
            return posicao == texto.length();
        }

        private boolean consumir(char esperado) {
            if (fim() || texto.charAt(posicao) != esperado) {
                return false;
            }
            posicao++;
            return true;
        }

        private String lerCampo() throws IOException {
            if (consumir('"')) {
                return lerCampoEntreAspas();
            }

            int inicio = posicao;
            while (!fim()) {
                char caractere = texto.charAt(posicao);
                if (caractere == ',' || caractere == '\r' || caractere == '\n') {
                    break;
                }
                if (caractere == '"') {
                    throw new IOException("Aspas inesperadas no CSV.");
                }
                posicao++;
            }
            return inicio == posicao ? null : texto.substring(inicio, posicao);
        }

        private String lerCampoEntreAspas() throws IOException {
            StringBuilder campo = new StringBuilder();
            while (!fim()) {
                char caractere = texto.charAt(posicao++);
                if (caractere == '"' && !consumir('"')) {
                    return campo.toString();
                }
                campo.append(caractere);
            }
            throw new IOException("Campo do CSV com aspas abertas.");
        }
    }
}
