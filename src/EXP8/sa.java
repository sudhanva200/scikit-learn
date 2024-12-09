package EXP8;


import java.applet.Applet;
import java.awt.*;

/*<applet code="sa" width = 300 height = 300></applet>*/
public class sa extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        setBackground(Color.YELLOW);
        g.drawString("Hi There!", 300, 300);
    }
}
