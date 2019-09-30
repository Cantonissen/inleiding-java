package h10;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Eindopdracht extends Applet {
    //globaal
    Button knop;
    TextField tv;
    String blyat;
    int wortel;


    public void init() {
        tv = new TextField(10);
        add(tv);
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new knopHandler());
        blyat = new String("Cijfer");

    }

    class knopHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String UserinputString=tv.getText();
            wortel = Integer.parseInt(UserinputString);
            switch (wortel) {
                case 1:
                    blyat = "Slecht";
                    break;
                case 2:
                    blyat = "Slecht";
                    break;
                case 3:
                    blyat = "Slecht";
                    break;
                case 4:
                    blyat = "Onvoldoende";
                    break;
                case 5:
                    blyat = "Matig";
                    break;
                case 6:
                    blyat = "Voldoende";
                    break;
                case 7:
                    blyat = "Voldoende";
                    break;
                case 8:
                    blyat = "Goed";
                    break;
                case 9:
                    blyat = "Goed";
                    break;
                case 10:
                    blyat = "Goed";
                    break;
                default:
                    blyat = "U heeft een verkeerd nummer ingetikt";
                    break;
            }
            repaint();

        }
    }
    public void paint(Graphics g) {

        g.drawString(blyat,50,100);
    }

}
