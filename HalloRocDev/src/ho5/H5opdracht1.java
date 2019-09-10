package ho5;

import java.awt.*;
import java.applet.*;




public class H5opdracht1 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init(){
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //Rechthoek
        g.drawRect(100,100,breedte,hoogte);
        //Afgeronde Rechthoek
        g.drawRoundRect(100,225,breedte,hoogte,30,30);
        //Gevulde Rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315,100,breedte,hoogte);
        //Ovaal
        g.setColor(lijnkleur);
        g.drawOval(315,100,breedte,hoogte);
        //Gevulde Ovaal
        g.setColor(opvulkleur);
        g.fillOval(315,225,breedte,hoogte);
        //Lijn
        g.setColor(lijnkleur);
        g.drawLine(100,10,297,10);
        // Ovaal met Taartpunt
        g.drawOval(530,100,breedte,hoogte);
        g.setColor(opvulkleur);
        g.drawArc(530,100,breedte,hoogte,0,45);
        g.fillArc(530,100,breedte,hoogte,0,45);
        // Circel
        g.setColor(lijnkleur);
        g.drawOval(580,225,100,100);
        // Teksten
        g.drawString("Lijn",190,25);
        g.drawString("Rechthoek",170,215);
        g.drawString("Afgeronde Rechthoek",140,340);
        g.drawString("Gevulde Rechthoek",360,215);
        g.drawString("Ovaal met Taartpunt",575,215);
        g.drawString("Gevulde Ovaal",375,340);
        g.drawString("Circel",615,340);





    }

}
