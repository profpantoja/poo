import java.util.Scanner;

public class MainAutomovel {
    
    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);

    Automovel carro1 = new Automovel("Fiat", "Uno", 2013, 2015, "branco", 10);
    Automovel carro2 = new Automovel("Renoult", "kwid", 2017, 2020,"cinza", 35);

    carro1.AddKm(40.2f);
    carro2.AddKm(30.5f);

    carro1.setMarca("Honda");
    System.out.println(carro1.getMarca());

    System.out.println("\nQuilometragem total carro 1: " + carro1.KmTotal());
    System.out.println("Quilometragem total carro 2: " +carro2.KmTotal());

    carro1.VelMedia(252, 152);
    carro2.VelMedia(42, 35);

    int cont = 0, c1 = 0, c2 = 0;

    while (cont != 3) {
        System.out.println("\n\n+-----------------------------+");
        System.out.println("|            MENU             |");
        System.out.println("+-----------------------------+");
        System.out.println(" 1 - " + carro1.getMarca());
        System.out.println(" 2 - " + carro2.getMarca());
        System.out.println(" 3 - sair ");
        System.out.println("+-----------------------------+\n");
        cont = in.nextInt();

        switch (cont) {
            case 1:

                while (c1 != 5) {

                    System.out.println("\n+-----------------------------+");
                    System.out.println("|           CARRO 1           |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" Marca: " + carro1.getMarca());
                    System.out.println(" Modelo: " + carro1.getModelo());
                    System.out.println(" Cor: " + carro1.getCor());
                    System.out.println(" Ano de fabricaçao: " + carro1.getAno_fabricacao());
                    System.out.println("+-----------------------------+\n");
                    System.out.println(" 1 - Acelerar");
                    System.out.println(" 2 - Frear");
                    System.out.println(" 3 - Ir para direita");
                    System.out.println(" 4 - Ir para esquerda");
                    System.out.println(" 5 - Sair");
                    c1 = in.nextInt();

                    switch (c1) {
                        case 1:
                            carro1.Acelerar(carro1.getMarca());
                            break;
                        case 2:
                            carro1.Frear(carro1.getMarca());
                            break;
                        case 3:
                            carro1.Direita(carro1.getMarca());
                            break;
                        case 4:
                            carro1.Esquerda(carro1.getMarca());
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }
                c1 = 0;
                break;

            case 2:

                while (c2 != 5) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|           CARRO 2           |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" Marca: " + carro2.getMarca());
                    System.out.println(" Modelo: " + carro2.getModelo());
                    System.out.println(" Cor: " + carro2.getCor());
                    System.out.println(" Ano de fabricaçao: " + carro2.getAno_fabricacao());
                    System.out.println("+-----------------------------+\n");
                    System.out.println(" 1 - Acelerar");
                    System.out.println(" 2 - Frear");
                    System.out.println(" 3 - Ir para direita");
                    System.out.println(" 4 - Ir para esquerda");
                    System.out.println(" 5 - Sair");
                    c2 = in.nextInt();

                    switch (c2) {
                        case 1:
                            carro2.Acelerar(carro2.getMarca());
                            break;
                        case 2:
                            carro2.Frear(carro2.getMarca());
                            break;
                        case 3:
                            carro2.Direita(carro2.getMarca());
                            break;
                        case 4:
                            carro2.Esquerda(carro2.getMarca());
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Código inválido!");
                    }
                }
                c2 = 0;
                break;

            case 3:
                System.out.println("\nSaindo do programa...");
                break;

            default:
                System.out.println("\nCódigo inválido!");
        }
    }
    
    }
}