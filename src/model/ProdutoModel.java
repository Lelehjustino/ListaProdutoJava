package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        if (produto.getNome() == null
                || produto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException(
                "O nome do produto é obrigatório."
            );
        }

        if (produto.getPreco() < 0) {
            throw new IllegalArgumentException(
                "O preço não pode ser negativo."
            );
        }

        if (produto.getEstoque() < 0) {
            throw new IllegalArgumentException(
                "O estoque não pode ser negativo."
            );
        }

        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }
}
