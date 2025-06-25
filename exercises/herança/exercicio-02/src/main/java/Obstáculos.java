public class Obstáculos extends Personagens{

    private String nome;
    private String material;

    public Obstáculos() {
    }

    public Obstáculos(String nome, float energia, String material) {
        super(energia);
        this.nome = nome;
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
