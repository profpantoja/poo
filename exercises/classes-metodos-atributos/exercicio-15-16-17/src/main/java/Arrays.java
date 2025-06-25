import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public Arrays() {
    }

    public static void crescente(ArrayList<Float> num){
        System.out.println("\nORDEM CRESCENTE: ");
        Collections.sort(num);
        for (Float n : num) {
            System.out.println(n);
        }
    }

    public static void decrescente(ArrayList<Float> num) {
        System.out.println("\nORDEM DECRESCENTE: ");
        Collections.sort(num, Collections.reverseOrder());
        for (Float n : num) {
            System.out.println(n);
        }
    }


    public static void maiornum(ArrayList<Float> num){
        
        float maior = num.get(0), numatual;

        for (int i = 1; i < num.size(); i++) {
            numatual = num.get(i);
            if (numatual > maior) {
                maior = numatual;
            }
        }

        System.out.println("\nMaior número: " + maior);

    }


    public static void menornum(ArrayList<Float> num){
        
        float menor = num.get(0), numatual;

        for (int i = 1; i < num.size(); i++) {
            numatual = num.get(i);
            if (numatual < menor) {
                menor = numatual;
            }
        }

        System.out.println("\nMenor número: " + menor);
    }


    public static void media(ArrayList<Float> num){
        
        float media = 0;

        for (int i = 0; i < num.size(); i++) {
            media = media + num.get(i);
        }

        media = media/num.size();

        System.out.println("\nMédia: " + media);

    }

    public static void desviopadrão(ArrayList<Float> num){

        float media = 0, soma = 0, dp; 

        for (int i = 0; i < num.size(); i++) {
            media = media + num.get(i);
        }

        media = media/num.size();

        for (int i = 0; i < num.size(); i++) {
            soma = (float) (soma + (Math.pow(num.get(i)-media, 2)));
        }

        dp = soma/num.size();
        
        dp = (float) Math.sqrt(dp);

        System.out.println("\nDesvio padrao: " + dp + "\n");

    }


    public static void inverter(ArrayList<String> texto){
        System.out.println("\nOrdem invertida Array: ");
        Collections.reverse(texto);
        for (String t : texto) {
            System.out.println(t);
        }
    }
    
    
}





    