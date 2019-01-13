package com.gg.engine;

import com.gg.Vector2;

public class GameObject {
    private Vector2 position;
    private Vector2 size;

    public GameObject() {
        MainContainer.getInstance().add(this);
        position = new Vector2(0,0);
        size = new Vector2(0,0);
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getSize() {
        return size;
    }

    public void move(int x, int y){
        position.move(x,y);
    }
}
