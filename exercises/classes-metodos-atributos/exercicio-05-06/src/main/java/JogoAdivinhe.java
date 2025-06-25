import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhe {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Random rand = new Random();

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        int numdesc = rand.nextInt(100);
        int num, max = 100, min = 0, qtdtent = 1;

        System.out.println("BEM VINDO ao jogo adivinhe o número entre 0 e 100!\n\nDigite um número: ");
        num = in.nextInt();

        while (num != numdesc) {

            if (num > numdesc) {
                max = num;
            }

            if (num < numdesc) {
                min = num;
            }

            System.out.println("\nErrou! \nMáx: " + max + "\nmin: " + min + "\n\nDigite um número: ");
            num = in.nextInt();
            qtdtent++;
        }

        System.out.println("\nParabéns, você acertou!");
        System.out.println("Números de tentativas: " + qtdtent);

        if (qtdtent == 1) {
            System.out.println("Você é excelente!");
        }

        else if (qtdtent <= 10) {
            System.out.println("Você é bom!");
        }

        else if (qtdtent <= 20) {
            System.out.println("Você nao foi tao bem!");
        }

        else if (qtdtent > 20) {
            System.out.println("Você precisa praticar mais!");
        }
    }
}
