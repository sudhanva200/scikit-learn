package EXP7;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="ME" width=300 height=300></applet> */
public class ME extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Clicked";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Exited";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Released";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Dragged";
        showStatus("Dragging mouse at: " + mouseX + ", " + mouseY);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        showStatus("Moving mouse at: " + mouseX + ", " + mouseY);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
