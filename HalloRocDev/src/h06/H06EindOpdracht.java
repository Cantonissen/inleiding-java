package h06;

import java.applet.Applet;
import java.awt.*;

public class H06EindOpdracht extends Applet {
    double a, b, c, uitkomst;

    public void init() {
        //Berekening gemiddeld cijfer

        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;
        uitkomst *=  10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

        }
        public void paint(Graphics g) {

        g.drawString(String.valueOf (uitkomst),50,50);
        }



}
