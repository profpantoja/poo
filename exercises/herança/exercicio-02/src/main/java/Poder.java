public class Poder {

    private String poder;
    private float dano;
    public static int qtd_instancia = 0;

    public Poder() {
        qtd_instancia++;
    }

    public Poder(String poder, float dano) {
        if (qtd_instancia >= 4) {
            System.out.println("Erro de instância, a Kate só pode ter até 4 poderes! apartir do 4 poder, ele nao será instanciado! por favor remova");
        }
        else {
            this.poder = poder;
            this.dano = dano;
            qtd_instancia++;
        }
    }

    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    public float getDano() {
        return dano;
    }
    public void setDano(float dano) {
        this.dano = dano;
    }
 
}
