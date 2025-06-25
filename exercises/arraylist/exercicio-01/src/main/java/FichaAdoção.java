import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class FichaAdoção {

    private Pessoa pessoa;
    private Cão cão;
    private LocalDate data_adoção;
    static int qtd = 0;

    public FichaAdoção() {
        this.cão = new Cão();
        this.pessoa = new Pessoa();
        qtd++;
    }

    public FichaAdoção(Pessoa pessoa, Cão cão, LocalDate data_adoção) {
        boolean v = verificar_data(cão.getData_entrada(), data_adoção);
        if (v == true){
            this.pessoa = pessoa;
            this.cão = cão;
            this.data_adoção = data_adoção;
            System.out.println("A pessoa "+pessoa.getNome()+" adotou o cao "+cão.getNome()+"!\n");
            qtd++;
        }
        else {
            System.out.println("A data de adoçao nao pode ser anterior a data de entrada do cao! \nO erro está na adoçao da pessoa "+pessoa.getNome()+" e do cao "+cão.getNome()+"\n");
        }
    }


    public static void visualizar_fichar(ArrayList<FichaAdoção> fa){

        for (int i = 0; i < fa.size();i++){

        System.out.println("\n+-------------------------------------+");
        System.out.println("|           FICHA DE ADOÇAO           |");
        System.out.println("+-------------------------------------+");
        System.out.println("\nDono: "+fa.get(i).getPessoa().getNome()+"\nCao adotado: "+ fa.get(i).getCão().getNome()+"\nData de adoçao: "+ fa.get(i).getData_adoção()+"\n");
        
        tempo_ong(fa.get(i).getCão().getData_entrada(), fa.get(i).getData_adoção());
        nutricao(fa.get(i).getCão().getPeso());
        tempo_adotado(fa.get(i).getData_adoção());

        System.out.println("+-------------------------------------+\n");

        }
    }


    public static boolean verificar_data(LocalDate entrada, LocalDate adoção) {

        if (entrada.compareTo(adoção) <= 0) {
            System.out.println("Adoçao foi realizada!");
            return true;
        } else {
            System.out.println("ERRO!");
            return false;
        }
    }


    public static void tempo_adotado(LocalDate adoção) {

        LocalDate hoje = LocalDate.now();
        long anos = adoção.until(hoje, ChronoUnit.YEARS);
        long meses = adoção.until(hoje, ChronoUnit.MONTHS);
        long dias = adoção.until(hoje, ChronoUnit.DAYS);
        if ((anos == 1) && ((meses - 12) == 0)){
            System.out.println("Tempo de adocao: " + anos+ " ano");
        }
        else if (anos >= 1){
            meses = meses - (12*anos);
            System.out.println("Tempo de adocao: " + anos+ " ano(s) e "+meses+" meses");
        }
        else if ((anos >= 1) && (meses == 0)){
            System.out.println("Tempo de adocao: " + anos+ " ano(s)");
        }
        else if (meses >= 1){
            System.out.println("Tempo de adocao: " + meses+ " mes(es)");
        }
        else {
            System.out.println("Tempo de adocao: " + dias+ " dia(s)");
        }
    }
    

    public static void tempo_ong(LocalDate entrada, LocalDate adoção) {

        long anos = entrada.until(adoção, ChronoUnit.YEARS);
        long meses = entrada.until(adoção, ChronoUnit.MONTHS);
        long dias = entrada.until(adoção, ChronoUnit.DAYS);
        if ((anos == 1) && ((meses - 12) == 0)){
            System.out.println("Tempo de ONG: " + anos+ " ano");
        }
        else if (anos >= 1){
            meses = meses - (12*anos);
            System.out.println("Tempo de ONG: " + anos+ " ano(s) e "+meses+" meses");
        }
        else if (meses >= 1){
            System.out.println("Tempo de ONG: " + meses+ " mes(es)");
        }
        else {
            System.out.println("Tempo de ONG: " + dias+ " dia(s)");
        }
    }


    public static void nutricao(float kg){
        if (kg <= 20) {
            System.out.println("Status: desnutrido!");
        }
        else if ( kg <= 30){
            System.out.println("Status: bem nutrido!");
        }
        else if ( kg > 30){
            System.out.println("Status: O cachorro está obeso!");
        }
    }

    public static void buscar_cao(String nome, ArrayList<FichaAdoção> adoções){

        boolean encontrado = false;
        for (FichaAdoção ficha : adoções) {
            if (ficha.getCão().getNome().equals(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("\nCao "+ nome + " encontrado no sistema!");
        } else {
            System.out.println("\nCao "+ nome + "não encontrado no sistema!");
        }

    }
    
    public static void cao_mais_antigo(ArrayList<FichaAdoção> adoções){

        LocalDate data = LocalDate.now();
        String cao_mais_antigo = "";

        for (FichaAdoção ficha : adoções) {

            LocalDate dataAdoção = ficha.getData_adoção();

            if (dataAdoção.isBefore(data)) {
                data = dataAdoção;
                cao_mais_antigo = ficha.getCão().getNome();
            }
        }
        System.out.println("\nCao com maior tempo de adoçao: " + cao_mais_antigo);
    }


    public static void qtd_viralata_adotados(ArrayList<FichaAdoção> adoções){

        int qtd = 0;

        for (FichaAdoção ficha : adoções){
            if(ficha.getCão().getRaça().equals(Raça.VIRA_LATA)){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de caes adotados com a raça Vira Lata: " + qtd);
    }


    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Cão getCão() {
        return cão;
    }
    public void setCão(Cão cão) {
        this.cão = cão;
    }
    public LocalDate getData_adoção() {
        return data_adoção;
    }
    public void setData_adoção(LocalDate data_adoção) {
        this.data_adoção = data_adoção;
    }

    public static int getQtd() {
        return qtd;
    }
    
}
