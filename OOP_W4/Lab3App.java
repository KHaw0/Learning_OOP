package OOP_W4;

import java.awt.*;
import java.util.Random;

public class Lab3App extends Frame{

    int height = 800;
    int width = 600;
    Random rand = new Random();
    
    Lab3App(){
        setSize(width, height);
        setLayout(null);
        for (int i = 1; i <= 50; i++) {
            int ranX = rand.nextInt(750);
            int ranY = rand.nextInt(550);
            Color ranColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            Button btn = new Button("Button " + i);
            btn.setBounds(ranX, ranY, 80, 30);
            btn.setBackground(ranColor);
            add(btn);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab3App();
    }
}
