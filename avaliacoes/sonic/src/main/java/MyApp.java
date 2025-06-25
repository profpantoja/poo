import java.util.ArrayList;

import model.Character;
import model.Direction;
import model.Environment;
import model.Monkey;
import model.Object;
import model.Sonic;
import model.Tails;
import model.TipoObjeto;

public class MyApp {
    public static void main(String[] args) {

        Character sonic = new Character("Sonic", 3, "caminho/generico/de/imagem/personagem1", 20, 30);
        Character tails = new Character("Tails", 3, "caminho/generico/de/imagem/personagem2", 30, 30);
        Character monkey = new Character("Monkey", 3, "caminho/generico/de/imagem/personagem3", 50, 70);

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(sonic);
        characters.add(tails);
        characters.add(monkey);

        Environment hillTopZone = new Environment("Hill Top Zone", "caminho/generico/de/imagem/Ambiente1", 1600, 900, 0,
                0, 0);
        hillTopZone.setCharacters(characters);

        Object ring1 = new Object("ring1", "caminho/generico/de/imagem/objeto1", 20, 70, TipoObjeto.RING);
        Object ring2 = new Object("ring2", "caminho/generico/de/imagem/objeto2", 30, 70, TipoObjeto.RING);
        Object ring3 = new Object("ring3", "caminho/generico/de/imagem/objeto3", 40, 70, TipoObjeto.RING);

        Object box = new Object("box", "caminho/generico/de/imagem/objeto4", 70, 30, TipoObjeto.BOX);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(ring1);
        objects.add(ring2);
        objects.add(ring3);
        objects.add(box);

        hillTopZone.setObjects(objects);

        hillTopZone.showCharacters();;
        hillTopZone.showObjects();
        hillTopZone.showPanel();

        Tails tails2 = new Tails("Tails", 3, "caminho/generico/de/imagem/personagem2", 30, 30);

        tails2.mover(Direction.UP);

        Monkey monkey2 = new Monkey("Monkey", 3, "caminho/generico/de/imagem/personagem3", 50, 70);

        monkey2.mover(Direction.UP);

        Sonic sonic2 = new Sonic("Sonic", 3, "caminho/generico/de/imagem/personagem1", 50, 68);

        sonic2.mover(Direction.UP);

        hillTopZone.colidiu(sonic2, tails2, monkey2);

    }
}
