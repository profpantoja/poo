import java.util.ArrayList;

public class Kate extends Personagens{

    private int qtd_vida;
    private ArrayList<Poder> poder;
    private int poder_atual = 0;

    public Kate() {
        this.poder = new ArrayList<Poder>();
    }

    public Kate(float energia, int qtd_vida) {
        super(energia);
        this.qtd_vida = qtd_vida;
    }

    public void pular() {
        System.out.println("\nA kate pulou!");
    }

    public void andar() {
        System.out.println("\nA kate andou!");
    }


    public void alterarpoder(int poder_atual) {
        this.poder_atual = poder_atual;
    }

    public float poder(ArrayList<Poder> poder) {
        float dano = poder.get(poder_atual).getDano();;
        return dano;
    }

    public int getQtd_vida() {
        return qtd_vida;
    }

    public void setQtd_vida(int qtd_vida) {
        this.qtd_vida = qtd_vida;
    }

    public ArrayList<Poder> getPoder() {
        return poder;
    }

    public void setPoder(ArrayList<Poder> poder) {
        this.poder = poder;
    }  

}
