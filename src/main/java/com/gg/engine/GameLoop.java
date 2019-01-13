package com.gg.engine;

import com.gg.Vector2;

public class GameLoop implements Runnable {

    private static final GameLoop instance = new GameLoop();

    private GameLoop() {
    }

    public static GameLoop getInstance(){
        return instance;
    }

    @Override
    public void run() {
        new Thread(this, "GameLoop");
        GameObject gameObject = new GameObject();
        gameObject.setSize(new Vector2(50,50));
        gameObject.setPosition(new Vector2(100,100));
        for(int i = 0; i < 100; i++){
            gameObject.move(1,1);
        }
    }

    public void start(){
        run();
    }
}
