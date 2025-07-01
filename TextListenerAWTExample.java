import java.awt.*;
import java.awt.event.*;

public class TextListenerAWTExample extends Frame implements TextListener {
    private TextField textField;
    private Label outputLabel;

    public TextListenerAWTExample() {
        // Create components
        Label label = new Label("Type something:");
        label.setBounds(50, 50, 200, 30);

        textField = new TextField();
        textField.setBounds(50, 100, 200, 30);

        outputLabel = new Label("Text will appear here");
        outputLabel.setBounds(50, 150, 300, 30);

        // Add TextListener to TextField
        textField.addTextListener(this);

        // Set up Frame properties
        add(label);
        add(textField);
        add(outputLabel);
        setSize(400, 250);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void textValueChanged(TextEvent e) {
        outputLabel.setText("You typed: " + textField.getText());
    }

    public static void main(String[] args) {
        new TextListenerAWTExample();
    }
}
