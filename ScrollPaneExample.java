import javax.swing.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Pane Example");
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        textArea.setText("This is some text in the JTextArea. You can scroll here.");
        frame.add(scrollPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
