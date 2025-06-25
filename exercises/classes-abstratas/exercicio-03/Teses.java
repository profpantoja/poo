import java.time.LocalDate;

public class Teses extends Publicações{

    private String grau;
    private String instituição_defendimento;
    private Coordenador coordenador;


    public Teses(){
    }

    public Teses(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, String titulo, String ano, String autores, Coordenador coordenador, String grau, String instituição_defendimento) {

        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.coordenador = coordenador;
        this.grau = grau;
        this.instituição_defendimento = instituição_defendimento;

    }

    


    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nGrau: " + getGrau() + "\nInstituiçao de defendimento: " + getInstituição_defendimento() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+");
    }



    public String getGrau() {
        return grau;
    }
    public void setGrau(String grau) {
        this.grau = grau;
    }
    public String getInstituição_defendimento() {
        return instituição_defendimento;
    }
    public void setInstituição_defendimento(String instituição_defendimento) {
        this.instituição_defendimento = instituição_defendimento;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
