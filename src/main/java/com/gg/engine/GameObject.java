package com.gg.engine;

import com.gg.Vector2;
import com.gg.graphic.GraphicObject;
import com.gg.physic.PhysicObject;

import java.awt.*;

public class GameObject {
    GraphicObject graphicObject;
    PhysicObject physicObject;

    Vector2 position;
    Vector2 size;

    public GameObject(Graphics graphics, PhysicObject physicObject) {
        this.graphicObject = new GraphicObject(graphics);
        this.physicObject = physicObject;
        position = new Vector2(0,0);
        size = new Vector2(0,0);
    }

    public void setPosition(Vector2 position) {
        this.position = position;
        graphicObject.setPosition(position);
    }

    public void setSize(Vector2 size) {
        this.size = size;
        graphicObject.setPosition(size);
    }

    public void test(){
        graphicObject.setPosition(position.move(1,1));
        graphicObject.paint();
    }
}
