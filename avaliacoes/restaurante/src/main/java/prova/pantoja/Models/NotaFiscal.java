package prova.pantoja.Models;

import prova.pantoja.Interfaces.INFCGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator {
    private UUID id;
    private String emitente;
    private String nomeRestaurante;
    private String enderecoRestaurante;
    private String horario;
    private String nomeMesa;
    private List<Item> itens;
    private float total;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setEmitente(String cnpj) {
        this.emitente = cnpj;
    }

    @Override
    public void addProdutos(List<Item> itens) {
        this.itens.addAll(itens);
    }

    @Override
    public void setTotal(float total) {
        this.total = total;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public void setDataHoraEmissao(String horario) {
        this.horario = horario;
    }

    public void setNomeMesa(String nomeMesa) {
        this.nomeMesa = nomeMesa;
    }

    public UUID getId() {
        return id;
    }

    public String getEmitenteCnpj() {
        return emitente;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }

    public String getDataHoraEmissao() {
        return horario;
    }

    public String getNomeMesa() {
        return nomeMesa;
    }

    public List<Item> getItens() {
        return itens;
    }

    public float getTotalLiquido() {
        return total;
    }

     public void gerarNota() {
        System.out.println(nomeRestaurante);
        System.out.println(enderecoRestaurante);
        System.out.println("N. Contrib. " + emitente);
        System.out.println("\nConsulta de masa TC ROOFTC/265569");
        System.out.println(horario);
        System.out.println("\nMESA: " + nomeMesa);
        System.out.println("\nQt Descricao            P.Unit. Tx  Valor");

        for (Item item : itens) {
            System.out.println("1.00 " + item.getProduto().getNome() + " e " + item.getValVenda() + " " + item.getProduto().getIVA() + " e " + item.calcularSubtotal());
        }

        System.out.println("Total liq.            e " + total);
    }
}