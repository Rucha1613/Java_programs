import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        String[] columnNames = {"Name", "Age", "City"};
        Object[][] data = {
            {"John", 25, "New York"},
            {"Anna", 30, "London"},
            {"Mike", 35, "San Francisco"}
        };

        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
