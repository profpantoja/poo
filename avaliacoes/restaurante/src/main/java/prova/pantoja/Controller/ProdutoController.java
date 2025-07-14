package prova.pantoja.Controller;

import prova.pantoja.DAO.ProdutoDAO;
import prova.pantoja.Models.Produto;
import prova.pantoja.View.ProdutoView;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos;
    private ProdutoView view;
    private ProdutoDAO produtoDAO;

    public ProdutoController(List<Produto> produtos, ProdutoView view) {
        this.produtos = produtos;
        this.view = view;
        this.produtoDAO = new ProdutoDAO();
        this.produtos = produtoDAO.carregarProdutos();
    }

    public void adicionarProduto() {
        Produto novoProduto = view.criarProduto();
        produtos.add(novoProduto);
        produtoDAO.salvarProdutos(produtos);
        view.exibirMensagem("Produto adicionado e salvo!");
    }

    public void removerProduto() {
        String nome = view.obterNomeProdutoParaRemover();
        boolean removido = produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
        if (removido) {
            produtoDAO.salvarProdutos(produtos);
            view.exibirMensagem("Produto removido e salvo!");
        } else {
            view.exibirMensagem("Produto não encontrado.");
        }
    }

    public void atualizarProduto() {
        String nome = view.obterNomeProdutoParaAtualizar();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                Produto produtoAtualizado = view.criarProduto();
                produto.setNome(produtoAtualizado.getNome());
                produto.setValVenda(produtoAtualizado.getValVenda());
                produto.setValProduto(produtoAtualizado.getValProduto());
                produto.setIVA(produtoAtualizado.getIVA());
                produtoDAO.salvarProdutos(produtos);
                view.exibirMensagem("Produto atualizado e salvo!");
                return;
            }
        }
        view.exibirMensagem("Produto não encontrado.");
    }

    public void listarProdutos() {
        view.exibirProdutos(produtos);
    }

    public void salvarProdutos() {
        produtoDAO.salvarProdutos(produtos);
    }
}


