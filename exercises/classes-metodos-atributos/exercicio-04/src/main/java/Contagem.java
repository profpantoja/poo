import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            int cont;

            System.out.println("Como você deseja a contagem?\n\n1 - Crescente\n2 - Decrescente\n");
            cont = in.nextInt();

            System.out.println(" ");

            if (cont == 1){
                for (int i = 0; i <= 10; i++){
                    System.out.println(i);
                }
            }

            else if (cont == 2){
                for (int i = 10; i >= 0; i--){
                    System.out.println(i);
                }
            }
            else {
                System.out.println("Número incorreto!");
            }
            
            
    }
    }
    
}
