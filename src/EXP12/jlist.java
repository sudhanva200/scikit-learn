package EXP12;

import javax.swing.*;

public class jlist {
    jlist() {
        JFrame f = new JFrame();
        DefaultListModel <String> li =  new DefaultListModel<>();
        li.addElement("Item1");
        li.addElement("Item2");
        li.addElement("Item3");
        li.addElement("Item4");

        JList <String> list = new JList<>(li);
        list.setBounds(100,100,75,75);
        f.add(list);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new jlist();
    }
}
