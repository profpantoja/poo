public class Automovel {
    
    private String marca;
    private String modelo;
    private int ano_fabricacao;
    private int ano_modelo;
    private String cor;
    private float km = 0;

    public Automovel(String marca, String modelo, int ano_fabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
    }

    public Automovel (String marca, String modelo, int ano_fabricacao, int ano_modelo, String cor, float km){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.cor = cor;
        this.km = km;
    }
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno_fabricacao(){
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao){
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getAno_modelo(){
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo){
        this.ano_modelo = ano_modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public Float getKm(){
        return km;
    }

    public void setKm(Float km){
        this.km = km;
    }



    public void AddKm(float km){
        this.km += km;
    }

    public float KmTotal(){
        return this.km;
    }

    public float VelMedia(float distperco, float tempomin){
        float vm = distperco/tempomin;
        return vm;
    }

    public void Acelerar(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " acelerou");
    }

    public void Frear(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " freiou");
    }

    public void Direita(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " se moveu para direita");
    }

    public void Esquerda(String marcacarro) {
        System.out.println("\nO carro " + marcacarro + " se moveu para esquerda");
    }
 
}
