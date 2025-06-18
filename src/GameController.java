import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameBoard model;
    private GamePlayer view;

    public GameController(GameBoard model, GamePlayer view) {
        this.model = model;
        this.view = view;


    }

    public void updateView(GamePlayer newValue) {
        model.boardSquares[0] = newValue.getTopLeftButton().getText().charAt(0);
        model.boardSquares[1] = newValue.getTopMiddleButton().getText().charAt(0);
        model.boardSquares[2] = newValue.getTopRightButton().getText().charAt(0);
        model.boardSquares[3] = newValue.getMiddleLeftButton().getText().charAt(0);
        model.boardSquares[4] = newValue.getMiddleMiddleButton().getText().charAt(0);
        model.boardSquares[5] = newValue.getMiddleRightButton().getText().charAt(0);
        model.boardSquares[6] = newValue.getBottomLeftButton().getText().charAt(0);
        model.boardSquares[7] = newValue.getBottomMiddleButton().getText().charAt(0);
        model.boardSquares[8] = newValue.getBottomRightButton().getText().charAt(0);
    }

    public class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Top Left")) {
                model.setBoardSquares(0, "X");
            } else if (command.equals("Top Middle")) {
                model.setBoardSquares(1, "X");
            } else if (command.equals("Top Right")) {
                model.setBoardSquares(2, "X");
            } else if (command.equals("Middle Left")) {
                model.setBoardSquares(3, "X");
            } else if (command.equals("Middle Middle")) {
                model.setBoardSquares(4, "X");
            } else if (command.equals("Middle Right")) {
                model.setBoardSquares(5, "X");
            } else if (command.equals("Bottom Left")) {
                model.setBoardSquares(6, "X");
            } else if (command.equals("Bottom Middle")) {
                model.setBoardSquares(7, "X");
            } else if (command.equals("Bottom Right")) {
                model.setBoardSquares(8, "X");
            }
        }


    }
}
