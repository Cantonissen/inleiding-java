package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class EindOpdracht extends Applet {
    int cijfer = 0;
    Button knopOK;
    TextField tekstveld;

    public void init() {

        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOK());
        tekstveld = new TextField(10);
        add(knopOK);
        add(tekstveld);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        for (int i = 1; i <= 10; i++) {
            int teller = i * cijfer;
            g.drawString( " x Uw ingevoerde cijfer =  " + teller, x, y);
            y += 10;

        }
    }

    class knopOK implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstveld.getText();
            cijfer = Integer.parseInt(invoer);
            switch (cijfer) {
                case 1:
                    cijfer = 1;
                    break;
                case 2:
                    cijfer = 2;
                    break;
                case 3:
                    cijfer = 3;
                    break;
                case 4:
                    cijfer = 4;
                    break;
                case 5:
                    cijfer = 5;
                    break;
                case 6:
                    cijfer = 6;
                    break;
                case 7:
                    cijfer = 7;
                    break;
                case 8:
                    cijfer = 8;
                    break;
                case 9:
                    cijfer = 9;
                    break;
                case 10:
                    cijfer = 10;
                    break;
                default:
                    cijfer = 0;
                    break;
            }
            repaint();
        }
    }
}
