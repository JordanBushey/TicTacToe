import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePlayer extends JFrame {
    private JPanel contentPane;
    private JButton topLeftButton;
    private JButton middleLeftButton;
    private JButton topMiddleButton;
    private JButton middleMiddleButton;
    private JButton topRightButton;
    private JButton middleRightButton;
    private JButton bottomRightButton;
    private JButton bottomMiddleButton;
    private JButton bottomLeftButton;

    public GamePlayer() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        //Set Frame Location to the center of the screen
        setLocationRelativeTo(null);

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

        //while (!gameBoard.isWinner){
            gameBoard.getBoard();
            // Take turn and listen for player 1
            gameBoard.checkWinner();
            gameBoard.player = 2;

       //     if (gameBoard.isWinner) {
                //WHILE LOOP CHECKING FOR ERROR - ADD ERROR VARIABLE TO GAMEBOARD PROBABLY WITHIN USERMETHODS
        //        break;
        //    }
            gameBoard.getBoard();

            //Take turn and listen for player 2
            gameBoard.checkWinner();
            gameBoard.player = 1;
     //   }


        // Create action listeners and logic for the buttons
        topLeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gameBoard.player == 1) {
                    topLeftButton.setText("X");
                } else if (gameBoard.player == 2){
                    topLeftButton.setText("O");
                }
            }
        });


    }
}
