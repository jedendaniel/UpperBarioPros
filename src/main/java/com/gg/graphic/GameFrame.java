package com.gg.graphic;

import com.gg.Vector2;
import com.gg.engine.GameObject;
import com.gg.engine.MainContainer;
import com.gg.engine.MouseInput;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame implements Runnable {

    private static GameFrame instance = new GameFrame();
    private MainContainer mainContainer = MainContainer.getInstance();

    private GameFrame() throws HeadlessException {
        super("Upper Bario Pros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 400);
        addMouseListener(new MouseInput());
        Timer timer = new Timer(20, arg0 -> GameFrame.this.repaint());
        timer.start();
    }

    public static GameFrame getInstance(){
        return instance;
    }

    @Override
    public synchronized void paint(Graphics g){
        refresh(g);
        mainContainer.getGameObjects().forEach(gameObject -> draw(g, gameObject));
    }

    @Override
    public void run() {
    }

    private void refresh(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void draw(Graphics g, GameObject gameObject){
        Graphics2D graphics2D = (Graphics2D)g;
        Vector2 position = gameObject.getPosition();
        Vector2 size = gameObject.getSize();
        g.setColor(Color.BLACK);
        graphics2D.drawRect(position.x, position.y, size.x, size.y);
    }
}
