import java.util.Scanner;

public class RaizBaskara {

    public static void main(String[] args) {
    
    @SuppressWarnings("resource")
    Scanner in = new Scanner (System.in);

    Float a, b, c, x1, x2, delta;
    
    System.out.println("Digite o coeficiente A");
    a = in.nextFloat();
    
    System.out.println("Digite o coeficiente B");
    b = in.nextFloat();

    System.out.println("Digite o coeficiente C");
    c = in.nextFloat();

    delta = (b*b) -4 * a * c;

    delta = (float) Math.sqrt(delta);
    
    x1 = (-b + delta) / (2*a);
    x2 = (-b - delta) / (2*a);

    if ( Float.isNaN(x1) || Float.isNaN(x2)) {
        System.out.println("\nO delta nao possui raízes reais ");
    }
    else {
        System.out.println("\nAs raízes do Báskara sao " +x1+ " e " +x2);
    }

    }
}
