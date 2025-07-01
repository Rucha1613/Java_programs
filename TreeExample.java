import javax.swing.*;
import javax.swing.tree.*;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Example");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        
        JTree tree = new JTree(root);
        frame.add(new JScrollPane(tree));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
