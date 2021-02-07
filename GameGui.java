import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.util.Random;

public class GameGui implements ActionListener {
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    private JTextArea text;
    private JLabel label;
    private Random rand = new Random();
    private int randint = rand.nextInt(100);

    public GameGui() {
        frame = new JFrame();
        button = new JButton("enter ");
        text = new JTextArea();
        label = new JLabel("this is sparta ");
        panel = new JPanel();

        button.addActionListener(this);

        panel.add(button);
        panel.add(text);
        panel.add(label);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("calculator");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GameGui();
    }

    public void actionPerformed(ActionEvent e) {
        String guess1 = text.getText();
        Integer guess = Integer.parseInt(guess1);
        if (guess == randint) {
            label.setText("correct");
            randint = rand.nextInt(100);
        } else if (guess > randint) {
            label.setText("lower");
        } else if (guess < randint) {
            label.setText("higher");
        }
    }

}
