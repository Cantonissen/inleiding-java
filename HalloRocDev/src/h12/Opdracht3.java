package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    Button knop;
    TextField tekstveld[] = new TextField[5];
    int nummers[] = new int[5];
    int y;
    boolean ready;

    public void init() {
        ready = false;
        y = 50;
        for (int teller = 0; teller < 5; teller++) {
            tekstveld[teller] = new TextField(1);
            add(tekstveld[teller]);
        }
        knop = new Button("Ok");
        knop.addActionListener(new knopListener() );
        add(knop);
    }

    public void paint(Graphics g) {
        if (ready == true) {
            if (y != 50){
                y = 50;
            }
            for (int teller = 0; teller < 5; teller++) {
                g.drawString("nummers " + nummers + teller, 50, y);
                y += 15;
            }
        }
    }

    class knopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < 5 ; teller++) {
                String invoer = tekstveld[teller].getText();
                nummers[teller] = Integer.parseInt(invoer);
                tekstveld[teller].setText("" + nummers[teller]);
            }
            Arrays.sort(nummers);
            ready = true;
            repaint();
        }
    }
}
