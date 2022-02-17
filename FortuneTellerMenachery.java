// Sangeeth Menachery
// 6.2 - AverageArray & FortuneTeller
// fortuneteller Jframe


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FortuneTellerMenachery extends JFrame
implements ActionListener {

    // Declare an array of "fortunes" (strings):
    String[] names = {
        "I will get an A+ on this assingment",
        "I will get a B+ on this assingment",
        "I will win super mario bros",
        "I will get $5 dollars",
        "You don't have to pay taxes next year"
    };

    private JTextField display;

    public FortuneTellerMenachery() {
        super("Fortune Teller");

        display = new JTextField("  Press \"Next\" to see your fortune...", 25);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e) {
        // Pick and display a random fortune using Math.random
        int numero = (int)(Math.random() * names.length);
        display.setText(names[numero]);
    }

    public static void main(String[] args) {
        JFrame window = new FortuneTellerMenachery();
        window.setBounds(300, 300, 300, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}