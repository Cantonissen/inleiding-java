package ho4.src.com.company;

import java.awt.*;
import java.applet.*;


public class Ellips extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        setBackground (Color.blue);

        g.setColor(Color.yellow);
        g.drawArc(80,80,50,100,0,360);
        g.fillArc(80,80,50,100,0,360);


    }
}
