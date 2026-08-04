package OOP_W5;

import java.awt.*;
import javax.swing.*;

public class MutiTableApp extends JFrame {

    JLabel lblH = new JLabel("Multipli:");
    JTextField tfH = new JTextField(15);
    JButton btnH = new JButton("Show");
    JTextArea result = new JTextArea();
    int multipli;

    MutiTableApp() {
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setUI();
        btnH.addActionListener(e -> {
            setMultipli();
        });
        setVisible(true);
    }

    public void setUI() {
        add(lblH);
        add(tfH);
        add(btnH);
    }

    public void setMultipli() {
        try {
            multipli = Integer.parseInt(tfH.getText());
            setTable();
        } catch (NumberFormatException e) {
            errorAlert();
        }
    }

    public void setTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            sb.append(multipli + " x " + i + " = " + (multipli * i) + "\n");
        }
        result.setText(sb.toString());
        add(result);
        revalidate();
    }

    public void errorAlert() {
        result.setText("Error: กรุณาป้อนตัวเลขเท่านั้น");
        result.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(result);
        revalidate();
    }

    public static void main(String[] args) {
        new MutiTableApp();
    }
}
