
package view;

import java.util.List;
import java.util.Scanner;
import model.Produto;

public class ProdutoView {

    private Scanner scanner = new Scanner(System.in);

    
    public int exibirMenu() {
        System.out.println("\n=== LISTA DE PRODUTOS ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");

        if (!scanner.hasNextLine()) {
            return 0;
        }

        String entrada = scanner.nextLine();

        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String solicitarNome() {
        System.out.print("Nome do produto: ");
        return scanner.nextLine();
    }

    public double solicitarPreco() {
        System.out.print("Preco do produto: ");
        return Double.parseDouble(
            scanner.nextLine().replace(",", ".")
        );
    }

    public int solicitarEstoque() {
        System.out.print("Quantidade em estoque: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void exibirProdutos(List<Produto> produtos) {
        System.out.println("\n=== PRODUTOS CADASTRADOS ===");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : produtos) {
            System.out.printf(
                "Nome: %s | Preco: R$ %.2f | Estoque: %d%n",
                produto.getNome(),
                produto.getPreco(),
                produto.getEstoque()
            );
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
