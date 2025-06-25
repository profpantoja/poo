import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Mercadoria {

    private String nome;
    private float valor;
    private float valor_c_juros;
    private LocalDate validade;
    private Fornecedor fornecedor;

    private static int qtd_itens_total = 0;
    private float valor_total = 0;

    public Mercadoria() {
    }
    
    public Mercadoria(String nome, float valor, LocalDate validade, Fornecedor fornecedor) {

        LocalDate hoje = LocalDate.now();

        if (hoje.compareTo(validade) <= 0){

            this.nome = nome;
            this.valor = valor;

            this.valor_c_juros = valor + ((30*valor)/100);

            this.validade = validade;
            this.fornecedor = fornecedor;

            System.out.println("O item " + nome + " foi adicionado no carrinho com sucesso!\n");

            qtd_itens_total++;
        }
        else {
            System.out.println("\nERRO! \nO item " + nome + " passou da validade!\n");
        }
    }

    public void qtd_itens_total(){
        System.out.println("\n QUANTIDADE DE PRODUTOS: " + getQtd_itens_total());
    }

    public void calc_valor_total(float valor, int qtd){
        this.valor_total = this.valor_total + (valor*qtd);
    }

    public void valor_total(){
        System.out.println(" VALOR TOTAL: " + this.valor_total);
        System.out.println("+-------------------------------+\n\n");
        
    }

    public void qtd_por_produto(ArrayList<Mercadoria> mercadoria){

        System.out.println("+-------------------------------+");
        System.out.println("|           CARRINHO            |");
        System.out.println("+-------------------------------+");

        Set<String> produtosVisitados = new HashSet<>(); // Conjunto para armazenar produtos já visitados

        for (int i = 0; i < mercadoria.size(); i++) {

            String nome = mercadoria.get(i).getNome();
            float valor = mercadoria.get(i).getValor();
            String fornecedor = mercadoria.get(i).getFornecedor().getNome();

            if (!produtosVisitados.contains(nome + fornecedor)) {
                int tam = 0;

                for (Mercadoria produto : mercadoria) {

                    if (produto.getNome().equals(nome) && produto.getFornecedor().getNome().equals(fornecedor)) {
                        tam++;
                    }

                }

                System.out.println(" "+ nome + "     -  " + tam + "x");
                calc_valor_total( valor, tam);

                produtosVisitados.add(nome + fornecedor); // Adiciona o produto ao conjunto de produtos visitados
            }
        }
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor_c_juros() {
        return valor_c_juros;
    }
    public void setValor_c_juros(float valor_c_juros) {
        this.valor_c_juros = valor_c_juros;
    }
    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public static int getQtd_itens_total() {
        return qtd_itens_total;
    }
    
}


