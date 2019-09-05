package ho4.src.com.company;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {
    public void init(){

    }
    public void paint(Graphics g){

        setBackground(Color.gray);

        g.setColor(Color.white);
        g.drawOval(140,80,100,150);
        g.fillOval(140,80,100,150);
        g.setColor(Color.black);
        g.drawOval(150,95,80,120);
        g.fillOval(150,95,80,120);
        g.setColor(Color.GREEN);
        g.drawOval(175,110,30,30);
        g.fillOval(175,110,30,30);
        g.setColor(Color.ORANGE);
        g.drawOval(175,145,30,30);
        g.fillOval(175,145,30,30);
        g.setColor(Color.RED);
        g.drawOval(175,180,30,30);
        g.fillOval(175,180,30,30);

    }

}
