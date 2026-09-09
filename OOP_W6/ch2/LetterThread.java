package OOP_W6.ch2;

import java.util.*;
import javax.swing.*;

class LetterThread extends Thread {

    private JLabel lbl = new JLabel();
    private int x;
    private int maxY;
    public boolean running = false;

    LetterThread(JLabel lbl, int x, int maxY) {
        this.lbl = lbl;
        this.x = x;
        this.maxY = maxY;
    }

    @Override
    public void run() {
        int y = 50;
        while (true) {
            while (running) {
                int speed = 1 + new Random().nextInt(5);
                y += speed;
                lbl.setLocation(x, y);
                try {
                    Thread.sleep(40);
                } catch (Exception e) {

                }
                if (y > maxY)
                    y = 50;
            }
            // try {
            //     Thread.sleep(40);
            // } catch (Exception e) {

            // }
        }
    }
}