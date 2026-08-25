package OOP_EX4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorMix extends JFrame implements KeyListener {

    JTextField rInput;
    JTextField gInput;
    JTextField bInput;
    JPanel color;

    ColorMix() {

        setTitle("Color Mix");
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel input = new JPanel();
        input.setLayout(new FlowLayout());

        color = new JPanel();

        rInput = new JTextField(2);
        gInput = new JTextField(2);
        bInput = new JTextField(2);

        input.add(new JLabel("R"));
        input.add(rInput);

        input.add(new JLabel("G"));
        input.add(gInput);

        input.add(new JLabel("B"));
        input.add(bInput);

        rInput.addKeyListener(this);
        gInput.addKeyListener(this);
        bInput.addKeyListener(this);

        add(input, BorderLayout.NORTH);
        add(color, BorderLayout.CENTER);

        updateColor();

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public boolean isHex(char[] rgb) {
        if (rgb.length != 2) {
            return false;
        }

        for (int i = 0; i < rgb.length; i++) {
            char c = Character.toUpperCase(rgb[i]);
            if (!((c >= '0' && c <= '9') ||
                    (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public void updateColor() {
        String r = rInput.getText();
        String g = gInput.getText();
        String b = bInput.getText();

        String format = "#" + r + g + b;

        if (!isHex(r.toCharArray()) ||
                !isHex(g.toCharArray()) ||
                !isHex(b.toCharArray())) {
            color.setBackground(Color.BLACK);
        } else {
            color.setBackground(Color.decode(format));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { updateColor(); }

    @Override
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        new ColorMix();
    }
}