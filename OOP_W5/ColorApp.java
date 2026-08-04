package OOP_W5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ColorApp extends JFrame{

    int x, y, r, g, b;
    JTextField tf = new JTextField(25);
    JPanel pnl = new JPanel();
    JLabel lbl = new JLabel();

    ColorApp(){
        setTitle("Interactive Color");
        setSize(512,512);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        readMotion();
        tf.setEditable(false);
        pnl.setBackground(Color.GRAY);

        add(tf, BorderLayout.NORTH);
        add(pnl, BorderLayout.CENTER);

        setVisible(true);
    }

    public void readMotion(){
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e){
                r = e.getX() / 2;
                g = e.getY() / 2;
                b = (e.getX() + e.getY()) / 4;
                tf.setText("x=" + e.getX() + ", y=" + e.getY() + "\t r=" + r + " g=" + g + " b=" + b);
                setColor();
            }
        });
    }

    public void setColor(){
        pnl.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new ColorApp();
    }
}
