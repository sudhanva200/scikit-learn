package EXP12;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class jtree {
    JFrame f;

    jtree() {
        f = new JFrame("JTree Example");

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        color.add(red);
        color.add(green);
        color.add(blue);

        JTree tree = new JTree(style);
        JScrollPane sp = new JScrollPane(tree);

        f.add(sp);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new jtree();
    }
}
