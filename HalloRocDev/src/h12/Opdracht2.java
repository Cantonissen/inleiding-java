package h12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    //Globals
    Button knoppen[] = new Button[25];

    public void init(){
        for (int i = 0; i < knoppen.length ; i++) {
            knoppen[i] = new Button("Knop");
            add(knoppen[i]);
        }
    }
    public void paint(Graphics g){

    }
}
