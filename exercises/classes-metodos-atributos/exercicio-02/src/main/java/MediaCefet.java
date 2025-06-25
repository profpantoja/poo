import java.util.Scanner;

public class MediaCefet {
    
    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner in = new Scanner (System.in);

    double n1, n2, pf, media;
            
    System.out.println("Digite a primeira nota");
    n1 = in.nextDouble();
    while (n1 > 10) {
        System.out.println("Nota inválida! Digite novamente!");
        n1 = in.nextDouble();
    }

    System.out.println("Digite a segunda nota");
    n2 = in.nextDouble();
    while (n2 > 10) {
        System.out.println("Nota inválida! Digite novamente!");
        n2 = in.nextDouble();
    }    

    media = (n1+n2)/2;

    if (media >= 7) {
        System.out.println("Aluno aprovado");
    }

    else if (media < 2){
        System.out.println("Aluno reprovado! ");
    }

    else{
        System.out.println("Aluno está de prova final, Digite a nota da PF: ");
        pf = in.nextDouble();
        while (pf > 10) {
            System.out.println("Nota inválida! Digite novamente!");
            pf = in.nextDouble();
        }
        media = (media+pf)/2;
        if (media >= 5) {
            System.out.println("Aluno aprovado! ");
        }

        else {
            System.out.println("Aluno reprovado! ");
        }
    }
    System.out.println("\nMédia final: " + media);
    
    }
}
