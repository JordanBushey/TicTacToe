import java.awt.*;
import java.util.Scanner; //Import Scanner Class for user input
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GamePlayer view = new GamePlayer();
                view.setVisible(true);

                GameBoard model = new GameBoard();

                model.setBoardSquares(0, view.getTopLeftButton().getText());
                model.setBoardSquares(1, view.getTopMiddleButton().getText());
                model.setBoardSquares(2, view.getTopRightButton().getText());
                model.setBoardSquares(3, view.getMiddleLeftButton().getText());
                model.setBoardSquares(4, view.getMiddleMiddleButton().getText());
                model.setBoardSquares(5, view.getMiddleRightButton().getText());
                model.setBoardSquares(6, view.getBottomLeftButton().getText());
                model.setBoardSquares(7, view.getBottomMiddleButton().getText());
                model.setBoardSquares(8, view.getBottomRightButton().getText());
                model.isWinner = true;
                model.player = 1;

                GameController gameController = new GameController(model, view);

                for (int i = 1; 11 > i; i++){
                    System.out.println(model.getBoardSquare(i));
                }

            }
        });
    }
}