import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private ArrayList<Menu> menus;
    private Endereço endereco;
    private ArrayList<Mesa> mesas;
    
    

    public Restaurante(String nome, Endereço endereco, ArrayList<Menu> menus, ArrayList<Mesa> mesas) {
          this.nome = nome;
          this.endereco = endereco;
          this.menus = menus;
          this.mesas = mesas;
    }


    public String getNome() { 
          return nome; 
     }
    public void setNome(String nome) {
          this.nome = nome; 
     }
    public Endereço getEndereco() {
          return endereco; 
     }
    public void setEndereco(Endereço endereco) {
         this.endereco = endereco; 
     }
    public ArrayList<Menu> getMenu() {
         return menus; 
     }

     public void setMenu(ArrayList<Menu> menus) {
          this.menus = menus; 
     }
     public ArrayList<Mesa> getMesas() {
          return mesas; 
     }
}
