import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    private JButton btn;
    private JLabel passwordLabel;
    private JPanel panel;

    public GUI(){
        btn = new JButton("Generate password");
        btn.addActionListener(this);
        passwordLabel = new JLabel("");
        panel = new JPanel();
        FlowLayout fl = new FlowLayout();
        panel.setLayout(fl);
        panel.add(passwordLabel);
        panel.add(btn);
        this.setContentPane(panel);
        pack();
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setVisible(true);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String password = PasswordGenerator.generateStrongPassword();
        passwordLabel.setText(password);
    }
}
