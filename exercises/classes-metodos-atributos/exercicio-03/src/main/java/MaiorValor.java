import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner in = new Scanner (System.in); 

    int n1, n2, n3, maior = 0;
        
    System.out.println("Digite um valor: ");
    n1 = in.nextInt();

    System.out.println("Digite outro valor: ");
    n2 = in.nextInt();

    System.out.println("Digite outro valor: ");
    n3 = in.nextInt();

    if ((n1 > n2) && (n1 > n3)) {
        maior = n1;
    }

    else if ((n2 > n1) && (n2 > n3)) {
        maior = n2;
    }

    else if ((n3 > n1) && (n3 > n2)) {
        maior = n3;
    }
    System.out.println("\nO maior valor é: " + maior);
    }
    
}
