package com.gg;

import com.gg.engine.GameLoop;
import com.gg.engine.MainContainer;
import com.gg.graphic.GameFrame;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UpperBarioPros{

    private static Runnable displayModule = GameFrame.getInstance();
    private static Runnable gameLoop = GameLoop.getInstance();

    public static void main(String[] args) throws InterruptedException {
        MainContainer.getInstance().load();
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(gameLoop);
        service.submit(displayModule);
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        System.exit(0);
    }

    public UpperBarioPros() {
    }
}
