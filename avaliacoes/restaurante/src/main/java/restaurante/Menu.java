package restaurante;
import java.util.List;

public class Menu {
    private List<Produto> produtos;
    
    public void show(){
        System.out.println("-------------MENU----------------");
        for (Produto produto : produtos){
        
            System.out.println("Nome: " + produto.getNome() + "Valor: R$" 
                                + produto.getValorVenda());
        }
        System.out.println("-----------------------------");
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
