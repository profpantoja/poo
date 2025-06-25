public class MainContaCorrente {

    public static void main(String[] args) {
    
    ContaCorrente conta1 = new ContaCorrente(1000f , 3114 , "José Carlos", 2000f, true);
    ContaCorrente conta2 = new ContaCorrente(800f , 2126 , "Jurema abençoada", 1000f, true);
    
    System.out.println("\nCONTA 1 ");
    conta1.levantar(1400);
    conta1.levantar(500);
    System.out.println("+-------------------------------------+");

    System.out.println("\nCONTA 2 ");
    conta2.levantar(200);
    conta2.depositar(3);
    conta2.levantar(800);
    System.out.println("+-------------------------------------+");

    System.out.println("\nCONTA 1 ");
    conta1.depositar(500);
    conta1.levantar(800);
    conta1.levantar(1600);
    System.out.println("+-------------------------------------+");

    System.out.println("\nCONTA 2 ");
    conta1.setSaldo(conta2.transferir(100,conta1.getSaldo(),conta1.getCliente(),conta1.getNumero(),conta1.getSituacao()));
    System.out.println("+-------------------------------------+");

    System.out.println("\nCONTA 1 ");
    conta1.levantar(10);
    System.out.println("+-------------------------------------+");

    }
    
}
