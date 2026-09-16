package GhostHunter;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import java.util.Timer;

public class Scene extends JPanel implements MouseMotionListener, MouseListener {

    Random rd = new Random();
    Image bg, sight, ghost;
    int x = 0, y = 0;
    int[] posX, posY;
    boolean[] show;
    boolean shot = false;
    Date start, stop;
    double diffSec = 0;
    int n = 10;

    Scene() {
        bg = Toolkit.getDefaultToolkit().createImage(getClass().getResource("background.jpg"));
        sight = Toolkit.getDefaultToolkit().createImage(getClass().getResource("sight.gif"));
        ghost = Toolkit.getDefaultToolkit().createImage(getClass().getResource("ghost.png"));

        posX = new int[n];
        posY = new int[n];
        show = new boolean[n];
        for (int i = 0; i < posX.length; i++) {
            posX[i] = rd.nextInt(1000 - 100);
            posY[i] = rd.nextInt(563 - 100);
            show[i] = true;
        }

        start = new Date();

        Timer[] t = new Timer[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Timer();
            t[i].scheduleAtFixedRate(new RandomPos(this, i), 0, 100);
        }

        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, 1000, 563, this);

        g.setFont(new Font("Tahoma", Font.PLAIN, 40));
        g.setColor(Color.WHITE);
        g.drawString("Ghost Hunter", 700, 100);
        g.drawRect(665, 50, 300, 70);

        g.drawImage(sight, x, y, this);

        int dead = 0;
        for (int i = 0; i < posX.length; i++) {
            if (show[i]) {
                g.drawImage(ghost, posX[i], posY[i], this);
            } else {
                dead++;
            }
        }

        if (n == dead) {
            if (diffSec == 0) {
                stop = new Date();
                diffSec = Math.abs(stop.getTime() - start.getTime()) / 1000.0;
            }
            g.drawString("Time: " + diffSec + "sec.", 370, 300);
        }

        if (shot) {
            g.setColor(Color.RED);
            g.drawLine(500, 563, x + 50, y + 50);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX() - 50;
        y = e.getY() - 50;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        shot = true;

        try {
            File f = new File(System.getProperty("user.dir") + "/GhostHunter/gun.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(f);
            AudioFormat format = stream.getFormat();
            Clip clip = (Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, format));
            clip.open(stream);
            clip.start();
        } catch (Exception er) {
            System.out.println(er.getMessage());
        }

        int cx = e.getX(), cy = e.getY();
        for (int i = 0; i < n; i++) {
            if (cx >= posX[i] && cx <= posX[i] + 100
                    && cy >= posY[i] && cy <= posY[i] + 100) {
                show[i] = false;
            }
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        shot = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
