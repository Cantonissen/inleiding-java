package ho5;

import java.applet.Applet;
import java.awt.*;

public class H05Opdracht2 extends Applet {

    //Variabelen Declareren
    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;
    int hoogteXas;

    public void init() {

        // Variabelen Initialiseren

        setSize(400,400);
        hoogteXas = 350;
        gewichtValerie = 40;
        gewichtHans = 80;
        gewichtJeroen = 100;

    }

    public void paint(Graphics g) {

        //Verticale As
        g.drawLine(50,50,50,hoogteXas);
        //Horizontale As
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);

        // Tekenen van de staven
          //1. Valerie
        g.setColor(Color.MAGENTA);
        g.fillRect(50, hoogteXas - gewichtValerie, 80,gewichtValerie);
          //2. Hans
        g.setColor(Color.blue);
        g.fillRect(160,hoogteXas - gewichtHans,80, gewichtHans);
          //3. Jeroen
        g.setColor(Color.orange);
        g.fillRect(270,hoogteXas - gewichtJeroen,80, gewichtJeroen);

        // Gewichten
        g.setColor(Color.black);
        g.drawString("20KG",15,335);
        g.drawString("40KG",15,315);
        g.drawString("60KG",15,295);
        g.drawString("80KG",15,275);
        g.drawString("100KG",8,255);
        //Namen
        g.drawString("Valerie",70,365);
        g.drawString("Hans",185,365);
        g.drawString("Jeroen",290,365);


    }
}
