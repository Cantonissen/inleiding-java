package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    public void init(){
        setSize(300,300);
    }

    public void paint(Graphics g){
        int x = 50;
        int y = 70;

        for (int i = 20; i >=10; i--) {
            g.drawString("Cijfer " +  i ,x,y);
            y += 10;
        }
    }
}
