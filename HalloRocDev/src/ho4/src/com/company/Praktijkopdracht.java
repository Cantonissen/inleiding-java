package ho4.src.com.company;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init(){

    }
    public void paint(Graphics g){

        setBackground(Color.white);
//Lijn
        g.setColor(Color.black);
        g.drawLine(10,10,160,10);
//Rechtoek
        g.drawRect(10,40,150,100);
//Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(180,40,150,100);

        g.setColor(Color.black);
        g.drawOval(180,40,150,100);
        g.drawOval(360,40,150,100);
//Taartpunt met ovaal
        g.setColor(Color.magenta);
        g.drawArc(360,40,150,100,0,45);
        g.fillArc(360,40,150,100,0,45);
//Afgeronde rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(10,180,150,100,30,30);
//Gevulde ovaal
        g.setColor(Color.magenta);
        g.drawOval(180,180,150,100);
        g.fillOval(180,180,150,100);
//Cirkel
        g.setColor(Color.black);
        g.drawOval(385,180,100,100);

//Teksten
        g.drawString("Lijn",75,25);
        g.drawString("Rechtoek",60,160);
        g.drawString("Gevulde rechtoek met ovaal",180,160);
        g.drawString("Taartpunt met ovaal",380,160);
        g.drawString("Afgeronde rechthoek",30,300);
        g.drawString("Gevulde ovaal",210,300);
        g.drawString("Circel",418,300);






    }
}
