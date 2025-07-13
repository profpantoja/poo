public class Produto {
    private String nome;
    private float preco;
    private float iva;

    public Produto(String nome, float preco, float iva) {
        this.nome = nome;
        this.preco = preco;
        this.iva = iva;
    }

    public String getNome() { 
        return nome; }
    public void setNome(String nome) { 
        this.nome = nome; }
    public float getPreco() {
         return preco; }
    public void setPreco(float preco) {
         this.preco = preco; }
    public float getIva() {
         return iva; }
    public void setIva(float iva) {
         this.iva = iva; }
} 