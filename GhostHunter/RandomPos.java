package GhostHunter;

import java.util.*;

public class RandomPos extends TimerTask {

    Random rd = new Random();
    Scene game;
    int threadId;

    RandomPos(Scene scene, int id) {
        this.game = scene;
        this.threadId = id;
    }

    @Override
    public void run() {
        game.posX[threadId] += -20 + (int) (Math.random() * 41);
        game.posY[threadId] += -20 + (int) (Math.random() * 41);

        if (game.posX[threadId] < 0)
            game.posX[threadId] = 0;
        else if (game.posX[threadId] > 950)
            game.posX[threadId] = 950;

        if (game.posY[threadId] < 0)
            game.posY[threadId] = 0;
        else if (game.posY[threadId] > 500)
            game.posY[threadId] = 500;

        game.repaint();
    }
}