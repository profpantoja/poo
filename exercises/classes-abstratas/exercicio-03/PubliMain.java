import java.time.LocalDate;
import java.util.ArrayList;

public class PubliMain {

    public static void main(String[] args) {

        Coordenador pantoja = new Coordenador("Pantoja","Pantoja.turing@cefet-rj.com","CEFET-RJ","Rua miguel anjo","Coordenador");
        Coordenador fuschilo = new Coordenador("Fuschilo", "fuschilo@cefet-rj.com","CEFET-RJ","Rua miguel anjo","Professor");

        Teses tese = new Teses("Tese de exemplo","Esta é uma descriçao de exemplo para a tese.",LocalDate.of(2023, 1, 1), Data_termino.efetiva ,LocalDate.of(2024, 1, 1), Areas_pesquisas.Inteligência_artifical,
        "Titulo de exemplo","2024", "Joao Abreu", pantoja, "Graduando","CEFET-RJ");

        Livros livro = new Livros("Livro de exemplo","Esta é uma descriçao de exemplo para o livro.",LocalDate.of(2023, 1, 1), Data_termino.prevista ,LocalDate.of(2024, 1, 1),Areas_pesquisas.Inteligência_artifical,
        "Titulo de exemplo","2024","Joao Abreu",pantoja,"Veja","Leblon, Rio de Janeiro");

        ArtigosRevista_Conferencias arc = new ArtigosRevista_Conferencias("Exemplo de nome de um artigo de revista ou conferência","Esta é uma descriçao de exemplo para o artigo de revista ou conferência.",LocalDate.of(2023, 1, 1), Data_termino.efetiva, LocalDate.of(2024, 1, 1),Areas_pesquisas.Segurança_cibernética,
        "Titulo de exemplo","2024","Joao Abreu",fuschilo,"semanal", "4.2", "3");


        tese.imprimir_informações();

        livro.imprimir_informações();

        arc.imprimir_informações();


        ArrayList<Publicações> publicações = new ArrayList<Publicações>();
        Pesquisa_Publicações p = new Pesquisa_Publicações();

        publicações.add(tese);
        publicações.add(livro);
        publicações.add(arc);

        p.buscar_publicações_areadepesquisa(publicações, Areas_pesquisas.Inteligência_artifical);
        p.buscar_publicações_areadepesquisa(publicações, Areas_pesquisas.Segurança_cibernética);
        p.buscar_publicações_areadepesquisa(publicações, Areas_pesquisas.Redes_de_computadores);


    }
    
}
