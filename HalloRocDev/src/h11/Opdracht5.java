package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int y = 50;
        int x = 50;

        for (int i = 1; i <=5 ; i++) {
            g.drawRect(i + x,i + y,50,50);
            y+=50;
            x+=50;

        }
    }

}
