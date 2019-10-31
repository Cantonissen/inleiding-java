package h12;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht4 extends Applet {

    int invoer[] = {1,2,3,4,5,6,7,8,9};
    TextField tekstveld;
    Button knop;
    boolean ready, found;
    int y, index;

    public void init(){
        found = false;
        ready = false;
        tekstveld = new TextField(5);
        add(tekstveld);
        knop = new Button("OK");
        knop.addActionListener(new knopListener());
        add(knop);
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
                g.drawString("Het was op index " + index, 65, 65);
            }   else {
                g.drawString("Het is niet gevonden",65,50);
            }
        }
    }
    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (found == true){
                found = false;
            }
            String string = tekstveld.getText();
            int search = Integer.parseInt(string);
            for (int teller = 0; teller <invoer.length ; teller++) {
                if(invoer[teller] == search){
                    found = true;
                    index = teller;
                }
                tekstveld.setText(" ");
            }
            ready = true;
            repaint();
        }
    }
}
