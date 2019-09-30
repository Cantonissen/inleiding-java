package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht3Plus4 extends Applet {
    //Globals
    boolean firstInput;
    int userInput, jaartal;
    Label label;
    TextField tveld;
    TextField jaarveld;
    String tekst, tekst2;

    public void init() {
        tveld = new TextField("Maand",10);
        jaarveld = new TextField("Schrikkeljaar",10);
        tveld.addActionListener(new tveldListener());
        jaarveld.addActionListener(new jaarveldListener());
        label = new Label("Links voor de maand en rechts om te kijken of het een schrikkeljaar is");
        tekst = " ";
        tekst2 = " ";
        add(tveld);
        add(label);
        add(jaarveld);

    }

    public void paint (Graphics g) {

        g.drawString(tekst,50,100);
        g.drawString(tekst2,50,130);
    }
    class tveldListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInputString = tveld.getText();
            userInput = Integer.parseInt(userInputString);
            switch (userInput) {
                case 1:
                    tekst = "Januari";
                    break;
                case 2:
                    tekst = "Februari";
                    break;
                case 3:
                    tekst = "Maart";
                    break;
                case 4:
                    tekst = "April";
                    break;
                case 5:
                    tekst = "Mei";
                    break;
                case 6:
                    tekst = "Juni";
                    break;
                case 7:
                    tekst = "Juli";
                    break;
                case 8:
                    tekst = "Augustus";
                    break;
                case 9:
                    tekst = "September";
                    break;
                case 10:
                    tekst = "Oktober";
                    break;
                case 11:
                    tekst = "November";
                    break;
                case 12:
                    tekst = "December";
                    break;
                default:
                    tekst = "U heeft een verkeerd nummer ingetikt";
                    break;
            }
            repaint();
        }

    }
    class jaarveldListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tekst2 = jaarveld.getText();
            jaartal = Integer.parseInt(tekst2);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekst2 = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekst2 = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
}


}


