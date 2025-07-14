package assets.model;
public class Weapon {

    private String owner;
    private String descricao;
    private int dano;
    
    public Weapon(String descricao, int dano, String owner) {

        this.descricao = descricao;
        this.dano = dano;
        this.owner = owner;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Weapon drop() {
        return this;
    }

    public Weapon pickUp() {
        return this;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(owner).append(" ").append(descricao).append(" com dano ").append(dano);
        return sb.toString();
    }

    public static Weapon fromString(String nomeArma) {
        String[] partes = nomeArma.split(" com dano ");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Formato inválido para Weapon: " + nomeArma);
        }
        String dono = partes[0].trim();
        String descricao = partes[1].trim();
        int dano;
        try {
            dano = Integer.parseInt(partes[2].trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Dano inválido: " + partes[2].trim());
        }
        return new Weapon(descricao, dano, dono);
    }

}
