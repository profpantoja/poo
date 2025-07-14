package assets.view;


import java.util.Scanner;

import assets.model.Jedi;
public class JediView {
    private static Scanner sc = new Scanner(System.in);
        public static String getJediNome() {
            System.out.println("Nome do Jedi: "  );
            String nome = sc.nextLine();
            return nome ;

        }

        public static String getJediSobrenome() {
            System.out.println("Sobrenome do Jedi: " );
            String sobrenome = sc.nextLine();
            return sobrenome;
        }


        public static String getJediSexo() {
            System.out.println("Sexo do Jedi: "  );
            String sexo = sc.nextLine();
            return sexo;
        }
        public static String getJediTitulo() {
            System.out.println("Titulo do Jedi: "  );
            String titulo = sc.nextLine();
            return titulo;
        }

        public void displayJedi(Jedi jedi) {
            System.out.println("Nome: " + jedi.getNome());
            System.out.println("Sobrenome: " + jedi.getSobrenome());
            System.out.println("Sexo: " + jedi.getSexo());
            System.out.println("Titulo: " + jedi.getTitulo());
        }

        public void displayAllJedis(Jedi[] jedis) {
            for (Jedi jedi : jedis) {
                displayJedi(jedi);
            }
        }

}
