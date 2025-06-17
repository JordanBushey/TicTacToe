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

                gameBoard.isWinner = false;
                gameBoard.player = 1;

                gameBoard.getBoard();

                    gameBoard.topLeft = gamePlayer.getTopLeftButton().charAt(0);
                    gameBoard.topMid =  gamePlayer.getTopMiddleButton().charAt(0);
                    gameBoard.topRight = gamePlayer.getTopRightButton().charAt(0);
                    gameBoard.midLeft = gamePlayer.getMiddleLeftButton().charAt(0);
                    gameBoard.midMid = gamePlayer.getMiddleMiddleButton().charAt(0);
                    gameBoard.midRight = gamePlayer.getMiddleRightButton().charAt(0);
                    gameBoard.bottomLeft = gamePlayer.getBottomLeftButton().charAt(0);
                    gameBoard.bottomMid = gamePlayer.getBottomMiddleButton().charAt(0);
                    gameBoard.bottomRight = gamePlayer.getBottomRightChar();

                    gameBoard.player = 1;
                    gamePlayer.playerOne();

                    gamePlayer.updateBoxValue("x", gamePlayer.getBottomRightButton());


                    //if action happens, then continue loop, otherwise continue internal loop
                    //button to start game
                    //buttonm to restart game
                    //label to track turn number
                }

                //while (!gameBoard.isWinner) {
                //    while (gameBoard.player == 1) {
                 //       gamePlayer.playerOne();
                 //   }
//while (gameBoard.player == 2) {
                   //     gamePlayer.playerTwo();
                  //  }
             //   }
            //}


             //Create the Scanner Object
             //Scanner scanner = new Scanner(System.in);

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