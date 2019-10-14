package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    int teller, resultaat;

    public void init () {
    }
    public void paint (Graphics g) {
        int x = 50;
        int y = 50;

        for (int i = 1; i <=10 ; i++) {
            int teller = i * 3;
            g.drawString(" x 3 = " + teller,x, y);
            y += 10;

        }
    }
}
