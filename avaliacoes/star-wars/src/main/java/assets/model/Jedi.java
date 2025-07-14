package assets.model;
import java.util.ArrayList;


public class Jedi extends Pessoa implements Force {

    private ArrayList<Weapon> weapons;

    public Jedi() {
        super();
        this.weapons = new ArrayList<>();
    }

    public Jedi(String nome, String sobrenome, String sexo, String titulo) {
        super(nome, sobrenome, sexo, titulo);
        this.weapons = new ArrayList<>();
    }


    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void mindControl() {
        System.out.println("[Jedi]: Do what I wish");
    
    }

    @Override
    public void farseeing() {
        System.out.println("[Jedi]: Visão amplificada");
    }

    @Override
    public void telepath() {
        System.out.println("[Jedi]: Telepatia ativada");
    }

    @Override
    public void levitation() {
        System.out.println("[Jedi]: Levitação ativada");
    }

    public void patience() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome()).append(";")
        .append(getSobrenome()).append(";")
        .append(getSexo()).append(";")
        .append(getTitulo()).append(";");

        for (int i = 0; i < weapons.size(); i++) {
            sb.append(weapons.get(i).toString());
            if (i < weapons.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }    
    public static Jedi fromString(String linha) {
        String[] partes = linha.split(";");
        if (partes.length >= 4) {
            // partes[0]: nome, partes[1]: sobrenome, partes[2]: sexo, partes[3]: titulo
            Jedi jedi = new Jedi(partes[0], partes[1], partes[2], partes[3]);

            if (partes.length == 5) {
                String[] armas = partes[4].split(",");
                ArrayList<Weapon> listaArmas = new ArrayList<>();
                for (String nomeArma : armas) {
                    listaArmas.add(Weapon.fromString(nomeArma));//totonhio precisar fazer isso | feito padrinho
                }
                jedi.setWeapons(listaArmas);
            }

            return jedi;
        }
        return null;
}
    

}