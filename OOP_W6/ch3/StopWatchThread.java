package OOP_W6.ch3;

import javax.swing.*;

public class StopWatchThread extends Thread {

    private JLabel label;
    private long elapsedMs = 0;
    public boolean running = false;

    StopWatchThread(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        label.setText("00:00:000");
        while (true) {
            while (running) {
                elapsedMs++;
                label.setText(format());
                try {
                    Thread.sleep(1);
                } catch (Exception e) {

                }
            }
            try {
                Thread.sleep(1);
            } catch (Exception e) {

            }
        }
    }

    private String format() {
        long mm = elapsedMs / 60000;
        long sec = (elapsedMs / 1000) % 60;
        long ms = elapsedMs % 1000;
        return String.format("%02d:%02d:%03d", mm, sec, ms);
    }
}
