public class MadCat extends Personagens{
    
    private String nome;
    private float dano_recebido;

    public MadCat() {
    }

    public MadCat(float energia, String nome) {
        super(energia);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDano_recebido() {
        return dano_recebido;
    }

    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }

    

}
