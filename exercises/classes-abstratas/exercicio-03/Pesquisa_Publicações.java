import java.util.ArrayList;

public class Pesquisa_Publicações {

    public Pesquisa_Publicações() {
    }
    
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
