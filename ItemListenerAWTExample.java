import java.awt.*;
import java.awt.event.*;

public class ItemListenerAWTExample extends Frame implements ItemListener {
    private Checkbox checkbox;
    private Label label;

    public ItemListenerAWTExample() {
        // Create components
        label = new Label("Check the box:");
        label.setBounds(50, 50, 200, 30);

        checkbox = new Checkbox("Accept Terms");
        checkbox.setBounds(50, 100, 150, 30);

        // Add ItemListener to Checkbox
        checkbox.addItemListener(this);

        // Set up Frame properties
        add(label);
        add(checkbox);
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
    public void itemStateChanged(ItemEvent e) {
        if (checkbox.getState()) {
            label.setText("Checkbox is Checked");
        } else {
            label.setText("Checkbox is Unchecked");
        }
    }

    public static void main(String[] args) {
        new ItemListenerAWTExample();
    }
}