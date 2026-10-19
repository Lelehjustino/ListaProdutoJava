package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    private List<Produto> produtos = new ArrayList<>();

    public Produto() {
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

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
