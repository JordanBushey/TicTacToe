import java.awt.*;
import java.util.Scanner; //Import Scanner Class for user input
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setVisible(true);



        //Create the Scanner Object
        Scanner scanner = new Scanner(System.in);

        //Initialize the board
        GameBoard gameBoard = new GameBoard();

        gameBoard.topLeft = '~';
        gameBoard.topMid = '~';
        gameBoard.topRight ='~';
        gameBoard.midLeft ='~';
        gameBoard.midMid ='~';
        gameBoard.midRight ='~';
        gameBoard.bottomLeft ='~';
        gameBoard.bottomMid ='~';
        gameBoard.bottomRight ='~';
        gameBoard.isWinner = false;


        while (!gameBoard.isWinner){
            gameBoard.getBoard();
            String turnOne = scanner.nextLine();
            gameBoard.userOneTurn(turnOne);
            gameBoard.getBoard();
            gameBoard.checkWinner();

            if (gameBoard.isWinner) {
                break;
            }

            gameBoard.getBoard();
            String turnTwo = scanner.nextLine();
            gameBoard.userTwoTurn(turnTwo);
            gameBoard.checkWinner();
        }

        //Method to determine tie


    }
}