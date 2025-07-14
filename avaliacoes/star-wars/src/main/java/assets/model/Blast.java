package assets.model;
public class Blast extends Weapon {

    public Blast(String descricao, int dano, String owner) {
        super(descricao, dano, owner);
    }

    public void shot() {
        System.out.println("O blaster " +this.getDescricao() + " atirou!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getOwner()).append(";").append(getDescricao()).append(";").append(getDano()).append(";");
        return sb.toString();
    }

    public static Blast fromString(String linha) {
        String[] partes = linha.split(";");
        if (partes.length >= 3) {
            // partes[0]: dono, partes[1]: descricao, partes[2]: dano
            String dono = partes[0].trim();
            String descricao = partes[1].trim();
            int dano;
            try {
                dano = Integer.parseInt(partes[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Dano inválido. Por favor, insira um número inteiro.");
                return null;
            }
            return new Blast(descricao, dano, dono);
        } else {
            System.out.println("Formato inválido para o Blaster.");
            return null;
        }
    
    }

}