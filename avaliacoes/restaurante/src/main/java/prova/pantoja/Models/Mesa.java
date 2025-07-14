package prova.pantoja.Models;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private String numero;
    private String local;
    private Funcionario FuncionarioMesa;
    private List<Pedido> pedidos;

    public Mesa(String numero, String local, Funcionario FuncionarioMesa) {
        this.numero = numero;
        this.local = local;
        this.FuncionarioMesa = FuncionarioMesa;
        this.pedidos = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Funcionario getFuncionarioMesa() {
        return FuncionarioMesa;
    }

    public void setFuncionarioMesa(Funcionario FuncionarioMesa) {
        this.FuncionarioMesa = FuncionarioMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        
    }

    public boolean removerPedido(Pedido pedido) {
        return this.pedidos.remove(pedido);
    }
}