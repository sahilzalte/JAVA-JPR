import java.awt.*;
import java.awt.event.*;

public class AWTForm extends Frame implements ActionListener {
    Label nameLabel, emailLabel, passLabel, messageLabel;
    TextField nameField, emailField, passField;
    Button submitButton;

    AWTForm() {
        setTitle("AWT Form Example");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 80, 30);
        add(nameLabel);

        emailLabel = new Label("Email:");
        emailLabel.setBounds(50, 90, 80, 30);
        add(emailLabel);

        passLabel = new Label("Password:");
        passLabel.setBounds(50, 130, 80, 30);
        add(passLabel);

        nameField = new TextField();
        nameField.setBounds(140, 50, 200, 30);
        add(nameField);

        emailField = new TextField();
        emailField.setBounds(140, 90, 200, 30);
        add(emailField);

        passField = new TextField();
        passField.setEchoChar('*');
        passField.setBounds(140, 130, 200, 30);
        add(passField);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        submitButton.setBounds(140, 180, 80, 30);
        add(submitButton);

        messageLabel = new Label("");
        messageLabel.setBounds(140, 220, 200, 30);
        add(messageLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            messageLabel.setText("Submitted: " + name + " (" + email + ")");
        }
    }

    public static void main(String[] args) {
        new AWTForm();
    }
}

