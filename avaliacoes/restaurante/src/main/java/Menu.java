import java.util.List;

public class Menu {
    
    private List<Produto> produtos;
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String nomeFantasia;

    public Menu(List<Produto> produtos, String nome, String fantasia, String cnpj, Endereco endereco) {
        setProdutos(produtos);
        setCnpj(cnpj);
        setNome(nome);
        setNomeFantasia(fantasia);
        setEndereco(endereco);
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    public void exibirMenu() {
        System.out.println("======= MENU DE " + nomeFantasia + " =======");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$" + String.format("%.2f", produto.getValProduto()) +
                               " (com IVA: R$" + String.format("%.2f", produto.getPrecoComIva()) + ")");
        }
        System.out.println("=====================================");
    }
}
