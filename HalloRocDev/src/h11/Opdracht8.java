package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht8 extends Applet {
    Color zwart;
    Color wit;

    public void init() {
        setSize(500, 500);

    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 50, hoogte = 50, rij = 0, kolom = 0;
        zwart = Color.black;
        wit = Color.white;

        for (rij = 0; rij < 4; rij++) {
            x = 50;
            y += 50;


            for (kolom = 0; kolom <8 ; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;

        }
            //tweede rij
            x = 50;
            y += hoogte;

            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
        }
    }
}
