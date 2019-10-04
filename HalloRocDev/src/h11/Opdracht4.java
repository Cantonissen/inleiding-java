package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends Applet {

    int teller, resultaat;

    public void init () {
        teller = 1;
        resultaat = teller * 5;
        teller++;

    }
    public void paint (Graphics g) {
        int x = 50;
        int y = 50;

        for (int i = 10; i <teller ; i++) {
            g.drawString(" * 5=" + teller,x, y);

        }
    }
}
