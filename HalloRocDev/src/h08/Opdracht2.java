package h08;

import javax.swing.text.LabelView;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;

public class Opdracht2 extends Applet {

    //Knoppen
    Button man;
    Button vrouw;
    Button jongen;
    Button meisje;
    //Tekststen
    Label label1;
    Label label2;
    Label label3;
    Label label4;
    String schermtekst;
    //Integer
    int i1;
    int i2;
    int i3;
    int i4;




    public void init() {
        //Applet Resolutie
        setSize(550,200);
        //Tekst en String
        schermtekst = new String("Telling");
        label1 = new Label("Mannen");
        label2 = new Label("Vrouwen");
        label3 = new Label("Jongens");
        label4 = new Label("Meisjes");
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        schermtekst = "Telling";
        //Knoppen
        man = new Button("Man");
        jongen = new Button("Jongen");
        meisje = new Button("Meisje");
        vrouw = new Button("Vrouw");
        add(man);
        add(vrouw);
        add(jongen);
        add(meisje);
        man.addActionListener(new man() );
        vrouw.addActionListener(new vrouw() );
        jongen.addActionListener(new jongen() );
        meisje.addActionListener(new meisje() );

    }

    public void start() {
        i1=1;
        i2=1;
        i3=1;
        i4=1;
    }

    public void paint(Graphics g) {
        g.drawString("Mannen",45,40);
        g.drawString("Vrouwen",107,40);
        g.drawString("Jongens",175,40);
        g.drawString("Meisjes",241,40);
    }
    //Knop classes
    class man implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==man);
            schermtekst=String.valueOf(i1);
            label1.setText(schermtekst);
            i1=i1+1;

        }
    }
    class vrouw implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==vrouw);
            schermtekst=String.valueOf(i2);
            label2.setText(schermtekst);
            i2=i2+1;
        }
    }
    class jongen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==jongen);
            schermtekst=String.valueOf(i3);
            label3.setText(schermtekst);
            i3=i3+1;
        }
    }
    class meisje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==meisje);
            schermtekst=String.valueOf(i4);
            label4.setText(schermtekst);
            i4=i4+1;
        }
    }
    }






