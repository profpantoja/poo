import java.time.LocalDate;

public class ArtigosRevista_Conferencias extends Publicações{

    private String periódico;
    private String volume;
    private String numero;
    private Coordenador coordenador;


    public ArtigosRevista_Conferencias(){
    }


    public ArtigosRevista_Conferencias(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, 
        String titulo, String ano, String autores, Coordenador coordenador, String periódico, String volume, String numero) {
        
        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.periódico = periódico;
        this.volume = volume;
        this.numero = numero;
        this.coordenador = coordenador;
    }


    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nPeriódico: " + getPeriódico() + "\nVolume: " + getVolume() + "\nNúmero: " + getNumero() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+\n\n");
    }

    public String getPeriódico() {
        return periódico;
    }
    public void setPeriódico(String periódico) {
        this.periódico = periódico;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Coordenador getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
