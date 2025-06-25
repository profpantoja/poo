public class BadFish extends Personagens{

    private String nome;
    private float dano_recebido;

    public BadFish() {
    }

    public BadFish(float energia, String cod) {
        super(energia);
        this.nome = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String cod) {
        this.nome = cod;
    }

    public float getDano_recebido() {
        return dano_recebido;
    }

    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }
    
    
}
