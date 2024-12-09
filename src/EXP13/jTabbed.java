package EXP13;

import javax.swing.*;

public class jTabbed {
    JFrame f;
    jTabbed () {
        f = new JFrame();
        JTextArea ta = new JTextArea(20, 20);
        JTextArea tb = new JTextArea(20, 20);
        JTextArea tc = new JTextArea(20, 20);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(ta);
        p2.add(tb);
        p3.add(tc);

        JTabbedPane tp = new JTabbedPane();

        tp.setBounds(50, 50, 200, 200);
        tp.add("Main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);

        f.add(tp);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new jTabbed();
    }
}
