package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.MesaController;
import models.Mesa;

public class MesaScan {
    

    public Scanner scan = new Scanner(System.in);
    private MesaController controller = new MesaController();

    public void start(){

        int opcao;

        do{

            opcao = showMenu();

            switch(opcao){

                case 1:
                    
                    getMesaDetails();
                    System.out.println("Mesa criada com sucesso");
                break;

                case 2:
                    ArrayList<Mesa> mesas = (ArrayList<Mesa>) controller.readMesas();
                    showMesas(mesas);
                break;

                case 3:

                    int id = getId();
                    boolean removed = controller.deleteMesa(id);

                    if(removed){
                        System.out.println("Mesa removida com sucesso");
                    }
                break;

                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        System.out.println("Saindo do fluxo de mesas...");
    }

    public static void main(String[] args) {
        MesaScan view = new MesaScan();
        view.start();
    }


    public int showMenu(){
        System.out.println("Escolha a opção: ");
        System.out.println("0: Sair ");
        System.out.println("1: Criar");
        System.out.println("2: Ler");
        System.out.println("3: Deletar ");
        
        int opcao = Integer.parseInt(scan.nextLine());

        return opcao;
    }

    public void getMesaDetails(){

        System.out.println("Número: ");
        String num = scan.nextLine();

        System.out.println("Local: ");
        String local = scan.nextLine();

        controller.createMesa(num, local);
    }

    public void showMesas(ArrayList<Mesa> mesas){

        if (mesas.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
            return;
        }

        for (Mesa mesa : mesas) {
            System.out.println("ID: " + mesa.getId());
            System.out.println("Números: " + mesa.getNum());
            System.out.println("Local: " + mesa.getLocal());
            System.out.println();
        }
    }

    public int getId(){
        System.out.println("ID: ");
        int id = Integer.parseInt(scan.nextLine());
        return id;
    }
}