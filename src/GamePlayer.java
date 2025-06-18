import javax.swing.*;
import java.awt.event.ActionEvent;
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

    public void setButton(JButton button, String newValue) {
        button.setText(newValue);
    }

    public void setTopLeftButton(){
        topLeftButton.setText("X");
    }


    public void updateBoxValue(String newValue, JButton newButton) {
        newButton.setText(newValue);
    }


    void playerOne() {
        topLeftButton.setActionCommand("Top Left");
        topMiddleButton.setActionCommand("Top Middle");
        topRightButton.setActionCommand("Top Right");
        middleLeftButton.setActionCommand("Middle Left");
        middleMiddleButton.setActionCommand("Middle Middle");
        middleRightButton.setActionCommand("Middle Right");
        bottomLeftButton.setActionCommand("Bottom Left");
        bottomMiddleButton.setActionCommand("Bottom Middle");
        bottomRightButton.setActionCommand("Bottom Right");

        topLeftButton.addActionListener(new ButtonClickListener());
        topRightButton.addActionListener(new ButtonClickListener());
        topMiddleButton.addActionListener(new ButtonClickListener());
        middleLeftButton.addActionListener(new ButtonClickListener());
        middleRightButton.addActionListener(new ButtonClickListener());
        middleMiddleButton.addActionListener(new ButtonClickListener());
        bottomLeftButton.addActionListener(new ButtonClickListener());
        bottomRightButton.addActionListener(new ButtonClickListener());
        bottomMiddleButton.addActionListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if(command.equals("Top Left")) {
                topLeftButton.setText("X");
            } else if(command.equals("Top Middle")) {
                topMiddleButton.setText("X");
            } else if (command.equals("Top Right")) {
                topRightButton.setText("X");
            } else if(command.equals("Middle Left")) {
                middleLeftButton.setText("X");
            } else if(command.equals("Middle Middle")) {
                middleMiddleButton.setText("X");
            } else if (command.equals("Middle Right")) {
                middleRightButton.setText("X");
            }else if(command.equals("Bottom Left")) {
                bottomLeftButton.setText("X");
            } else if(command.equals("Bottom Middle")) {
                bottomMiddleButton.setText("X");
            } else if (command.equals("Bottom Right")) {
                bottomRightButton.setText("X");
            }
        }

    }
}
