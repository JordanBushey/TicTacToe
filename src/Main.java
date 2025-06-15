import java.awt.*;
import java.util.Scanner; //Import Scanner Class for user input
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        MainFrame frame = new MainFrame();

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);

        JTextField textFieldTitle = new JTextField("Let's Play Tic Tac Toe!",50 );

        frame.add(textFieldTitle, BorderLayout.CENTER);

        //adds menu bar to the frame
        frame.setJMenuBar(menuBar);


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
            gameBoard.checkWinner();

            if (gameBoard.isWinner) {
                //WHILE LOOP CHECKING FOR ERROR - ADD ERROR VARIABLE TO GAMEBOARD PROBABLY WITHIN USERMETHODS
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