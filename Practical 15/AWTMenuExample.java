import java.awt.*;
import java.awt.event.*;

public class AWTMenuExample extends Frame implements ActionListener {
    MenuItem newItem, openItem, exitItem, cutItem, copyItem, pasteItem, aboutItem;
    Label messageLabel;

    AWTMenuExample() {
        setTitle("AWT Menu Example");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setVisible(true);

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");
        cutItem = new MenuItem("Cut");
        copyItem = new MenuItem("Copy");
        pasteItem = new MenuItem("Paste");
        aboutItem = new MenuItem("About");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        aboutItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setMenuBar(menuBar);

        messageLabel = new Label("Select a menu item...");
        add(messageLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Exit")) {
            dispose();
        } else {
            messageLabel.setText("Selected: " + command);
        }
    }
    public static void main(String[] args) {
        new AWTMenuExample();
    }
}

