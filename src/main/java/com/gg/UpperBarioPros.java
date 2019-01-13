package com.gg;

import com.gg.engine.GameLoop;
import com.gg.graphic.GameFrame;

public class UpperBarioPros{


    public static void main(String[] args) {
        new GameFrame();
        GameLoop.getInstance().run();
    }

    public UpperBarioPros(){
    }
}
