package EXP11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="calci" width=300 height=300></applet> */
public class calci extends Applet implements ActionListener {
    TextField tf;
    double arg = 0;
    String op = "=";
    boolean start = true;

    public void init() {
        setLayout(new BorderLayout());

        tf = new TextField("0");
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));

        String buttons = "123/456*789-0.+=";

        for (int i = 0; i < buttons.length(); i++) {
            Button b = new Button(buttons.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }
        add(p, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();

        if (('0' <= s.charAt(0) && s.charAt(0) <= '9') || s.equals(".")) {
            if (start) {
                tf.setText(s);
                start = false;
            } else {
                tf.setText(tf.getText() + s);
            }
        } else {
            try {
                calci(Double.parseDouble(tf.getText()));
                op = s;
                start = true;
            } catch (NumberFormatException e) {
                tf.setText("Error");
            }
        }
    }

    public void calci(double n) {
        switch (op) {
            case "+":
                arg += n;
                break;
            case "-":
                arg -= n;
                break;
            case "*":
                arg *= n;
                break;
            case "/":
                if (n != 0) {
                    arg /= n;
                } else {
                    tf.setText("Can't divide by 0");
                    start = true;
                    return;
                }
                break;
            case "=":
                arg = n;
                break;
        }
        tf.setText("" + arg);
    }
}
