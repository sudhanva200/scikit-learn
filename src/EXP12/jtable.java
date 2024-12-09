package EXP12;

import javax.swing.*;

public class jtable {
    JFrame f;

    jtable() {
        f = new JFrame("JTable Example");

        String[][] data = {
                {"1", "Ravi", "50K"},
                {"2", "Raju", "70K"},
                {"3", "Ramu", "90K"}
        };
        String[] column = {"ID", "Name", "Salary"};

        JTable jt = new JTable(data, column);

        JScrollPane sp = new JScrollPane(jt);

        f.add(sp);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new jtable();
    }
}
