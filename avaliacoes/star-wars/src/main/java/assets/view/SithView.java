package assets.view;


import java.util.Scanner;

import assets.model.Sith;
public class SithView {
    private static Scanner sc = new Scanner(System.in);
        public static String getSithNome() {
            System.out.println("Nome do Sith: "  );
            String nome = sc.nextLine();
            return nome ;

        }

        public static String getSithSobrenome() {
            System.out.println("Sobrenome do Sith: " );
            String sobrenome = sc.nextLine();
            return sobrenome;
        }


        public static String getSithSexo() {
            System.out.println("Sexo do Sith: "  );
            String sexo = sc.nextLine();
            return sexo;
        }
        public static String getSithTitulo() {
            System.out.println("Titulo do Sith: "  );
            String titulo = sc.nextLine();
            return titulo;
        }

        public void displaySith(Sith sith) {
            System.out.println("Nome: " + sith.getNome());
            System.out.println("Sobrenome: " + sith.getSobrenome());
            System.out.println("Sexo: " + sith.getSexo());
            System.out.println("Titulo: " + sith.getTitulo());
        }

        public void displayAllSiths(Sith[] siths) {
            for (Sith sith : siths) {
                displaySith(sith);
            }
        }

}
