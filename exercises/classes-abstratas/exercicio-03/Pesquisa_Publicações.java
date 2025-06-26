import java.util.ArrayList;

/**
 * A classe Pesquisa_Publicações define características de uma pesquisa de publicações científicas.
 * 
 */
public class Pesquisa_Publicações {

    /**
     * Construtor padrão da classe Livros.
     */
    public Pesquisa_Publicações() {
    }
    
    /**
     * O método buscar_publicações_areadepesquisa busca publicações de uma determinada área de pesquisa (especificada no parâmetro),
     * e imprime na tela os resultados que achar, caso não encontre nenhuma publicação referente a área citada, imprime uma mensagem
     * avisando que não há publicações referentes a área de pesquisa.
     * 
     * @param publi Lista de publicações 
     * @param ap Área de pesquisa
     * @see Publicações
     */
    public void buscar_publicações_areadepesquisa(ArrayList<Publicações> publi, Areas_pesquisas ap){

        int qtd = 0;

        for (Publicações p : publi){
            if(p.getArea_pesquisa() == ap){
                if(qtd == 0){
                    System.out.println("\n+------------------------------------------------------+");
                    System.out.println("Publicaçoes com a área de pesquisa " + ap + ": ");
                }
                System.out.println(p.getNome());
                qtd++;
            }
        }
        

        if (qtd == 0){
            System.out.println("\n+------------------------------------------------------+");
            System.out.println("Nao há publicações com a área de pesquisa "+ ap);
            System.out.println("+------------------------------------------------------+");
        } 
        else {
            System.out.println("+------------------------------------------------------+");
        }

    }
    
}
