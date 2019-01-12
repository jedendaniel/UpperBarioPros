package com.gg;

import com.gg.engine.GameObject;
import com.gg.graphic.GraphicObject;
import com.gg.physic.PhysicObject;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UpperBarioPros extends Frame {
    GameObject gameObject;

    public static void main(String[] args) {
        new UpperBarioPros();
    }

    public UpperBarioPros() throws HeadlessException {
        super("Java 2D Example01");
        setSize(400,300);
        setVisible(true);
        addWindowListener(new WindowAdapter()
              {public void windowClosing(WindowEvent e)
                 {dispose(); System.exit(0);}
              }
        );
    }

    @Override
    public void paint(Graphics g){
        gameObject = new GameObject(g, new PhysicObject());
        gameObject.setSize(new Vector2(5,5));
        for (int i = 0; i < 1000; i++){
            gameObject.test();
        }
    }


}
