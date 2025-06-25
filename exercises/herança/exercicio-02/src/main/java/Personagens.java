import java.util.ArrayList;

public class Personagens {

    private float energia;

    public Personagens() {
    }

    public Personagens(float energia) {
        this.energia = energia;
    }

    public float status(ArrayList<Poder> poder, String nome, float dano_recebido, float energiainimigo){

        if (dano_recebido != 0) {
            if (dano_recebido == poder.get(0).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(0).getPoder());
            }
            else if (dano_recebido == poder.get(1).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(1).getPoder());
            }
            if (dano_recebido == poder.get(2).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(2).getPoder());
            }
    
            energiainimigo = energiainimigo - dano_recebido;
    
            if (energiainimigo <= 0){
                System.out.println("O "+nome+" morreu!");
                return energiainimigo;
            }
            else {
                System.out.println("O "+nome+" sobreviveu ao dano!");
                System.out.println("Quantidade de energia do "+nome+": " +energiainimigo);
                return energiainimigo;
            }
        }
        else {
            System.out.println("\nO "+nome+" nao recebeu dano!");
            return energiainimigo;
        }

        

    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

}
