package com.gg;

import com.gg.engine.GameLoop;
import com.gg.engine.GameObject;
import com.gg.graphic.GameFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UpperBarioPros{



    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(new GameFrame());
        service.submit(GameLoop.getInstance());
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        System.exit(0);
    }

    public UpperBarioPros() {
    }
}
