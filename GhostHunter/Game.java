package GhostHunter;

import javax.swing.*;

public class Game extends JFrame {

    Game() {
        setSize(1000, 563);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        Game game = new Game();
        Scene scene = new Scene();

        scene.setBounds(0, 0, 1000, 563);

        game.add(scene);
        game.setVisible(true);
    }
}
