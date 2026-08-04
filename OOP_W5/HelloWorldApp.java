package OOP_W5;

import java.awt.*;
import javax.swing.*;

public class HelloWorldApp extends JFrame {

    HelloWorldApp() {
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField tf = new JTextField(20);
        JButton btn = new JButton("Click here");
        add(tf);
        add(btn);
        btn.addActionListener(e -> {
            setText();
        });
        setVisible(true);
    }

    public void setText() {
        JLabel lbl = new JLabel("Hello World!!!");
        setTitle("Hello World!!!");
        add(lbl);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new HelloWorldApp();
    }
}
