public class Mesa {
    private int numero;
    private boolean ocupada;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() { return numero; }
    public boolean isOcupada() { return ocupada; }
    public void ocupar() { this.ocupada = true; }
    public void desocupar() { this.ocupada = false; }
}