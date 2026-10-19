import model.ProdutoModel;
import view.ProdutoView;
import controller.ProdutoController;

public class App {

    public static void main(String[] args) {

        ProdutoModel model = new ProdutoModel();
        ProdutoView view = new ProdutoView();

        ProdutoController controller =
            new ProdutoController(model, view);

        controller.iniciar();
    }
}
