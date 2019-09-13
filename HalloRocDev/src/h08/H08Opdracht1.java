package h08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H08Opdracht1 extends Applet {

    Button knopOK;
    Button knopReset;
    String schermtekst;
    TextField tekstvak;
    Label label;



    public void init() {
        setSize(400,400);
        tekstvak = new TextField("",10);
        knopOK = new Button("Ok");
        knopReset = new Button("Reset");
        knopOK.addActionListener( new knopOKListener() );
        knopReset.addActionListener(new knopResetListener() );
        add(tekstvak);
        add(knopOK);
        add(knopReset);
        schermtekst = "Blank";

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 45,45);
    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();
        }
    }
    class knopResetListener implements ActionListener {

       public void actionPerformed(ActionEvent e)  {
           tekstvak.setText(" ");
           repaint();

    }
    }


}
