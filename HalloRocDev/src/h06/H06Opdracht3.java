package h06;

import java.applet.Applet;
import java.awt.*;

public class H06Opdracht3 extends Applet {
    //Positieve getallen
    int positief;
    int negatief;
    String uitkomst;


    public void init() {
        //Berekening positief + positief negatief maken
        int positief = 5;
        int negatief = positief * -1;
        int uitkomst = negatief;
        positief = positief+negatief;
    }

    public void paint (Graphics g) {

        g.drawString("Negatieve getal " + uitkomst,50,50);
    }
}
