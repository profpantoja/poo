public class ContaCorrente {

    private float saldo;
    private int numero;
    private String cliente;
    private float limite;
    private boolean situacao;

    public ContaCorrente(Float saldo, int numero, String cliente, float limite, boolean situacao){
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.limite = limite;
        this.situacao = situacao;
    }

    public void levantar(float saque){
        if (this.situacao == true) {
            if (saque <= this.saldo){
                this.saldo = this.saldo - saque;
                System.out.println("\nSaque de " +saque+ " reais!\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
            else if(saque <= limite) {
                this.limite = this.limite - saque;
                System.out.println("\nVocê nao possui saldo suficiente, o saque será feito no limite! ");
                System.out.println("\nSaque de " +saque+ " reais!\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
            else {
                System.out.println("\nVocê nao possui saldo e nem limite suficiente!");
                System.out.println("\nTRANSAÇAO CANCELADA");
                System.out.println("\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
            }
        }
        else {
            System.out.println(" Conta inativa! ");
        }
    }

    public void depositar(float deposito){
        if (this.situacao == true) {
            this.saldo = this.saldo + deposito;
            System.out.println("\nValor depositado: "+ deposito+"\nSaldo atual: "+this.saldo+"\nLimite atual: "+ this.limite);
        }
        else {
            System.out.println(" Conta inativa! ");
        }
    }

    public float transferir (float valor, float saldo, String nome, int numero, boolean situacao){
        if ((this.situacao == true) && (situacao == true)) {
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor;
                saldo = saldo + valor;
                System.out.println("\nTranferência de " +valor+ " reais, para "+nome+", Número da conta: "+numero+"\nSeu saldo atual: "+ this.saldo+"\nSeu limite atual: "+ this.limite);
                return saldo;
            }
            else if(valor <= limite) {
                this.limite = this.limite - valor;
                saldo = saldo + valor;
                System.out.println("\nVocê nao possui saldo suficiente, o saque será feito no limite! ");
                System.out.println("\nTranferência de " +valor+ " reais, para "+nome+", Número da conta: "+numero+"\nSeu saldo atual: "+ this.saldo+"\nSeu limite atual: "+ this.limite);
                return saldo;
            }
            else {
                System.out.println("\nVocê nao possui saldo e nem limite suficiente!");
                System.out.println("\nSaldo atual: "+ this.saldo+"\nLimite atual: "+ this.limite);
                return saldo;
            }
        }
        else {
            System.out.println(" Conta inativa! ");
            return saldo;
        }
    }


    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public String getCliente(){
        return cliente;
    }

    public void setLimite(float limite){
        this.limite= limite;
    }
    
    public float getLimite(){
        return limite;
    }

    public void setSituacao(boolean situacao){
        this.situacao = situacao;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
}
