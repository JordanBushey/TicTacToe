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


                gameBoard.topLeft = gamePlayer.getTopLeftButton().charAt(0);
                gameBoard.topMid =  gamePlayer.getTopMiddleButton().charAt(0);
                gameBoard.topRight = gamePlayer.getTopRightButton().charAt(0);
                gameBoard.midLeft = gamePlayer.getMiddleLeftButton().charAt(0);
                gameBoard.midMid = gamePlayer.getMiddleMiddleButton().charAt(0);
                gameBoard.midRight = gamePlayer.getMiddleRightButton().charAt(0);
                gameBoard.bottomLeft = gamePlayer.getBottomLeftButton().charAt(0);
                gameBoard.bottomMid = gamePlayer.getBottomMiddleButton().charAt(0);
                gameBoard.bottomRight = gamePlayer.getBottomRightButton().charAt(0);
                gameBoard.isWinner = false;
                gameBoard.player = 1;

                gameBoard.getBoard();

               for (int i = 1; i < 11; i++) {
                String topLeft = gamePlayer.getTopLeftButton();
                char x = topLeft.charAt(0);

                System.out.println(topLeft);

                }


                //Game Logic
                if (gameBoard.player == 1) {
                    gamePlayer.playerOne();
                    String playerInput = "Input Goes Here";
                    gameBoard.userOneTurn(playerInput);
                } else if (gameBoard.player == 2){
                    gamePlayer.playerTwo();
                } else {
                    System.err.println("Error, this is not an option");
                }



















                //while (!gameBoard.isWinner) {
                //    while (gameBoard.player == 1) {
                 //       gamePlayer.playerOne();
                 //   }
//while (gameBoard.player == 2) {
                   //     gamePlayer.playerTwo();
                  //  }
             //   }
            }


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