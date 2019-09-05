import java.awt.*;
import java.applet.*;

public class Shows extends Applet {

    public void init ()   {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString ("Collin", 50, 60 );
        g.setColor(Color.red);
        g.drawString ("Antonissen", 90, 60);
    }
}
//opdracht3