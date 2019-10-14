package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends Applet {
    public void init(){
        setSize(500,500);
    }
    
    public void paint(Graphics g){
        int x = 250;
        int width = 500;

        for (int i = 1; i <=100 ; i++) {

            g.drawOval(x ,x , width, width);
            x+=5;
            width -=10;


        }
    }
    
}
