package test_OOP_Mid;

import java.awt.*;
import javax.swing.*;

public class DigitalTV extends Television implements RemoteControl {

    private String antenna;
    private JFrame remFrame = new JFrame();
    private JButton btnOn = new JButton("ON");
    private JButton btnOff = new JButton("OFF");

    public DigitalTV(String brand, int channel, int volume, String antenna) {
        super(brand, channel, volume);
        this.antenna = antenna;
    }

    public void remoteFrame() {
        remFrame.setTitle("Remote");
        remFrame.setSize(350, 500);
        remFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        remFrame.setLayout(new GridLayout(4, 3));

        btnOn.addActionListener(e -> {
            turnOn();
        });

        btnOff.addActionListener(e -> {
            turnOff();
        });

        setBtnNum();
        remFrame.add(btnOn);
        remFrame.add(btnOff);
        remFrame.setVisible(true);
    }

    public void setBtnNum() {
        for (int i = 9; i >= 0; i--) {
            int ch = i;
            JButton btnNum = new JButton(i + "");
            btnNum.addActionListener(e -> {
                if (status) {
                    setChannel(ch);
                }
            });
            remFrame.add(btnNum);
        }
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

}
