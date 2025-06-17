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

    public String getTopLeftButton() {
        return topLeftButton.getText();
    }

    public String getTopMiddleButton() {
        return topMiddleButton.getText();
    }

    public String getTopRightButton() {
        return topRightButton.getText();
    }
    public String getMiddleLeftButton() {
        return middleLeftButton.getText();
    }

    public String getMiddleMiddleButton() {
        return middleMiddleButton.getText();
    }

    public String getMiddleRightButton() {
        return middleRightButton.getText();
    }
    public String getBottomLeftButton() {
        return bottomLeftButton.getText();
    }

    public String getBottomMiddleButton() {
        return bottomMiddleButton.getText();
    }

    public JButton getBottomRightButton() {
        return bottomRightButton;
    }

    public char getBottomRightChar() {
        return bottomRightButton.getText().charAt(0);
    }

    public void updateBoxValue(String newValue, JButton newButton) {
        newButton.setText(newValue);
    }

    void playerOne() {
        topLeftButton.setActionCommand("Top Left X");
        topMiddleButton.setActionCommand("Top Middle X");
        topRightButton.setActionCommand("Top Right X");
        middleLeftButton.setActionCommand("Middle Left X");
        middleMiddleButton.setActionCommand("Middle Middle X");
        middleRightButton.setActionCommand("Middle Right X");
        bottomLeftButton.setActionCommand("Bottom Left X");
        bottomMiddleButton.setActionCommand("Bottom Middle X");
        bottomRightButton.setActionCommand("Bottom Right X");

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

    void playerTwo() {
        topLeftButton.setActionCommand("Top Left O");
        topMiddleButton.setActionCommand("Top Middle O");
        topRightButton.setActionCommand("Top Right O");
        middleLeftButton.setActionCommand("Middle Left O");
        middleMiddleButton.setActionCommand("Middle Middle O");
        middleRightButton.setActionCommand("Middle Right O");
        bottomLeftButton.setActionCommand("Bottom Left O");
        bottomMiddleButton.setActionCommand("Bottom Middle O");
        bottomRightButton.setActionCommand("Bottom Right O");

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

            if(command.equals("Top Left X")) {
                topLeftButton.setText("X");
            } else if(command.equals("Top Middle X")) {
                topMiddleButton.setText("X");
            } else if (command.equals("Top Right X")) {
                topRightButton.setText("X");
            } else if(command.equals("Middle Left X")) {
                middleLeftButton.setText("X");
            } else if(command.equals("Middle Middle X")) {
                middleMiddleButton.setText("X");
            } else if (command.equals("Middle Right X")) {
                middleRightButton.setText("X");
            }if(command.equals("Bottom Left X")) {
                bottomLeftButton.setText("X");
            } else if(command.equals("Bottom Middle X")) {
                bottomMiddleButton.setText("X");
            } else if (command.equals("Bottom Right X")) {
                bottomRightButton.setText("X");
            }  if(command.equals("Top Left O")) {
                topLeftButton.setText("O");
            } else if(command.equals("Top Middle O")) {
                topMiddleButton.setText("O");
            } else if (command.equals("Top Right O")) {
                topRightButton.setText("O");
            } else if(command.equals("Middle Left O")) {
                middleLeftButton.setText("O");
            } else if(command.equals("Middle Middle O")) {
                middleMiddleButton.setText("O");
            } else if (command.equals("Middle Right O")) {
                middleRightButton.setText("O");
            }if(command.equals("Bottom Left O")) {
                bottomLeftButton.setText("O");
            } else if(command.equals("Bottom Middle O")) {
                bottomMiddleButton.setText("O");
            } else if (command.equals("Bottom Right O")) {
                bottomRightButton.setText("O");
            }

        }

    }
}
