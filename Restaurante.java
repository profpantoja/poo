public class Restaurante {
    private String nome;
    private String cnpj;
    private Menu menu = new Menu();

    public Restaurante(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Menu getMenu() {
        return menu;
    }

    public String getCnpj() {
        return cnpj;
    }
}