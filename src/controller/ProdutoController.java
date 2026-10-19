package controller;

import model.Produto;
import model.ProdutoModel;
import view.ProdutoView;

public class ProdutoController {

    private ProdutoModel model;
    private ProdutoView view;

    public ProdutoController(
            ProdutoModel model,
            ProdutoView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        boolean executando = true;

        while (executando) {
            int opcao = view.exibirMenu();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;

                case 2:
                    listar();
                    break;

                case 0:
                    view.exibirMensagem(
                        "Programa encerrado."
                    );
                    executando = false;
                    break;

                default:
                    view.exibirMensagem(
                        "Opção inválida. Tente novamente."
                    );
            }
        }
    }

    private void cadastrar() {
        try {
            String nome = view.solicitarNome();
            double preco = view.solicitarPreco();
            int estoque = view.solicitarEstoque();

            Produto produto = new Produto(
                nome, preco, estoque
            );

            model.cadastrarProduto(produto);

            view.exibirMensagem(
                "Produto cadastrado com sucesso!"
            );

        } catch (IllegalArgumentException e) {
            view.exibirMensagem(
                "Erro: " + e.getMessage()
            );
        }
    }

    private void listar() {
        view.exibirProdutos(model.listarProdutos());
    }
}
