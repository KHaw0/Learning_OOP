package OOP_EX3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BarWidth extends JFrame {

    JPanel pnlBar = new BarPanal();

    BarWidth() {
        setTitle("Bar Width");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(pnlBar, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BarWidth();
    }
}

class BarPanal extends JPanel {

    int barWidth = -1;

    BarPanal() {
        setBackground(Color.WHITE);

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                barWidth = e.getX();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        if (barWidth == -1) {
            int w = getWidth() / 2;
            g.fillRect(0, 0, w, getHeight());
        }else{
            g.fillRect(0, 0, barWidth, getHeight());
        }
    }
}