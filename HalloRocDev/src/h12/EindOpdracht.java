package h12;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;


public class EindOpdracht extends Applet {

    int y, aantal;
    Button knop;
    TextField naamveld[] = new TextField[10];
    TextField telefoonveld[] = new TextField[10];
    boolean ready;
    String telefoon[] = new String[10];
    String namen[] = new String[10];

    public void init() {
        setSize(1280,720);
        aantal = 0;
        y = 50;
        ready = false;
        for (int teller = 0; teller < 10; teller++) {
            naamveld[teller] = new TextField("Naam", 20);
            add(naamveld[teller]);
            telefoonveld[teller] = new TextField("Telefoon", 20);
            add(telefoonveld[teller]);
        }
        knop = new Button("OK");
        knop.addActionListener(new knopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        y = 50;
        if (ready == true) {
            if (aantal == 10) {
                for (int teller = 0; teller < 10; teller++) {
                    g.drawString(naamveld[teller] + ": ", 20, y);
                    y += 15;
                    g.drawString(telefoonveld[teller] + ": ", 20, y);
                    y += 15;
                    aantal = 0;
                    ready = false;
                }
            } else {
                g.drawString(namen[aantal], 20, 50);
                g.drawString(telefoon[aantal], 20, 65);

            }
        }
    }
    class knopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (ready == false) {
                for (int teller = 0; teller < 10; teller++) {
                    namen[teller] = naamveld[teller].getText();
                    naamveld[teller].setText("");
                    telefoon[teller] = telefoonveld[teller].getText();
                    telefoonveld[teller].setText("");
                }
            } else{
                aantal++;
            }
            ready = true;
            repaint();
        }
    }
}