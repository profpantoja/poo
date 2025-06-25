public class Celula {
    
    private static int num_instancias = 0;

    public Celula(){
        num_instancias++;
    }

    public static void getNumInstancias() {
        System.out.println("Número de instâncias de células: " + num_instancias);
    }


}
