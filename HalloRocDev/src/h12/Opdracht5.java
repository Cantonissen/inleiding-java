package h12;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Opdracht5 extends Applet {
    //Globale declaraties
    private int y, aantal;
    private int invoer[] ={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7,8,8,8,8,8,8,8,8,9,9,9,9,9,9,9,9,9};
    Button knop;
    TextField tekstveld;
    boolean ready, found;

    public void init(){
        found = false;
        ready = false;
        knop = new Button("OK");
        knop.addActionListener(new knopListener());
        add(knop);
        tekstveld = new TextField(5);
        add(tekstveld);
    }

    public void paint(Graphics g){
        y = 20;
        for (int teller = 0; teller <invoer.length; teller++) {
            g.drawString(" " + invoer[teller], 50, y);
            y+=15;
        }
        if(ready == true){
            if(found == true) {
                g.drawString("Het is gevonden", 65, 50);
                g.drawString("Het kwam " + aantal +  " keer voor", 65, 65);
            }   else {
                g.drawString("Het is niet gevonden",65,50);
            }
        }
    }

    class knopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            aantal = 0;
            found = false;
            String textstuff = tekstveld.getText();
            int search = Integer.parseInt(textstuff);
            for (int teller = 0; teller < invoer.length ; teller++) {
                if(invoer[teller] == search){
                    found = true;
                    aantal++;
                }
                tekstveld.setText("");
            }
            ready = true;
            repaint();
        }
    }
}
