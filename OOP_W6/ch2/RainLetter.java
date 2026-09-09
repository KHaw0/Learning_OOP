package OOP_W6.ch2;

import javax.swing.*;

public class RainLetter extends JFrame {

    private JLabel[] lbl = new JLabel[26];
    private LetterThread[] letterThreads = new LetterThread[26];
    private JButton btnStart = new JButton("Start");
    private boolean started = true;

    RainLetter() {
        setSize(800, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int x = 50;
        for (int i = 0; i < lbl.length; i++) {
            lbl[i] = new JLabel(Character.toString('A' + i));
            lbl[i].setBounds(x, 50, 20, 20);
            letterThreads[i] = new LetterThread(lbl[i], x, 450);
            add(lbl[i]);
            x += 26;
        }
        btnStart.addActionListener(e -> {
            if (started) {
                started = !started;
                btnStart.setText("Stop");
                for (LetterThread thread : letterThreads) {
                    thread.running = true;
                }
            } else {
                started = !started;
                btnStart.setText("Start");
                for (LetterThread thread : letterThreads) {
                    thread.running = false;
                }
            }
        });
        btnStart.setBounds(350, 500, 100, 50);
        for(LetterThread thread : letterThreads){
            thread.start();
        }
        add(btnStart);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RainLetter();
    }
}
