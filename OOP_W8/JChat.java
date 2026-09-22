package OOP_W8;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;

public class JChat extends JFrame {

    JTextArea areaChat = new JTextArea();
    JTextField tfIP = new JTextField("localhost", 10);
    JTextField tfMessage = new JTextField(10);
    JButton btnSend = new JButton("Send");

    final int PORT = 55555;

    JChat() {
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        areaChat.setEditable(false);
        add(new JScrollPane(areaChat), BorderLayout.CENTER);

        JPanel pnlSouth = new JPanel(new BorderLayout());

        JPanel pnlMessage = new JPanel();
        pnlMessage.setLayout(new BoxLayout(pnlMessage, BoxLayout.PAGE_AXIS));
        pnlMessage.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JPanel rowIP = new JPanel(new BorderLayout());
        rowIP.add(new JLabel("IP:"), BorderLayout.WEST);
        rowIP.add(tfIP, BorderLayout.CENTER);

        JPanel rowMessage = new JPanel(new BorderLayout());
        rowMessage.add(new JLabel("Message:"), BorderLayout.WEST);
        rowMessage.add(tfMessage, BorderLayout.CENTER);

        pnlMessage.add(rowIP);
        pnlMessage.add(Box.createRigidArea(new Dimension(0, 5)));
        pnlMessage.add(rowMessage);

        JPanel pnlBtnSend = new JPanel();
        pnlBtnSend.add(btnSend, SwingConstants.CENTER);

        btnSend.addActionListener(e -> {
            try {
                Socket socket = new Socket(tfIP.getText(), PORT);
                PrintStream out = new PrintStream(socket.getOutputStream());

                InetAddress myAddr = InetAddress.getLocalHost();
                String msg = myAddr.getHostName() + "#" + tfMessage.getText();
                out.println(msg);
                out.close();

                tfMessage.setText("");
            } catch (Exception er) {
                areaChat.insert("[Error: ส่งไม่ได้ ตรวจสอบ IP]\n", 0);
            }
        });

        JPanel pnlNorth = new JPanel();
        pnlNorth.setLayout(new BoxLayout(pnlNorth, BoxLayout.Y_AXIS));

        try {
            InetAddress myIP = InetAddress.getLocalHost();
            pnlNorth.add(Box.createRigidArea(new Dimension(0, 5)));
            pnlNorth.add(new JLabel("MyIP: " + myIP.getHostAddress()));
            pnlNorth.add(Box.createRigidArea(new Dimension(0, 5)));
        } catch (Exception e) {
        }

        pnlSouth.add(pnlMessage, BorderLayout.CENTER);
        pnlSouth.add(pnlBtnSend, BorderLayout.EAST);

        add(pnlNorth, BorderLayout.NORTH);
        add(pnlSouth, BorderLayout.SOUTH);
        setVisible(true);

        startServerThread();
    }

    void startServerThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(PORT);
                    while (true) {
                        try {
                            Socket socket = serverSocket.accept();
                            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            String line;
                            while ((line = in.readLine()) != null) {
                                areaChat.insert(line + "\n", 0);
                            }
                            in.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new JChat();
    }
}