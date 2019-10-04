package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    long [] fibo;

    public void init() {
        fibo = new long [ 1000 ];
        fibo[ 0 ] = 0;
        fibo[ 1 ] = 1;

        int i;
        for (i = 2; i < 1000; i++)
        {
            fibo[ i ] = fibo[ i - 2  ] + fibo[ i - 1  ];
        }
    }

    public void paint(Graphics g) {
        int yPos = 20;
        int i;

        for( i = 0; i < 25; i++)
        {
            g.drawString(""+fibo [i], 50, yPos );
            yPos +=20;
        }
    }
}