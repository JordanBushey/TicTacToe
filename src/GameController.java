import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class GameController implements ActionListener {

    private GameBoard model;
    private GamePlayer view;

    public GameController(GameBoard model, GamePlayer view) {
        this.model = model;
        this.view = view;

        this.view.clickListener(this);
    }


    public void updateModel(GamePlayer newValue) {
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

    public void updateView(GameBoard model) {
        view.setTopLeftButton(Character.toString(model.getBoardSquare(0)));
        view.setTopMiddleButton(Character.toString(model.getBoardSquare(1)));
        view.setTopRightButton(Character.toString(model.getBoardSquare(2)));
        view.setMiddleLeftButton(Character.toString(model.getBoardSquare(3)));
        view.setMiddleMiddleButton(Character.toString(model.getBoardSquare(4)));
        view.setMiddleRightButton(Character.toString(model.getBoardSquare(5)));
        view.setBottomLeftButton(Character.toString(model.getBoardSquare(6)));
        view.setBottomMiddleButton(Character.toString(model.getBoardSquare(7)));
        view.setBottomRightButton(Character.toString(model.getBoardSquare(8)));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (!buttonClicked.getText().equals("*")){
            System.out.println("That is not an option");
        } else if (model.player == 1){
            buttonClicked.setText("X");
            updateModel(view);
            model.checkWinner();
            if (model.isWinner) {
                System.out.println("We have a winner! X");
                model.resetBoard();
                updateView(model);
            } else {
                model.switchPlayer();
            }
        } else {
            buttonClicked.setText("O");
            updateModel(view);
            model.checkWinner();
            if (model.isWinner) {
                System.out.println("We have a winner!");
                model.resetBoard();
                updateView(model);
            }
            model.switchPlayer();
        }
    }
}



