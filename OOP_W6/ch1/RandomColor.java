package OOP_W6.ch1;

import java.awt.*;
import javax.swing.*;

public class RandomColor extends JFrame {

    private JLabel lbl1 = new JLabel("Label1");
    private JLabel lbl2 = new JLabel("Label2");
    private JLabel lbl3 = new JLabel("Label3");
    private JLabel lbl4 = new JLabel("Label4");

    public RandomColor() {
        setSize(800, 600);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorThread ct1 = new ColorThread(lbl1, 5000, 5000);
        ColorThread ct2 = new ColorThread(lbl2, 10000, 10000);
        ColorThread ct3 = new ColorThread(lbl3, 1000, 5000);
        ColorThread ct4 = new ColorThread(lbl4, 5000, 10000);
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomColor();
    }
}
