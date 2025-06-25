import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);

        Automovél automovél = new Automovél("27645898723", "SFG7823");
        Avião avião = new Avião("3439845");
        Barco barco = new Barco("2345678");

        int cont = 0;
        int aut = 0;
        int b = 0;
        int av = 0;

        while (cont != 4) {
            System.out.println("\n+-----------------------------+");
            System.out.println("|            MENU             |");
            System.out.println("+-----------------------------+");
            System.out.println("1 - Automovél");
            System.out.println("2 - Barco");
            System.out.println("3 - Aviao");
            System.out.println("4 - Sair");
            System.out.println("+-----------------------------+\n");
            cont = in.nextInt();

            switch (cont) {

                case 1:

                    while (aut != 8) {
                        
                        System.out.println("\n+-----------------------------+");
                        System.out.println("|          AUTOMOVEL          |");
                        System.out.println("+-----------------------------+");
                        System.out.println(" Renavan: " + automovél.getRenavam());
                        System.out.println(" Placa: " + automovél.getPlaca());
                        System.out.println("+-----------------------------+");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Movimentar para frente");
                        System.out.println("3 - Movimentar de ré");
                        System.out.println("4 - Parar");
                        System.out.println("5 - Passar marcha");
                        System.out.println("6 - Frear");
                        System.out.println("7 - Desligar");
                        System.out.println("8 - Sair");
                        System.out.println("+-----------------------------+\n");
                        aut = in.nextInt();

                        switch (aut) {
                            case 1:
                                automovél.ligar();
                                break;
                            case 2:
                                automovél.mover_frente();
                                break;
                            case 3:
                                automovél.mover_re();
                                break;
                            case 4:
                                automovél.parar();
                                break;
                            case 5:
                                automovél.passar_marcha();
                                break;
                            case 6: 
                                automovél.frear();
                                break;
                            case 7:
                                automovél.desligar();
                                break;
                            case 8:
                                break;
                            default: 
                                System.out.println("Número inválido!");
                        }
                    }
                    aut = 0;
                    break;

                case 2:

                while (b != 9) {
                        
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|            BARCO            |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" Registro embarcaçao: " + barco.getRegistro_embarcação());
                    System.out.println("+-----------------------------+");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Movimentar para frente");
                    System.out.println("3 - Movimentar de ré");
                    System.out.println("4 - Parar");
                    System.out.println("5 - Navegar");
                    System.out.println("6 - Ancorar");
                    System.out.println("7 - Desancorar");
                    System.out.println("8 - Desligar");
                    System.out.println("9 - Sair");
                    System.out.println("+-----------------------------+\n");
                    b = in.nextInt();

                    switch (b) {
                        case 1:
                            barco.ligar();
                            break;
                        case 2:
                            barco.mover_frente();
                            break;
                        case 3:
                            barco.mover_re();
                            break;
                        case 4:
                            barco.parar();
                            break;
                        case 5:
                            barco.navegar();
                            break;
                        case 6: 
                            barco.ancorar();
                            break;
                        case 7:
                            barco.desancorar();
                            break;
                        case 8:
                            barco.desligar();
                            break;
                        case 9:
                            break;
                        default: 
                            System.out.println("Número inválido!");
                    }
                }
                b = 0;
                break;

                case 3:

                while (av != 8) {
                        
                    System.out.println("\n+-------------------------------+");
                    System.out.println("|             AVIAO             |");
                    System.out.println("+-------------------------------+");
                    System.out.println(" Registro aeronaútico: " + avião.getRegistro_aeronaútico());
                    System.out.println("+-------------------------------+");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Movimentar para frente");
                    System.out.println("3 - Movimentar de ré");
                    System.out.println("4 - Parar");
                    System.out.println("5 - Decolar");
                    System.out.println("6 - Pousar");
                    System.out.println("7 - Desligar");
                    System.out.println("8 - Sair");
                    System.out.println("+-----------------------------+\n");
                    av = in.nextInt();

                    switch (av) {
                        case 1:
                            avião.ligar();
                            break;
                        case 2:
                            avião.mover_frente();
                            break;
                        case 3:
                            avião.mover_re();
                            break;
                        case 4:
                            avião.parar();
                            break;
                        case 5:
                            avião.decolar();
                            break;
                        case 6: 
                            avião.pousar();
                            break;
                        case 7:
                            avião.desligar();
                            break;
                        case 8:
                            break;
                        default: 
                            System.out.println("Número inválido!");
                    }
                }
                av = 0;
                break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default: 
                    System.out.println("Número inválido!");
            }
        }
    }
}
