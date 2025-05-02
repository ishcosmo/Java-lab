

package Assignment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 *4) Write a Java Swing program to create a Registration Form that collects user details such as
  Name, Email, Password, and Confirm Password. Use a combination of JTextField for the name and email inputs, 
  JPasswordField for the password inputs, and a JButton labeled "Register". When the Register button is clicked,
   validate that none of the fields are empty, that the Password and Confirm Password fields match, 
   and that the email appears valid (for example, containing an “@” symbol).
    Display a success message on the form if all validations pass; otherwise, show appropriate error messages next to the respective fields.
 */
public class Q4 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        JButton registerButton = new JButton("Register");
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(new JLabel()); // Empty cell hai
        frame.add(registerButton);
        frame.add(new JLabel()); // Empty cell hai
        frame.add(messageLabel);

        
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validation k liye
                if (name.isEmpty()) {
                    messageLabel.setText("Name cannot be empty.");
                    messageLabel.setForeground(Color.RED);
                } else if (email.isEmpty() || !email.contains("@")) {
                    messageLabel.setText("Invalid email.");
                    messageLabel.setForeground(Color.RED);
                } else if (password.isEmpty()) {
                    messageLabel.setText("Password cannot be empty.");
                    messageLabel.setForeground(Color.RED);
                } else if (!password.equals(confirmPassword)) {
                    messageLabel.setText("Passwords do not match.");
                    messageLabel.setForeground(Color.RED);
                } else {
                    messageLabel.setText("Registration Successful!");
                    messageLabel.setForeground(Color.GREEN);
                }
            }
        });

        
        frame.setVisible(true);
    }
}
