package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht5 extends Applet {
    int optelsom;
    double berekening;
    TextField tv;
    Button knop;
    String tekst;


    public void init() {

        tv = new TextField(" ");
        add(tv);
        tv.addActionListener(new tekstveldListener());
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new knopListener());
        tekst = " ";
        berekening = 0;
        optelsom = 0;

        tekst = " ";


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst, 50,150);


    }

    class tekstveldListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String UserInput = tv.getText();
            berekening = Double.parseDouble(UserInput);
            if (berekening >= 5.5) {
                tekst = "Dit cijfer is voldoende";
            }
            else
            tekst = "Dit cijfer is onvoldoende" ;
            optelsom += berekening;
            ++ berekening;
            repaint();
        }

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double UserinputString = optelsom / berekening;
            if (optelsom >= 5.5) {
                tekst = "U bent geslaagd";
            }
            else {
                tekst = "U bent gezakt";
            }
            repaint();
            }





        }
    }
