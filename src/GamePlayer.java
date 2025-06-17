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

    void playerOne() {
        topLeftButton.setActionCommand("Top Left X");
        topMiddleButton.setActionCommand("Top Middle");
        topRightButton.setActionCommand("Top Right");

        topLeftButton.addActionListener(new ButtonClickListener());
        topRightButton.addActionListener(new ButtonClickListener());
        topMiddleButton.addActionListener(new ButtonClickListener());
    }

    void playerTwo() {
        topLeftButton.setActionCommand("Top Left O");

        topLeftButton.addActionListener(new ButtonClickListener());

    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if(command.equals("Top Left")) {
                topLeftButton.setText("X");
            } else if(command.equals("Top Middle")) {
                topMiddleButton.setText("click");
            } else if (command.equals("Top Right")) {
                topRightButton.setText("click");
            } else if (command.equals("Top Left O")) {
                topLeftButton.setText("O");
            }

        }

    }
}
