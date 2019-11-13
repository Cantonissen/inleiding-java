package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {

    Button brick, concrete;

    public void init(){
        setSize(1000,500);
        concrete = new Button("Beton");
        brick = new Button("Baksteen");
        concrete.addActionListener(new concreteListener());
        brick.addActionListener(new brickListener());
        add(concrete);
        add(brick);
    }

    public void paint(Graphics g) {
        int xBrick = 20;
        int yBrick = 20;
        int brickWidth = 40;
        int brickHeight = 20;
        int xConcrete = 25;
        int yConcrete = 25;
        int concreteWidth = 45;
        int concreteHeight = 25;

        //drawBrickwall(g, xBrick, yBrick, brickWidth, brickHeight);
        //drawConcretewall(g, xConcrete, yConcrete, concreteWidth, concreteHeight);
    }

    private void drawBrickwall (Graphics g, int xBrick, int yBrick, int brickWidth, int brickHeight) {
        for (int i = 0; i < 10; i++) {
            xBrick = 20;
            for (int j = 0; j < 20; j++) {
                g.setColor(Color.red);
                g.fillRect(xBrick, yBrick, brickWidth, brickHeight);
                g.setColor(Color.black);
                g.drawRect(xBrick, yBrick, brickWidth, brickHeight);
                xBrick += brickWidth;
            }
            yBrick += brickHeight;
        }
    }
    private void drawConcretewall (Graphics g, int xConcrete, int yConcrete, int concreteWidth, int concreteHeight) {
        for (int i = 0; i < 10; i++) {
            xConcrete = 20;
            for (int j = 0; j <20; j++) {
                g.setColor(Color.gray);
                g.fillRect(xConcrete, yConcrete, concreteWidth, concreteHeight);
                g.setColor(Color.BLACK);
                g.drawRect(xConcrete, yConcrete, concreteWidth, concreteHeight);
                xConcrete += concreteWidth;
            }
            yConcrete += concreteHeight;
        }
    }
    class concreteListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            drawConcretewall(getGraphics(), 50, 50, 100, 40);
        }
    }
    class brickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            drawBrickwall(getGraphics(), 30, 30, 80, 40);
        }
    }


}

