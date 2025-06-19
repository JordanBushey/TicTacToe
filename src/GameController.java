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

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        System.out.println(buttonClicked.getText());
        buttonClicked.setText("x");

    }
}



