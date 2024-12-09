package EXP10;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code="traffic" width = 500 height = 500></applet>*/
public class traffic  extends Applet implements ItemListener {
    int colorNum;
    CheckboxGroup cbg;
    Checkbox red, yellow, green;
    String msg = "";

    public void init() {
        cbg = new CheckboxGroup();

        red = new Checkbox("RED", cbg, true);
        yellow = new Checkbox("YELLOW", cbg, true);
        green = new Checkbox("GREEN", cbg, true);

        add(red);
        add(yellow);
        add(green);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == red) {
            colorNum = 1;
        } else if (ie.getSource() == yellow) {
            colorNum = 2;
        } else {
            colorNum = 3;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval(150, 70, 50, 50);
        g.fillOval(150, 150, 50, 50);
        g.fillOval(150, 230, 50, 50);

        switch (colorNum) {
            case 1: g.setColor(Color.RED);
            g.fillOval(150, 70, 50, 50);
            msg = "STOP";
            g.drawString(msg, 210, 100);
            break;

            case 2: g.setColor(Color.YELLOW);
            g.fillOval(150, 150, 50, 50);
            msg = "WAIT";
            g.drawString(msg, 210, 180);
            break;

            case 3: g.setColor(Color.GREEN);
            g.fillOval(150, 230, 50, 50);
            msg = "GO";
            g.drawString(msg, 210, 260);
            break;
        }
    }
}
