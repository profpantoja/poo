public class Saber extends Weapon {

    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }

    public void slash() {
        System.out.println("O sabre " + this.getDescricao() + " atacou!");
    }

}