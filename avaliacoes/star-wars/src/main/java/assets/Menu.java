package assets;

import java.util.Scanner;

import assets.controller.BlastController;
import assets.controller.JediController;
import assets.controller.SaberController;
import assets.controller.SithController;
import assets.dao.BlastDao;
import assets.dao.JediDao;
import assets.dao.SaberDao;
import assets.dao.SithDao;
public class Menu {

    public void StartMenuJedi(){
        JediDao jediDao = new JediDao();
        jediDao.getAllJedis(); // Carrega os jedis do arquivo para a memória
        Scanner scanner = new Scanner(System.in);
        int decisao;
        JediController jediController = new JediController();

        System.out.println("Bem vindo ao Star Wars Jedi Manager!, escolha uma opção: \n[1] Criar Jedi\n[2] Listar todos os Jedis\n[3] Buscar Jedi por nome\n[4] Remover Jedi\n[5] Sair");
        decisao  = scanner.nextInt();

        switch (decisao) {
            case 1:
                jediController.createJedi();
                break;
            case 2:
                jediController.showJedi();
                break;
            case 3:
                
                System.out.println("Digite o nome do Jedi que deseja buscar: ");
                String nome = scanner.next();
                jediController.getJediByName(nome);
                break;
            case 4:
                jediController.removeJedi();
                break;
            case 5:
                System.out.println("Saindo do Star Wars Jedi Manager...");
                break;
            default:
                System.out.println("Opção inválida!");
            }
        }

        public void StartMenuSith(){
            SithDao sithDao = new SithDao();
            sithDao.getAllSiths(); // Carrega os siths do arquivo para a memória
            Scanner scanner = new Scanner(System.in);
            SithController sithController = new SithController();
            int decisao;
        
            System.out.println("Bem vindo ao Star Wars Sith Manager!, escolha uma opção: \n[1] Criar Sith\n[2] Listar todos os Siths\n[3] Buscar Sith por nome\n[4] Remover Sith\n[5] Sair");
            decisao  = scanner.nextInt();

            switch (decisao) {
                case 1:
                    sithController.createSith();
                    break;
                case 2:
                    sithController.showSith();
                    break;
                case 3:
                    
                    System.out.println("Digite o nome do Sith que deseja buscar: ");
                    String nome = scanner.next();
                    sithController.getSithByName(nome);
                    break;
                case 4:
                    sithController.removeSith();
                    break;
                case 5:
                    System.out.println("Saindo do Star Wars Sith Manager...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                }
        }

        public void StartMenuSaber(){
            SaberDao saberDao = new SaberDao();
            System.out.println("Carregando sabers do arquivo...");
            saberDao.getAllSabers(); // Carrega os sabers do arquivo para a memória 
            Scanner scanner = new Scanner(System.in);
                        System.out.println("Carregando sabers do arquivo...");
            SaberController saberController = new SaberController();
            int decisao;

            System.out.println("Bem vindo ao Star Wars Saber Manager!, escolha uma opção: \n[1] Criar Saber\n[2] Listar todos os Sabers\n[3] Buscar Saber por cor\n[4] Remover Saber\n[5] Sair");
            decisao  = scanner.nextInt();

            switch (decisao) {
                case 1:
                    saberController.createSaber();
                    break;
                case 2:
                    saberController.showSabers();
                    break;
                case 3:
                    System.out.println("Digite o nome do Saber que deseja buscar: ");
                    String nome = scanner.next();
                    saberController.getSaberByColor(nome);
                    break;
                case 4:
                    saberController.removeSaber();
                    break;
                case 5:
                    System.out.println("Saindo do Star Wars Saber Manager...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                }   
        }

    public void StartMenuBlaster(){
            BlastDao blastDao = new BlastDao();
            blastDao.getAllBlasts(); // Carrega os Blasts do arquivo para a memória
            Scanner scanner = new Scanner(System.in);
            BlastController blastController = new BlastController();
            int decisao;

            System.out.println("Bem vindo ao Star Wars Blast Manager!, escolha uma opção: \n[1] Criar Blast\n[2] Listar todos os Blasts\n[3] Buscar Blast por nome\n[4] Remover Blast\n[5] Sair");
            decisao  = scanner.nextInt();

            switch (decisao) {
                case 1:
                    blastController.createBlast();
                    break;
                case 2:
                    blastController.showBlasts();
                    break;
                case 3:
                    System.out.println("Digite o nome do Blaster que deseja buscar: ");
                    String nome = scanner.next();
                    blastController.getBlastByName(nome);
                    break;
                case 4:
                    blastController.removeBlast();
                    break;
                case 5:
                    System.out.println("Saindo do Star Wars Blast Manager...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                }

    }


}
