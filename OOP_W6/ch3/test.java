package OOP_W6.ch3;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

    private float hue = 0f;

    test() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Tahoma", Font.BOLD, 40));

        add(label);

        Timer colorTimer = new Timer(30, e -> {
            hue += 0.005f;
            if (hue > 1f) hue = 0f;

            Color rgbColor = Color.getHSBColor(hue, 1f, 1f);
            label.setForeground(rgbColor);
        });
        colorTimer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}