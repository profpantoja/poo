
public class Main {
    
    public static void main(String[] args) {

        //Não é possível instanciar uma classe abstrata
        //Um método abstrato é obrigatório realizar a sobrecarga na herança

        Lion leão = new Lion();
        Ornitorrinco orni = new Ornitorrinco();
        Eagle eagle = new Eagle();
        Dog dog = new Dog();
       

        leão.respirar();
        orni.respirar();
        eagle.respirar();
        dog.respirar();

        orni.dormir();
        eagle.comer();
        dog.andar();

        dog.latir();
        eagle.voar();
        
    }
}
