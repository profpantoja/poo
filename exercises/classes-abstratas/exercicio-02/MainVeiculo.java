public class MainVeiculo {

    public static void main(String[] args) {

    Automovel automovel = new Automovel("4568788","JON1409");
    Aviao aviao = new Aviao("129455");
    Barco barco = new Barco("345678");

    automovel.ligar();
    aviao.ligar();
    barco.ligar();

    automovel.desligar();
    aviao.frente();
    barco.re();
    automovel.parar();

    }
    
}
