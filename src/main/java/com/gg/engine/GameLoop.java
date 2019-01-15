package com.gg.engine;

import com.gg.Vector2;

public class GameLoop implements Runnable {

    private static GameLoop instance;
    GameObject gameObject;

    private GameLoop() {
    }

    public static GameLoop getInstance(){
        if(instance == null) instance = new GameLoop();
        return instance;
    }

    @Override
    public void run() {
        new Thread(this, "GameLoop");
        gameObject = new GameObject();
        gameObject.setSize(new Vector2(50,50));
        gameObject.setPosition(new Vector2(100,100));
        while(true){
            move();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void move(){
        gameObject.move(1,1);
    }
}
