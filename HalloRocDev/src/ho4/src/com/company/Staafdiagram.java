package ho4.src.com.company;

import java.awt.*;
import java.applet.*;


public class Staafdiagram extends Applet {
    public void init(){

    }
    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.black);

        g.drawRect(130,50,20,520);
        g.fillRect(130,50,20,520);
        g.drawRect(140,50,50,20);
        g.fillRect(140,50,50,20);
        g.drawRect(140,150,50,20);
        g.fillRect(140,150,50,20);
        g.drawRect(140,250,50,20);
        g.fillRect(140,250,50,20);
        g.drawRect(140,350,50,20);
        g.fillRect(140,350,50,20);
        g.drawRect(140,450,50,20);
        g.fillRect(140,450,50,20);
        g.drawRect(140,550,50,20);
        g.fillRect(140,550,50,20);

        g.setColor(Color.blue);

        g.drawRect(240,350,80,220);
        g.fillRect(240,350,80,220);

        g.setColor(Color.GREEN);

        g.drawRect(400,150,80,430);
        g.fillRect(400,150,80,430);

        g.setColor(Color.RED);

        g.drawRect(600,60,80,520);
        g.fillRect(600,60,80,520);


        g.setColor(Color.BLACK);
        g.drawString("Valerie",260,600);
        g.drawString("Hans", 425,600);
        g.drawString("Jeroen",620,600);
        g.drawString("0 KG",90,570);
        g.drawString("20KG",90,470);
        g.drawString("40KG",90,370);
        g.drawString("60KG",90,270);
        g.drawString("80KG",90,170);
        g.drawString("100KG",90,70);

    }





    }


