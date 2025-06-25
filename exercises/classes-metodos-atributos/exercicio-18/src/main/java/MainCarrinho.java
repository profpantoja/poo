import java.time.LocalDate;
import java.util.ArrayList;

public class MainCarrinho {

    public static void main(String[] args) {

    Mercadoria m = new Mercadoria();

    Mercadoria produto1 = new Mercadoria("Tomate",3.2f, LocalDate.of(2025,04,07),new Fornecedor("Pomarola","(21) 97856-1345","Rua dos cabrito velho 67","12.345.678/0001-00"));
    Mercadoria produto2 = new Mercadoria("banana",15f, LocalDate.of(2024,11,13),new Fornecedor("Nestle","(21) 99807-7645","Firmino carmindo cruz 45","12.234.958/0001-00"));
    Mercadoria produto3 = new Mercadoria("banana",15f, LocalDate.of(2024,9,13),new Fornecedor("Nestle","(21) 99807-7645","Firmino carmindo cruz 45","12.234.958/0001-00"));
    Mercadoria produto4 = new Mercadoria("Cebola",7.8f, LocalDate.of(2026,02,25),new Fornecedor("Morangao hortifruti","(21) 94564-3765","Rua soldado farias de souza 34","34.345.234/0001-00"));
    Mercadoria produto5 = new Mercadoria("Danone",10.5f, LocalDate.of(2024,07,22),new Fornecedor("Morangao hortifruti","(21) 94564-3765","Rua soldado farias de souza 34","34.345.234/0001-00"));
    Mercadoria produto6 = new Mercadoria("Danone",10.5f, LocalDate.of(2024,07,22),new Fornecedor("Morangao hortifruti","(21) 94564-3765","Rua soldado farias de souza 34","34.345.234/0001-00"));
    Mercadoria produto7 = new Mercadoria("Danone",10.5f, LocalDate.of(2024,07,22),new Fornecedor("Morangao hortifruti","(21) 94564-3765","Rua soldado farias de souza 34","34.345.234/0001-00"));

    ArrayList<Mercadoria> produto = new ArrayList<Mercadoria>();

    produto.add(produto1);
    produto.add(produto2);
    produto.add(produto3);
    produto.add(produto4);
    produto.add(produto5);
    produto.add(produto6);
    produto.add(produto7);

    m.qtd_por_produto(produto);
    m.qtd_itens_total();
    m.valor_total();

    }
}
