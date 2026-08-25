package test_OOP_Mid;

import javax.swing.*;

public class MyApp extends JFrame{
    public static void main(String[] args) {
        DigitalTV digitalTV = new DigitalTV("TV2", 0, 0, "Antenna 1");
        
        digitalTV.tvFrame();
        digitalTV.remoteFrame();
    }
}
