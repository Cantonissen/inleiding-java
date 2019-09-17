package h08;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import java.awt.Button;

public class Opdracht3 extends Applet {
    //Knop
    Button knopOK;
    //Tekstveld
    TextField tekstveld, resultaatgetal;
    //Int
    double btw, berekening, resultaat;
    String s;
    //Label
    Label label;


    public void init() {
        //Applet resolutie
        setSize(400, 50);
        //Initialisatie
        knopOK = new Button("Ok");
        tekstveld = new TextField(" ");
        tekstveld.addActionListener(new knopOK());
        resultaatgetal = new TextField("");
        label = new Label("");
        knopOK.addActionListener(new knopOK());
        add(knopOK);
        add(tekstveld);
        add(label);
        add(resultaatgetal);
        s = "Bereken btw";
    }

    public void paint(Graphics g) {
        g.drawString(s, 10, 22);
    }

    class knopOK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tekstveld.getText();
            berekening = Double.parseDouble(invoer1);
            btw *= 0.21;
            berekening = berekening * 0.21;
            resultaat = berekening + btw;
            resultaatgetal.setText("" + resultaat);


        }

    }
}