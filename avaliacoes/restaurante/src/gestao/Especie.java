package gestao;

public class Especie extends Pagamento{
    public float troco(float valorPago, float valorPedido){
        float trocoF;
        trocoF = valorPedido - valorPago; 

        return trocoF;
    }
}