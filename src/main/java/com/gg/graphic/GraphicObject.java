package com.gg.graphic;

import com.gg.Vector2;

import java.awt.*;

public class GraphicObject {
    Graphics2D graphics2D;
    Vector2 position;
    Vector2 size;
    Color color;

    public GraphicObject(Graphics graphics) {
        this.graphics2D=(Graphics2D)graphics;
        position = new Vector2(0,0);
        size = new Vector2(0,0);
        color = Color.black;
    }

    public void setPosition(Vector2 position){
        this.position = position;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint() {
        graphics2D.setColor(color);
        graphics2D.drawRect(position.x,position.y,size.x,size.y);
    }
}
