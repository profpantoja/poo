import java.time.LocalDate;
import java.time.Period;

public class NotaFiscal {

    private String numero;
    private LocalDate data_compra;
    private float valor;
    private String nome_comprador, endereco_comprador, telefone_comprador, cpf_comprador;
    private boolean pagamento_realizado;
    private int qtd_dias;

    public NotaFiscal() {
    }

    public NotaFiscal(String numero, LocalDate data_compra, float valor, String nome_comprador,
            String telefone_comprador, String cpf_comprador) {
        this.numero = numero;
        this.data_compra = data_compra;
        this.valor = valor;
        this.nome_comprador = nome_comprador;
        this.telefone_comprador = telefone_comprador;
        this.cpf_comprador = cpf_comprador;
    }

    public float juros(float valor, LocalDate data_compra){

        LocalDate data_atual = LocalDate.now();
        Period periodo = Period.between(data_compra, data_atual);
        qtd_dias = periodo.getDays();

        for (int i = 0; i <= qtd_dias; i++) {
            valor = valor + ((0.95f * valor)/100);
        }

        return valor;
    }


    public void visualizar_nota(NotaFiscal nf, float juros){

        System.out.println("\n+-------------------------------------+");
        System.out.println("|             NOTA FISCAL             |");
        System.out.println("+-------------------------------------+");
        System.out.println(" Número " + nf.getNumero());
        System.out.println(" Data da compra : " + nf.getData_compra());

        System.out.println("\n COMPRADOR: \n Nome: " + nf.getNome_comprador());
        System.out.println(" Cpf: " + nf.getCpf_comprador());
        System.out.println(" Endereço: " + nf.getEndereco_comprador());
        System.out.println(" Telefone: " + nf.getTelefone_comprador());

        System.out.println("\n Valor subtotal: " + nf.getValor());

        if (nf.isPagamento_realizado() == true){
            System.out.println(" Status: Pago");
        }
        else {
            System.out.println("\n Status: Aguardando pagamento ");
            System.out.println("         Dias de atraso: " + qtd_dias);
        }

        System.out.println("\n TOTAL C/ JUROS: "+ juros);
        System.out.println("+-------------------------------------+\n\n");

    }
    

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public LocalDate getData_compra() {
        return data_compra;
    }
    public void setData_compra(LocalDate data_compra) {
        this.data_compra = data_compra;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getNome_comprador() {
        return nome_comprador;
    }
    public void setNome_comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }
    public String getEndereco_comprador() {
        return endereco_comprador;
    }
    public void setEndereco_comprador(String endereco_comprador) {
        this.endereco_comprador = endereco_comprador;
    }
    public String getTelefone_comprador() {
        return telefone_comprador;
    }
    public void setTelefone_comprador(String telefone_comprador) {
        this.telefone_comprador = telefone_comprador;
    }
    public String getCpf_comprador() {
        return cpf_comprador;
    }
    public void setCpf_comprador(String cpf_comprador) {
        this.cpf_comprador = cpf_comprador;
    }
    public boolean isPagamento_realizado() {
        return pagamento_realizado;
    }
    public void setPagamento_realizado(boolean pagamento_realizado) {
        this.pagamento_realizado = pagamento_realizado;
    }

    



    
}
