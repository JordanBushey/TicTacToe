import java.awt.*;
import java.util.Scanner; //Import Scanner Class for user input
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GamePlayer gamePlayer = new GamePlayer();
                gamePlayer.setVisible(true);

                GameBoard gameBoard = new GameBoard();
                GameController gameController = new GameController(gameBoard, gamePlayer);

            }
        });
    }
}