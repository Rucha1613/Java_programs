import javax.swing.*;

public class ToolTipExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ToolTip Example");
        JButton button = new JButton("Click Me");
        button.setToolTipText("This is a button that you can click.");
        
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
