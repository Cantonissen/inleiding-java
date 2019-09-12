package h06;

import java.applet.Applet;
import java.awt.*;

public class H06Opdracht1 extends Applet {
    double a, uitkomst;
// Berekening
    public void init() {
        a = 113;
        uitkomst = a / 4;
        uitkomst *=10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

    public void paint(Graphics g){
        // Uitkomst berekening
        g.drawString("De uitkomst is: " + uitkomst,20,20);
        // Verdeling
        g.drawString("Jan Krijgt 28,20€",20,40);
        g.drawString("Ali Krijgt 28,20€",20,60);
        g.drawString("Jeanette Krijgt 28,20€",20,80);
        g.drawString("Ik Krijg 28,20€",20,100);

    }

}
