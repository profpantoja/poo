import java.time.LocalDate;
import java.util.ArrayList;

public class MainCãoNino {

    public static void main(String[] args) {

    Cão cão1 = new Cão("Kate",LocalDate.of(2009,06,12),Raça.VIRA_LATA,"Preta",35f);
    Cão cão2 = new Cão("Bob",LocalDate.of(2010,10,9),Raça.BULLDOG,"Preta",22f);
    Cão cão3 = new Cão("Pitty",LocalDate.of(2008,11,9),Raça.PITBULL,"Branca",38f);
    Cão cão4 = new Cão("Kelly",LocalDate.of(2001,05,8),Raça.LABRADOR,"Amarela",36f);
    Cão cão5 = new Cão("Peixe",LocalDate.of(2008,11,9),Raça.VIRA_LATA,"Amarela",20f);
    Cão cão6 = new Cão("Grazi",LocalDate.of(2012,12,12),Raça.PASTOR_ALEMAO,"Amarela",18f);

    Pessoa pessoa1 = new Pessoa("Diana","Rua Del Castilho 5","(21) 97834-5643","Diana.bonitinha@gmail.com",'F',cão1);
    Pessoa pessoa2 = new Pessoa("Louis","Rua marmotinha 34","(21) 97834-5563","Louisoprt@gmail.com",'M',cão2);
    Pessoa pessoa3 = new Pessoa("Bruce","Rua mexico 98","(21) 92434-5643","Bruce.wayne@gmail.com",'M',cão3);
    Pessoa pessoa4 = new Pessoa("Clark","Rua bar da cachaça 21","(21) 45674-5643","Clarkkenttilt@gmail.com",'M',cão4);
    Pessoa pessoa5 = new Pessoa("Lara","Rua jeronimo luis","(21) 45674-8887","laramenezesx@gmail.com",'F');

    FichaAdoção ficha1 = new FichaAdoção(pessoa1,cão1,LocalDate.of(2010,12,24));
    FichaAdoção ficha2 = new FichaAdoção(pessoa2,cão2,LocalDate.of(2011,3,20));
    FichaAdoção ficha3 = new FichaAdoção(pessoa3,cão3,LocalDate.of(2017,6,18));
    FichaAdoção ficha4 = new FichaAdoção(pessoa4,cão4,LocalDate.of(2002,9,1));

    //Susbtituir pessoa na adoção
    ficha1.setPessoa(pessoa5);
    pessoa5.setCão(cão1);


    ArrayList<FichaAdoção> adoções = new ArrayList<FichaAdoção>();

    adoções.add(ficha1);
    adoções.add(ficha2);
    adoções.add(ficha3);
    adoções.add(ficha4);

    System.out.println("\nQuantidade de caes no sistema: " + Cão.getQtd());
    System.out.println("Quantidade de adoçoes: " + FichaAdoção.getQtd() + "\n");

    FichaAdoção.visualizar_fichar(adoções);
    FichaAdoção.buscar_cao("Kate", adoções);
    FichaAdoção.cao_mais_antigo(adoções);
    FichaAdoção.qtd_viralata_adotados(adoções);

    ArrayList<Cão> cães = new ArrayList<Cão>();
    Cão cão = new Cão();

    cães.add(cão1);
    cães.add(cão2);
    cães.add(cão3);
    cães.add(cão4);
    cães.add(cão5);
    cães.add(cão6);

    cão.qtd_desnutridos(cães);
    cão.qtd_viralata(cães);
    cão.qtd_cao_amarelos(cães);
        
    }
}
