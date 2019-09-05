package ho4.src.com.company;
import java.awt.*;
import java.applet.*;

public class DutchFlag extends Applet {

    public void init(){

    }

    public void paint(Graphics g)  {
        setBackground(Color.gray);
                g.setColor(Color.BLACK);
        g.drawRect(100,100,50,800);
        g.fillRect(100,100,50,800);
        g.setColor(Color.RED);
        g.drawRect(150,100,500,170);
        g.fillRect(150,100,500,170);
        g.setColor(Color.white);
        g.drawRect(150,250,500,170);
        g.fillRect(150,250,500,170);
        g.setColor(Color.blue);
        g.drawRect(150,400,500,170);
        g.fillRect(150,400,500,170);
    }
}
