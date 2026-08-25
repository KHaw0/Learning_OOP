package OOP_EX2;

import java.awt.*;
import javax.swing.*;

public class LightSwitch extends JFrame {

    JPanel pnlBtn = new JPanel(new FlowLayout());
    JButton btn = new JButton("ON");
    JLabel lblImage = new JLabel();
    JPanel pnlImage = new JPanel(new FlowLayout());
    boolean status = false;
    ImageIcon lightOff = new ImageIcon("C:\\Learning_OOP\\OOP_EX2\\images\\1.jpg");
    ImageIcon lightOn = new ImageIcon("C:\\Learning_OOP\\OOP_EX2\\images\\2.jpg");

    LightSwitch() {
        setTitle("Light Switch");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lblImage.setIcon(lightOff);

        btn.addActionListener(e -> {
            status = !status;
            if (status) {
                btn.setText("OFF");
                lblImage.setIcon(lightOn);
            } else {
                btn.setText("ON");
                lblImage.setIcon(lightOff);
            }
        });

        pnlImage.add(lblImage);
        pnlBtn.add(btn);

        add(pnlImage, BorderLayout.CENTER);
        add(pnlBtn, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LightSwitch();
    }
}