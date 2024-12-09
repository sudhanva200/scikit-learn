package EXP7;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="KE" width=300 height=300></applet> */
public class KE extends Applet implements KeyListener {
    Label l;
    TextArea area;

    @Override
    public void init() {
        l = new Label();
        l.setBounds(20, 50, 200, 200);

        area = new TextArea();
        area.addKeyListener(this);

        setLayout(new BorderLayout());
        add(l);
        add(area);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        l.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        l.setText("Key Released");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KE();
    }
}
