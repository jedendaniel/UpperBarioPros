package com.gg.engine;

import java.util.ArrayList;

public class MainContainer {

    private static final MainContainer instance = new MainContainer();
    private ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

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
}
