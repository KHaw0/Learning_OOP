package OOP_W6.ch1;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class ColorThread extends Thread {

    private JLabel lbl;
    private int sleepMin;
    private int sleepMax;

    ColorThread(JLabel lbl, int min, int max) {
        this.lbl = lbl;
        this.sleepMin = min;
        this.sleepMax = max;
    }

    @Override
    public void run() {
        while (true) {
            Random rnd = new Random();
            Color c = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            lbl.setBackground(c);
            lbl.setOpaque(true);
            try {
                int delay = (sleepMin + rnd.nextInt(sleepMax - sleepMin + 1));
                Thread.sleep(delay);
            } catch (Exception e) {

            }
        }
    }
}
