package com.gg.engine;

import com.gg.Vector2;

import java.util.ArrayList;

public class MainContainer {

    private static final MainContainer instance = new MainContainer();
    private ArrayList<GameObject> gameObjects = new ArrayList<>();

    private MainContainer() {
    }

    public static MainContainer getInstance() {
        return instance;
    }

    public void add(GameObject gameObject){
        this.gameObjects.add(gameObject);
    }

    public void add(ArrayList<GameObject> objects){
        this.gameObjects.addAll(objects);
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void load(){
        GameObject gameObject = new GameObject();
        gameObject.setSize(new Vector2(50,50));
        gameObject.setPosition(new Vector2(100,100));
        gameObjects.add(gameObject);
    }
}
