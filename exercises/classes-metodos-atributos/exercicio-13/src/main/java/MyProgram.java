import java.util.Scanner;
import java.util.ArrayList;

public class MyProgram {

    public static void main(String[] args) {

    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);

    Quarto q = new Quarto();

    Ventilador ventilador1 = new Ventilador(3);
    Ventilador ventilador2 = new Ventilador(2);
    Ventilador ventilador3 = new Ventilador(1);

    ArrayList<Ventilador> vent = new ArrayList<Ventilador>();

    vent.add(ventilador1);
    vent.add(ventilador2);
    vent.add(ventilador3);

    int cont = 0, l = 0, a = 0, tv = 0, v = 0, ar = 0, v1 = 0, v2 = 0, v3 = 0, sinal, velo;
    String texto;

    while (cont != 6) {
        System.out.println("\n\n+-----------------------------+");
        System.out.println("|           QUARTO            |");
        System.out.println("+-----------------------------+");
        System.out.println(" 1 - Lâmpada");
        System.out.println(" 2 - Abajur ");
        System.out.println(" 3 - Ar condicionado ");
        System.out.println(" 4 - Televisao ");
        System.out.println(" 5 - Ventilador");
        System.out.println(" 6 - Sair ");
        System.out.println("+-----------------------------+\n");
        cont = in.nextInt();

        switch (cont) {
            case 1:

                while (l != 3) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|           LAMPADA           |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" 1 - Ligar");
                    System.out.println(" 2 - Desligar ");
                    System.out.println(" 3 - Sair ");
                    System.out.println("+-----------------------------+\n");
                    l = in.nextInt();

                    switch (l) {
                        case 1:
                            q.ligarLampada();
                            break;
                        case 2:
                            q.desligarLampada();
                            break;
                        case 3: 
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }

                l = 0;
                break;

            case 2:

                while (a != 3) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|            ABAJUR           |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" 1 - Ligar");
                    System.out.println(" 2 - Desligar ");
                    System.out.println(" 3 - Sair ");
                    System.out.println("+-----------------------------+\n");
                    a = in.nextInt();

                    switch (a) {
                        case 1:
                            q.ligarAbajur();
                            break;
                        case 2:
                            q.desligarAbajur();
                            break;
                        case 3: 
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }
                
                a = 0;
                break;

            case 3:
                while (ar != 3) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|       AR CONDICIONADO       |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" 1 - Ligar");
                    System.out.println(" 2 - Desligar ");
                    System.out.println(" 3 - Sair ");
                    System.out.println("+-----------------------------+\n");
                    ar = in.nextInt();

                    switch (ar) {
                        case 1:
                            q.ligarArcondicionado();
                            break;
                        case 2:
                            q.desligarArcondicionado();
                            break;
                        case 3: 
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }

                ar = 0;
                break;

            case 4:
                while (tv != 5) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|          TELEVISAO          |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" 1 - Ligar");
                    System.out.println(" 2 - Mudar canal ");
                    System.out.println(" 3 - Mudar sinal ");
                    System.out.println(" 4 - Desligar ");
                    System.out.println(" 5 - Sair ");
                    System.out.println("+-----------------------------+\n");
                    tv = in.nextInt();

                    switch (tv) {
                        case 1:
                            q.ligarTv();
                            break;
                        case 2:
                            System.out.println("\nDigite o canal desejado: ");
                            texto = in.next();
                            q.mudarCanalTv(texto);
                            break;
                        case 3:
                            System.out.println("\n+-----------------------------+");
                            System.out.println("Digite o código do sinal: \n");
                            System.out.println(" 1 - I.E.");
                            System.out.println(" 2 - HDMI ");
                            System.out.println(" 3 - USB ");
                            System.out.println("+-----------------------------+\n");
                            sinal = in.nextInt();

                            switch (sinal) {
                                case 1:
                                    q.mudarSinalTv(Source.IE);
                                    break;
                                case 2:
                                    q.mudarSinalTv(Source.HDMI);
                                    break;
                                case 3:
                                    q.mudarSinalTv(Source.USB);
                                    break;
                                default:
                                    System.out.println("\nCódigo inválido!");
                            }
                            break;

                        case 4:
                            q.desligarTv();
                            break;
                        case 5: 
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }

                tv = 0;
                break;
            
            case 5:   

                while (v != 5) {
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|         VENTILADORES        |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" 1 - Ventilador 1");
                    System.out.println(" 2 - Ventilador 2 ");
                    System.out.println(" 3 - Ventilador 3 ");
                    System.out.println(" 4 - Status dos ventiladores ");
                    System.out.println(" 5 - Sair ");
                    System.out.println("+-----------------------------+\n");
                    v = in.nextInt();

                    switch (v) {
                        case 1:

                            while (v1 != 4) {

                                System.out.println("\n+-----------------------------+");
                                System.out.println("|         VENTILADOR 1        |");
                                System.out.println("+-----------------------------+");
                                System.out.println(" 1 - Ligar");
                                System.out.println(" 2 - Mudar a velocidade ");
                                System.out.println(" 3 - Desligar ");
                                System.out.println(" 4 - Sair ");
                                System.out.println("+-----------------------------+\n");
                                v1 = in.nextInt();

                                switch (v1) {
                                    case 1:
                                        vent.get(0).setStatus(q.ligarVentilador(vent.get(0).isStatus()));
                                        break;
                                    case 2:
                                        System.out.println("\nDigite a velocidade: ");
                                        System.out.println("1 - fraco ");
                                        System.out.println("2 - médio ");
                                        System.out.println("3 - forte \n");
                                        velo = in.nextInt();

                                        while ((velo < 1) || (velo > 3)) {
                                            System.out.println("\nCódigo incorreto! digite novamente! \n");
                                            System.out.println("\nDigite a velocidade: ");
                                            System.out.println("1 - fraco ");
                                            System.out.println("2 - médio ");
                                            System.out.println("3 - forte ");
                                            velo = in.nextInt();
                                        }
                                        
                                        vent.get(0).setVelocidade(velo);

                                        System.out.println("\nA velocidade do ventilador foi alterada para " + velo);
                                        break;
                                    case 3: 
                                        vent.get(0).setStatus(q.desligarVentilador(vent.get(0).isStatus()));
                                        break;
                                    case 4:
                                        break;
                                    default: 
                                        System.out.println("\nCódigo inválido!");
                                }
                            }
                            v1 = 0;
                            break;

                        case 2:
                            
                            while (v2 != 4) {

                                System.out.println("\n+-----------------------------+");
                                System.out.println("|         VENTILADOR 2        |");
                                System.out.println("+-----------------------------+");
                                System.out.println(" 1 - Ligar");
                                System.out.println(" 2 - Mudar a velocidade ");
                                System.out.println(" 3 - Desligar ");
                                System.out.println(" 4 - Sair ");
                                System.out.println("+-----------------------------+\n");
                                v2 = in.nextInt();

                                switch (v2) {
                                    case 1:
                                        vent.get(1).setStatus(q.ligarVentilador(vent.get(1).isStatus()));
                                        break;
                                    case 2:
                                        System.out.println("\nDigite a velocidade: ");
                                        System.out.println("1 - fraco ");
                                        System.out.println("2 - médio ");
                                        System.out.println("3 - forte \n");
                                        velo = in.nextInt();

                                        while ((velo < 1) || (velo > 3)) {
                                            System.out.println("\nCódigo incorreto! digite novamente! \n");
                                            System.out.println("\nDigite a velocidade: ");
                                            System.out.println("1 - fraco ");
                                            System.out.println("2 - médio ");
                                            System.out.println("3 - forte ");
                                            velo = in.nextInt();
                                        }
                                        
                                        vent.get(1).setVelocidade(velo);
                                        System.out.println("\nA velocidade do ventilador foi alterada para " + velo);
                                        break;
                                    case 3: 
                                        vent.get(1).setStatus(q.desligarVentilador(vent.get(1).isStatus()));
                                        break;
                                    case 4:
                                        break;
                                    default: 
                                        System.out.println("\nCódigo inválido!");
                                }
                            }
                            v2 = 0;
                            break;
                            
                        case 3:
                            
                            while (v3 != 4) {

                                System.out.println("\n+-----------------------------+");
                                System.out.println("|         VENTILADOR 3        |");
                                System.out.println("+-----------------------------+");
                                System.out.println(" 1 - Ligar");
                                System.out.println(" 2 - Mudar a velocidade ");
                                System.out.println(" 3 - Desligar ");
                                System.out.println(" 4 - Sair ");
                                System.out.println("+-----------------------------+\n");
                                v3 = in.nextInt();

                                switch (v3) {
                                    case 1:
                                        vent.get(2).setStatus(q.ligarVentilador(vent.get(2).isStatus()));
                                        break;
                                    case 2:
                                        System.out.println("\nDigite a velocidade: ");
                                        System.out.println("1 - fraco ");
                                        System.out.println("2 - médio ");
                                        System.out.println("3 - forte \n");
                                        velo = in.nextInt();

                                        while ((velo < 1) || (velo > 3)) {
                                            System.out.println("\nCódigo incorreto! digite novamente! \n");
                                            System.out.println("\nDigite a velocidade: ");
                                            System.out.println("1 - fraco ");
                                            System.out.println("2 - médio ");
                                            System.out.println("3 - forte ");
                                            velo = in.nextInt();
                                        }
                                        
                                        vent.get(2).setVelocidade(velo);
                                        System.out.println("\nA velocidade do ventilador foi alterada para " + velo );
                                        break;
                                    case 3: 
                                        vent.get(2).setStatus(q.desligarVentilador(vent.get(2).isStatus()));
                                        break;
                                    case 4:
                                        break;
                                    default: 
                                        System.out.println("\nCódigo inválido!");
                                }
                            }
                            v3 = 0;
                            break;
                            
                        case 4:
                            System.out.println("\nVentilador 1:\nVelocidade: " +vent.get(0).getVelocidade() +"\nStatus ventilador ligado: " +vent.get(0).isStatus());
                            System.out.println("\nVentilador 2:\nVelocidade: " +vent.get(1).getVelocidade() +"\nStatus ventilador ligado: " +vent.get(1).isStatus());
                            System.out.println("\nVentilador 3:\nVelocidade: " +vent.get(2).getVelocidade() +"\nStatus ventilador ligado: " +vent.get(2).isStatus());
                            break;
                        case 5: 
                            break;
                        default:
                            System.out.println("\nCódigo inválido!");
                    }
                }

                v = 0;
                break;
            
            case 6:
                System.out.println("\nSaindo do programa...");
                break;

            default: 
                System.out.println("\nCódigo inválido!");
        }
    }
}
}
