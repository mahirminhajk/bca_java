// Create and awt application to add, remove in a list box.

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame {
    private List itemList = new List();

    public ListDemo() {
        setLayout(new FlowLayout());
        Button addButton = new Button("Add");
        Button removeButton = new Button("Remove");

        addButton.addActionListener(e -> itemList.add(JOptionPane.showInputDialog("Enter item:")));
        removeButton.addActionListener(e -> itemList.remove(itemList.getSelectedIndex()));

        add(itemList);
        add(addButton);
        add(removeButton);

        setTitle("List Demo");
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new ListDemo();
    }
}