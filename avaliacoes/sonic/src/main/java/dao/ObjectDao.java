package dao;

import model.Object;
import model.TipoObjeto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectDao {
    private static final String FILE = "objects.txt";

    public void create(Object o) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true));
        bw.write(o.getName() + "," + o.getImage() + "," + o.getX() + "," + o.getY() + "," + o.getTipo());
        bw.newLine();
        bw.close();
        
    }

    public List<Object> read() throws NumberFormatException, IOException {
        List<Object> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(",");
                if (p.length == 5) {
                    Object object = new Object(p[0], p[1], Integer.parseInt(p[2]), Integer.parseInt(p[3]), TipoObjeto.valueOf(p[4]));
                    list.add(object);
                }
            }
        br.close();
        return list;
    }

    public void DeleteByName(String nome) throws IOException {
        List<Object> objetos = read();
        for (int i = 0; i < objetos.size(); i++) {
            Object o = objetos.get(i);
            if (o.getName().equals(nome)) {
                objetos.remove(i);
            break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
            for (Object object : objetos) {
                bw.write(object.getName() + "," + object.getImage() + "," + object.getX() + "," + object.getY() + "," + object.getTipo());
                bw.newLine();
            }
        bw.close();
    }
}
