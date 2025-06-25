import java.time.LocalDate;
import java.util.ArrayList;

public class Cão {
    
    private String nome;
    private LocalDate data_entrada;
    private Raça raça;
    private String cor;
    private float peso;
    static int qtd = 0;
    

    public Cão() {
        qtd++;
    }


    public Cão(String nome, LocalDate data_entrada, Raça raça, String cor, float peso) {
        this.nome = nome;
        this.data_entrada = data_entrada;
        this.raça = raça;
        this.cor = cor;
        this.peso = peso;
        qtd++;
    }


    public void qtd_desnutridos(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getPeso() <= 20){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de cachorros desnutridos: "+qtd);

    }


    public void qtd_viralata(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getRaça().equals(Raça.VIRA_LATA)){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de cachorros no sistema com a raça Vira Lata: " + qtd);

    }


    public void qtd_cao_amarelos(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getCor().equals("Amarela")){
                qtd++;
            }
        }
        System.out.println("\nQuantidade de cachorros com a cor amarela: " + qtd + "\n\n");

    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getData_entrada() {
        return data_entrada;
    }
    public void setData_entrada(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }
    public Raça getRaça() {
        return raça;
    }
    public void setRaça(Raça possui_raça) {
        this.raça = possui_raça;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static int getQtd() {
        return qtd;
    }

}
