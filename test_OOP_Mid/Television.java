package test_OOP_Mid;

import java.awt.*;
import javax.swing.*;

public class Television {
    private String brand;
    private int channel;
    private int volume;
    boolean status;
    JFrame frame = new JFrame();
    JPanel pnlTv = new JPanel();
    JLabel chLbl = new JLabel("", SwingConstants.CENTER);

    public Television(String brand, int channel, int volume) {
        this.brand = brand;
        this.channel = channel;
        this.volume = volume;
    }

    public void tvFrame() {
        frame.setTitle("TV");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlTv.setLayout(new BorderLayout());
        pnlTv.setBackground(Color.BLACK);

        chLbl.setFont(new Font("Arial", Font.BOLD, 48));
        chLbl.setForeground(Color.WHITE);
        pnlTv.add(chLbl, BorderLayout.CENTER);

        frame.add(pnlTv);
        frame.setVisible(true);
    }

    public void turnOn() {
        status = true;
        pnlTv.setBackground(Color.BLUE);
        pnlTv.repaint();
        System.out.println(status);
    }

    public void turnOff() {
        status = false;
        pnlTv.setBackground(Color.BLACK);
        chLbl.setText("");
        pnlTv.repaint();
        System.out.println(status);
    }

    public void setChannel(int channel) {
        this.channel = channel;
        chLbl.setText(channel + "");
    }
}
