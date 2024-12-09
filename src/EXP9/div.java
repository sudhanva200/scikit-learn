package EXP9;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* <applet code="div" width=300 height=300></applet> */
public class div extends Applet implements ActionListener {
    Button b1, b2;
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;

    public void init() {

        b1 = new Button("Compute");
        b1.addActionListener(this);

        b2 = new Button("Clear");
        b2.addActionListener(this);

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);
        tf3.setEditable(false);

        l1 = new Label("1st Number");
        l2 = new Label("2nd Number");
        l3 = new Label("Result");

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(l3);
        add(tf3);

        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                int a = Integer.parseInt(tf1.getText().trim());
                int b = Integer.parseInt(tf2.getText().trim());
                if (b == 0) {
                    throw new ArithmeticException();
                }
                int c = a / b;
                tf3.setText("" + c);
            } catch (NumberFormatException e) {
                tf3.setText("");
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Please enter valid numbers!");
            } catch (ArithmeticException e) {
                tf3.setText("");
                JFrame f =new JFrame();
                JOptionPane.showMessageDialog(f, "Division by zero is not allowed!");
            }
        } else if (ae.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }
}
