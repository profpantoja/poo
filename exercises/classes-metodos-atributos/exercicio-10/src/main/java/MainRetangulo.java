public class MainRetangulo {

    public static void main(String[] args) {

    Retangulo r1 = new Retangulo(3,7);
    Retangulo r2 = new Retangulo(3.5f,4);
    Retangulo r3 = new Retangulo(6,8);
    
    System.out.println("Triângulo 1\nPerímetro: " + r1.perimetro(r1.getBase(),r1.getAltura()) + "\nAréa: " + r1.area(r1.getBase(),r1.getAltura()));
    System.out.println("\nTriângulo 2\nPerímetro: " + r2.perimetro(r2.getBase(),r2.getAltura()) + "\nAréa: " + r2.area(r2.getBase(),r2.getAltura()));
    System.out.println("\nTriângulo 3\nPerímetro: " + r3.perimetro(r3.getBase(),r3.getAltura()) + "\nAréa: " + r3.area(r3.getBase(),r3.getAltura()));
    }
    
}
