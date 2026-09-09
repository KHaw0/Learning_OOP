package OOP_W6.ch3;

import javax.swing.*;

public class StopWatch extends JFrame{

    private JLabel lblTme = new JLabel();
    private JButton btnControl = new JButton("Start");
    private StopWatchThread swThread = new StopWatchThread(lblTme);
    private boolean isRunning = swThread.running;

    StopWatch() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        lblTme.setBounds(160, 100, 100, 20);
        add(lblTme);
        btnControl.addActionListener(e -> {
            if(isRunning){   
                isRunning = !isRunning;
                btnControl.setText("Start");
            } else {
                isRunning = !isRunning;
                btnControl.setText("Stop");
            }
            swThread.running = isRunning;
        });
        swThread.start();
        btnControl.setBounds(140, 200, 100, 50);
        add(btnControl);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StopWatch();
    }
}
