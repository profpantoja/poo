package view;

import java.util.Scanner;
import controller.VeterinarioController;

public class VeterinarioScan {
    Scanner scan = new Scanner(System.in);
    int index = 1;
    VeterinarioController controller = new VeterinarioController();

    public void menuVet() {
        while (index != 0) {
            System.out.println("\nMENU DO VETERINÁRIO:\n[1] - Criar Veterinário\n[2] - Ler Veterinário\n[3] - Remover Veterinário\n[4] - Listar Veterinários\n[0] - Voltar");
            index = scan.nextInt();
            scan.nextLine();

            switch (index) {
                case 1:
                criarVeterinario();
                break;

                case 2:
                lerVeterinario();
                break;

                case 3:
                removerVeterinario();
                break;

                case 4:
                controller.listarVeterinario();
                break;

                case 0: 
                System.out.println("Voltando...");
                break;

                default:
                System.out.println("Opção inválida.");
            }
        }
    }

    private void criarVeterinario() {
        System.out.println("Nome:");
        String nomevet = scan.nextLine();

        System.out.println("Apelido:");
        String apelidovet = scan.nextLine();

        System.out.println("CRMV:");
        String crvvet = scan.nextLine();

        controller.criarVeterinario(nomevet, apelidovet, crvvet);
    }

    private void lerVeterinario() {
        System.out.println("\nBuscar por:\n[1] Nome\n[2] Apelido\n[3] CRMV");
        int index2 = scan.nextInt();
        scan.nextLine();

        switch (index2) {
            case 1:
            System.out.println("Nome: ");
            String lernomevet = scan.nextLine();
            controller.buscarNome(lernomevet);
            break;
            
            case 2:
            System.out.println("Apelido: ");
            String lerapelidovet = scan.nextLine();
            controller.buscarApelido(lerapelidovet);
            break;

            case 3:
            System.out.println("CRMV: ");
            String lercrvvet = scan.nextLine();
            controller.buscarCrv(lercrvvet);
            break;
            
            default:
            System.out.println("Opção inválida.");
        }
    }

    private void removerVeterinario() {
        System.out.println("\nRemover por:\n[1] Nome\n[2] Apelido\n[3] CRMV");
        int index3 = scan.nextInt();
        scan.nextLine(); 

        switch (index3) {
            case 1:
                System.out.println("Nome: ");
                String removernomevet = scan.nextLine();
                controller.removerNome(removernomevet);
                break;
            
            case 2:
                System.out.println("Apelido: ");
                String removerapelidovet = scan.nextLine();
                controller.removerApelido(removerapelidovet);
                break;

            case 3:
                System.out.println("CRMV: ");
                String removercrvvet = scan.nextLine();
                controller.removerCrv(removercrvvet);
                break;
            
            default:
                System.out.println("Opção inválida.");
        }

    }
}
