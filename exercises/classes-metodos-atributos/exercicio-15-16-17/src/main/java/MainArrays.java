import java.util.ArrayList;
import java.util.Scanner;

public class MainArrays {

   public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner in = new Scanner (System.in);

    int tam;
    float temp;
    String temp2;


    System.out.println("Digite o tamanho do Array: ");
    tam = in.nextInt();


    ArrayList<Float> num = new ArrayList<>();

    for (int i = 1; i <= tam; i++) {
        System.out.println("Digite um número para o Array");
        temp = in.nextFloat();
        num.add(temp);
    }


    Arrays.crescente(num);
    Arrays.decrescente(num);
    
    Arrays.maiornum(num);
    Arrays.menornum(num);
    Arrays.media(num);
    Arrays.desviopadrão(num);


    ArrayList<String> texto = new ArrayList<>();

    System.out.println("\nDigite o tamanho do Array de texto: ");
    tam = in.nextInt();

    for (int i = 1; i <= tam; i++) {
        System.out.println("Digite um texto para o Array");
        temp2 = in.next();
        texto.add(temp2);
    }
    
    Arrays.inverter(texto);

    }
    
}
