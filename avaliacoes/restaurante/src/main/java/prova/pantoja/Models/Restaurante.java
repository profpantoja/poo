package prova.pantoja.Models;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private String cnpj;
    private String nomeFantasia;
    private Endereco endereco;
    private List<Mesa> mesas;
    private Menu menu;

    public Restaurante(String nome, String cnpj, String nomeFantasia, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.mesas = new ArrayList<>();
        this.menu = new Menu();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void adicionarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void exibirMenu() {
        System.out.println(this.menu.Show());
    }
}