public class Blast extends Weapon {

    public Blast(String descricao, int dano) {
        super(descricao, dano);
    }

    public void shot() {
        System.out.println("O blaster " +this.getDescricao() + " atirou!");
    }

}