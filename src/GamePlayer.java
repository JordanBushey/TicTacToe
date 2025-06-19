import javax.swing.*;
import java.awt.event.ActionListener;

public class GamePlayer extends JFrame  {
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
        prepareGUI();
    }

    void prepareGUI() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        //Set Frame Location to the center of the screen
        setLocationRelativeTo(null);


    }

    public JButton getTopLeftButton() {
        return topLeftButton;
    }

    public JButton getTopMiddleButton() {
        return topMiddleButton;
    }

    public JButton getTopRightButton() {
        return topRightButton;
    }
    public JButton getMiddleLeftButton() {
        return middleLeftButton;
    }

    public JButton getMiddleMiddleButton() {
        return middleMiddleButton;
    }

    public JButton getMiddleRightButton() {
        return middleRightButton;
    }
    public JButton getBottomLeftButton() {
        return bottomLeftButton;
    }

    public JButton getBottomMiddleButton() {
        return bottomMiddleButton;
    }

    public JButton getBottomRightButton() {
        return bottomRightButton;
    }

    public void setTopLeftButton(String value){
        topLeftButton.setText(value);
    }

    public void setTopMiddleButton(String value){
        topMiddleButton.setText(value);
    }

    public void setTopRightButton(String value) {
        topRightButton.setText(value);
    }

    public void setMiddleLeftButton(String value) {
        middleLeftButton.setText(value);
    }

    public void setMiddleMiddleButton(String value) {
        middleMiddleButton.setText(value);
    }

    public void setMiddleRightButton(String value) {
        middleRightButton.setText(value);
    }

    public void setBottomLeftButton(String value) {
        bottomLeftButton.setText(value);
    }

    public void setBottomMiddleButton(String value) {
        bottomMiddleButton.setText(value);
    }

    public void setBottomRightButton(String value) {
        bottomRightButton.setText(value);
    }



    void clickListener(ActionListener listener) {
        topLeftButton.addActionListener(listener);
        topRightButton.addActionListener(listener);
        topMiddleButton.addActionListener(listener);
        middleLeftButton.addActionListener(listener);
        middleRightButton.addActionListener(listener);
        middleMiddleButton.addActionListener(listener);
        bottomLeftButton.addActionListener(listener);
        bottomRightButton.addActionListener(listener);
        bottomMiddleButton.addActionListener(listener);
    }


}
