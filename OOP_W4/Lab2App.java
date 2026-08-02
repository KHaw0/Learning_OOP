package OOP_W4;

import java.awt.*;

public class Lab2App extends Frame{
    Lab2App(){
        setSize(700, 600);
        setLayout(new GridLayout(10, 4));
        for (int i = 1; i <= 20; i++) {
            add(new Button("Button " + i));
            add(new TextArea(3, 10));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab2App();
    }
}
