import java.time.LocalDate;

public class Livros extends Publicações{

    private String editora;
    private String local_publicação;
    private Coordenador coordenador;


    public Livros(){
    }


    public Livros(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, 
        String titulo, String ano, String autores, Coordenador coordenador, String editora, String local_publicação) {

        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.editora = editora;
        this.coordenador = coordenador;
        this.local_publicação = local_publicação;

    }


    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nEditora: " + getEditora() + "\nLocal da publicaçao: " + getLocal_publicação() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+");
    }


    public String getEditora() {
        return editora;
    }


    public void setEditora(String editora) {
        this.editora = editora;
    }


    public String getLocal_publicação() {
        return local_publicação;
    }


    public void setLocal_publicação(String local_publicação) {
        this.local_publicação = local_publicação;
    }

    
    
}
