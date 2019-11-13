package h13;

import sun.plugin2.util.ColorUtil;

import java.applet.Applet;
import java.awt.*;
import java.awt.color.*;

public class EindOpdracht extends Applet {
    public void init() {
        setSize(1200, 800);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 200;
        int width = 80;
        int height = 200;
        int trees = 5;
        drawForestfront(g, x, y, width, height, trees);
        drawForestBack(g, x, y, width, height, trees);
    }

    private void drawForestfront(Graphics g, int x, int y, int width, int height, int trees) {
        for (int i = 0; i < 5; i++) {
            x = 200;
        }
        int baseovalpos = 0;
        Color customColor = new Color(121, 89, 60);
        for (int i = 0; i < 5; i++) {
            g.setColor(customColor);
            baseovalpos = i * 200 + 140;
            g.fillRect(x, y, width, height);
            g.setColor(Color.GREEN);
            g.fillOval(baseovalpos + 100, 150, 80, 100);
            g.fillOval(baseovalpos + 20, 150, 80, 100);
            g.fillOval(baseovalpos + 60, 120, 80, 100);
            g.fillOval(baseovalpos, 180, 80, 100);
            g.fillOval(baseovalpos + 120, 180, 80, 100);
            g.fillOval(baseovalpos + 60, 160, 80, 100);
            x += 200;
            trees++;
        }
    }

    private void drawForestBack(Graphics g, int x, int y, int width, int height, int trees) {
        for (int i = 0; i < 5; i++) {
            x = 130;
            y = 500;
        }
        int row2ovalpos = 0;
        Color customColor = new Color(121, 89, 60);
        for (int i = 0; i < 5; i++) {
            g.setColor(customColor);
            row2ovalpos = i * 200 + 0;
            g.fillRect(x, y, width, height);
            g.setColor(Color.GREEN);
            g.fillOval(row2ovalpos + 70, 460, 80, 100);
            g.fillOval(row2ovalpos + 100, 430, 80, 100);
            g.fillOval(row2ovalpos + 130, 400, 80, 100);
            g.fillOval(row2ovalpos + 130, 435, 80, 100);
            g.fillOval(row2ovalpos + 190, 460, 80, 100);
            g.fillOval(row2ovalpos + 160, 430, 80, 100);
            x += 200;
            trees++;
        }
    }
}


