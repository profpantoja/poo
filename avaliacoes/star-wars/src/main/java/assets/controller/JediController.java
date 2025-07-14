package assets.controller;


import java.util.List;

import assets.dao.JediDao;
import assets.model.Jedi;
import assets.view.JediView;
public class JediController {
    private JediDao jediDao;
    private JediView jediView;
    private Jedi jedi;
    
    public JediController() {
        this.jediDao   = new JediDao();    
        this.jediView  = new JediView();
    }
    
    public void createJedi() {
        String nome      = jediView.getJediNome();
        String sobrenome = jediView.getJediSobrenome();
        String sexo      = jediView.getJediSexo();
        String titulo    = jediView.getJediTitulo();
        this.jedi = new Jedi(nome, sobrenome, sexo, titulo);
        jediDao.addJedi(this.jedi);
        jediView.displayJedi(this.jedi);
    }

        
        
        public void showJedi() {
                List<Jedi> jedis = jediDao.getAllJedis();
                if (jedis.isEmpty()) {
                    System.out.println("Nenhum Jedi cadastrado.");
                } else {
                    System.out.println("== Lista de Jedis ==");
                    for (Jedi jedi : jedis) {
                        System.out.println();
                        System.out.println("Nome:"+jedi.getNome() + "\nSobre Nome: " + jedi.getSobrenome() + "\nSexo: "+jedi.getSexo()+" \nTitulo: " + jedi.getTitulo());

                    }
                }
        }
    public Jedi getJediByName(String name) {
        Jedi jedi = jediDao.getJediByName(name);
        if (jedi != null) {
            jediView.displayJedi(jedi);
        } else {
            System.out.println("Jedi não encontrado.");
        }
        return jedi;

    }

    public void showAllJedis(Jedi[] jedis) {
            jediView.displayAllJedis(jedis);
        }

    public void removeJedi() {
        jediDao.removeJedi();
    }



}
