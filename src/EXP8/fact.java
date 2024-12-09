package EXP8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="fact" width = 300 height = 300></applet>*/
public class fact extends Applet implements ActionListener {
    Button b1, b2;
    Label l1, l2;
    TextField tf1, tf2;

    public void init() {

        b1 = new Button("Compute");
        b1.addActionListener(this);

        b2 = new Button("Clear");
        b2.addActionListener(this);

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf2.setEditable(false); // Set result field as non-editable

        l1 = new Label("Number");
        l2 = new Label("Result");

        add(l1);
        add(tf1);

        add(l2);
        add(tf2);

        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                int a = Integer.parseInt(tf1.getText());
                int fact = 1;
                for (int i = 1; i <= a; i++) {
                    fact *= i;
                }
                tf2.setText(String.valueOf(fact));
            } catch (NumberFormatException ex) {
                tf2.setText("Invalid input");
            }
        } else if (e.getSource() == b2) {
            tf1.setText("");
            tf2.setText("");
        }
    }
}
