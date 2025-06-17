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
                gameBoard.player = 1;


                while (!gameBoard.isWinner) {
                    while (gameBoard.player == 1) {
                        gamePlayer.playerTwo();
                    }
                    while (gameBoard.player == 2) {
                        gamePlayer.playerTwo();
                    }
                }
            }


             //Create the Scanner Object
             Scanner scanner = new Scanner(System.in);

             //Initialize the board


//           while (!gameBoard.isWinner){
//             gameBoard.getBoard();
//             String turnOne = scanner.nextLine();
//             gameBoard.userOneTurn(turnOne);
//             gameBoard.checkWinner();
//             gameBoard.player = 2;
//
//             if (gameBoard.isWinner) {
//                 //WHILE LOOP CHECKING FOR ERROR - ADD ERROR VARIABLE TO GAMEBOARD PROBABLY WITHIN USERMETHODS
//                 break;
//             }
//             gameBoard.getBoard();
//             String turnTwo = scanner.nextLine();
//             gameBoard.userTwoTurn(turnTwo);
//             gameBoard.checkWinner();
//             gameBoard.player = 1;
//         }
//
                //Method to determine tie


        });
    }
}