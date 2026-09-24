public class Cachorro extends Animal {
    
    public Cachorro(
        int vida, 
        float peso, 
        float altura
    ){ 
        super(vida, peso, altura);
    }
    
    public void latir(){
        System.out.println("Latindo!");
        setVida(getVida() - 1);

        if(getVida() <= 0)
            morrer();
    }
}
