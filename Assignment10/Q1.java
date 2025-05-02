
package Assignment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q1 {
    public static void main(String[] args) {
        // YAha jframe banaya
        JFrame f = new JFrame("Login Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000, 1000);
        f.setLayout(new GridLayout(3, 2));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("");

        // now i add components to the frame
        f.add(userLabel);
        f.add(userField);
        f.add(passLabel);
        f.add(passField);
        f.add(loginButton);
        f.add(messageLabel);

        // ab add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if ("admin".equals(username) && "password".equals(password)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid credentials.");
                }
            }
        });

        // Make the frame visible
        f.setVisible(true);
    }
}
