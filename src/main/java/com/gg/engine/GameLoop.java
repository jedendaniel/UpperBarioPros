package com.gg.engine;

public class GameLoop implements Runnable {

    private static GameLoop instance;

    private GameLoop() {
    }

    public static GameLoop getInstance(){
        if(instance == null) instance = new GameLoop();
        return instance;
    }

    @Override
    public void run() {
        new Thread(this, "GameLoop");
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
