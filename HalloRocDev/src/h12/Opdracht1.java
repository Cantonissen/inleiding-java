package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

        double gemiddelde[];

    public void init(){
        //Global
        gemiddelde = new double[10];
        //loop
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            gemiddelde[teller] = 100 * teller + 100;
        }
    }
    public void paint(Graphics g){
        for (int teller = 0; teller <gemiddelde.length ; teller++) {
            g.drawString("" + gemiddelde[teller], 50,20  * teller + 20);
            g.drawString("Gemiddelde " + gemiddelde[4],100,20);
            
        }
    }
}
