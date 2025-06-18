import javax.swing.*;

public class GameController {

    private GameBoard model;
    private GamePlayer view;

    public GameController(GameBoard model, GamePlayer view) {
        this.model = model;
        this.view = view;

        model.topLeft = view.getTopLeftButton().getText().charAt(0);
        model.topMid =  view.getTopMiddleButton().getText().charAt(0);
        model.topRight = view.getTopRightButton().getText().charAt(0);
        model.midLeft = view.getMiddleLeftButton().getText().charAt(0);
        model.midMid = view.getMiddleMiddleButton().getText().charAt(0);
        model.midRight = view.getMiddleRightButton().getText().charAt(0);
        model.bottomLeft = view.getBottomLeftButton().getText().charAt(0);
        model.bottomMid = view.getBottomMiddleButton().getText().charAt(0);
        model.bottomRight = view.getBottomRightButton().getText().charAt(0);
        model.isWinner = false;
        model.player = 1;

        view.playerOne();
        view.clickedButton()


        //view.updateBoxValue("x", view.getBottomRightButton());

    }

    public void updateView(JButton button, String str) {
        view.setButton(button, str);
    }

}
