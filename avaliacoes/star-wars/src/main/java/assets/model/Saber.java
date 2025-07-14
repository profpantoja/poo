package assets.model;
public class Saber extends Weapon {

    public Saber(String descricao, int dano, String owner) {
        super(descricao, dano, owner);
    }

    public void slash() {
        System.out.println("O sabre " + this.getDescricao() + " atacou!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getOwner()).append(";").append(getDescricao()).append(";").append(getDano()).append(";");
        return sb.toString();
    }

    public static Saber fromString(String linha) {
        String[] partes = linha.split(";");
        if (partes.length >= 3) {
            String dono = partes[0].trim();
            String descricao = partes[1].trim();
            int dano;
            try {
                dano = Integer.parseInt(partes[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("Dano inválido. Por favor, insira um número inteiro.");
                return null;
            }
            return new Saber(descricao, dano, dono);
        } else {
            System.out.println("Formato inválido para o Sabre.");
            return null;
        }
        
    }

}