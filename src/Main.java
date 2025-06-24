import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GamePlayer view = new GamePlayer();
                view.setVisible(true);
                GameBoard model = new GameBoard();

                GameController controller = new GameController(model, view);
            }

        });
    }
}