import model.Produto;
import view.ProdutoView;
import controller.ProdutoController;

public class App {

    public static void main(String[] args) {

        Produto model = new Produto();
        ProdutoView view = new ProdutoView();

        ProdutoController controller =
            new ProdutoController(model, view);

        controller.iniciar();
    }
}