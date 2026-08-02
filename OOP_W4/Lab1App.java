package OOP_W4;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lab1App extends Frame {

    Lab1App() {
        setLayout(new GridLayout(4, 5));
        for (int i = 1; i <= 20; i++) {
            add(new Button("Button " + i));
        }
        setSize(500, 300);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new Lab1App();

    }
}
