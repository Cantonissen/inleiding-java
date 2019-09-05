package ho4.src.com.company;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init(){

    }
    public void paint(Graphics g){

        setBackground(Color.white);

        g.setColor(Color.black);
        g.drawRect(50,50,500,500);
        g.fillRect(50,50,500,500);

        g.setColor(Color.WHITE);
        g.drawOval(80,70,200,200);
        g.drawOval(80,320,200,200);
        g.drawOval(320,70,200,200);
        g.drawOval(320,320,200,200);
        g.fillOval(320,320,200,200);
        g.fillOval(80,70,200,200);
        g.fillOval(80,320,200,200);
        g.fillOval(320,70,200,200);

    }


    }

