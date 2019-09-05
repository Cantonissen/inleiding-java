import java.awt.*;
import java.applet.*;

public class House extends Applet {

    public void init() {
    }

    public void paint(Graphics g)  {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawArc(-10,37, 307, 170, 247,45);
        g.fillArc(-10,37, 307 ,170, 247,45);
        g.setColor(Color.yellow);
        g.drawRect(80,200,120,120);
        g.fillRect(80,200,120,120);
        g.setColor(Color.lightGray);
        g.drawRect(150,260,40,60);
        g.fillRect(150,260,40,60);
        g.setColor(Color.white);
        g.drawRect(100,260,30,30);
        g.fillRect(100,260,30,30);
}
}