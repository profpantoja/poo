import java.util.List;

public class Restaurante {
    private List<Produto> produtos;
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String nomeFantasia;

    
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;
    private List<Mesa> mesas;
    
    public Restaurante(
        String nome,
        String cnpj,
        Endereco endereco,
        String nomeFantasia
    ){
        setNome(nome);
        setNomeFantasia(nomeFantasia);
        setCnpj(cnpj);
        setEndereco(endereco);
    }
    
    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public List<Cliente> getClientes() {
        return this.clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Mesa> getMesas() {
        return this.mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void addMesa(Mesa mesa){
        this.mesas.add(mesa);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
