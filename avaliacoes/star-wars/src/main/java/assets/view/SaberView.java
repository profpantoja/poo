package assets.view;

import java.util.Scanner;

import assets.model.Saber;

public class SaberView {
    private static Scanner sc = new Scanner(System.in);

    /* 
    public static String getSaber() {
        System.out.println("Dono do Sabre: ");
        String dono = sc.nextLine();
        System.out.println("Cor do Sabre: ");
        String descricao = sc.nextLine();
        System.out.println("Dano do Sabre: ");
        int dano = sc.nextInt();
        System.out.println("\n");

        return dono + descricao + " com dano " + dano;
    }
    */

    public static String getSaberOwner() {
        System.out.println("Dono do Sabre: ");
        String dono = sc.nextLine();
        return dono;
    }

    public static String getSaberColor() {
        System.out.println("Cor do Sabre: ");
        String cor = sc.nextLine();
        return cor;
    }
    public static String getSaberDamage() {
        System.out.println("Dano do Sabre: ");
        String dano = sc.nextLine();
        return dano;
    }


    public static void displaySaber(Saber saber) {
        System.out.println("Dono: " + saber.getOwner());
        System.out.println("Sabre: " + saber.getDescricao());
        System.out.println("Dano: " + saber.getDano());
    }

    public static void displayAllSabers(Saber[] sabers) {
        for (Saber saber : sabers) {
            displaySaber(saber);
            System.out.println("-------------------");
        }
    }

    public static void slash(Saber saber) {
        saber.slash();
        System.out.println("O Sabre de luz " + saber.getDescricao() + " atacou com dano de " + saber.getDano() + "!");
    }

    public static Saber drop() {
        System.out.println("Sabre de luz descartado");
        return null;
    }

    public static Saber pickUp() {
        System.out.println("Sabre de luz adquirido");
        return null;
    }
}
