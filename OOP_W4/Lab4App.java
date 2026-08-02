package OOP_W4;

import java.awt.*;

public class Lab4App extends Frame {

    int fW = 800;
    int fH = 600;

    Lab4App() {
        setLayout(null);
        setSize(fW, fH);
        int tfW = 200, tfH = 30;
        TextField tf = new TextField(20);
        int btnW = 100, btnH = 30;
        Button btn = new Button("Click");
        tf.setBounds((fW - tfW) / 2, 80, tfW, tfH);
        btn.setBounds((fW - btnW) / 2, 130, btnW, btnH);
        add(tf);
        add(btn);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Lab4App();
    }
    
}
