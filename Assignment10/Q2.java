
package Assignment10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*2) Design a simple calculator using Java Swing with buttons for digits (0-9),
 addition (+), subtraction (-), multiplication (*), and division (/).
  Implement event handling for button clicks and display the result in a JTextField. */
public class Q2 {
    
public static class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        // Frame settings
        setTitle("Ishita's Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Buttons
        String[] buttons = {
            "1", "2", "3", "/",
            "4", "5", "6", "*",
            "7", "8", "9", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            textField.setText(textField.getText() + command);
        } else if (command.equals("C")) {
            textField.setText("");
            operator = null;
            num1 = num2 = result = 0;
        } else if (command.equals("=")) {
            if (operator != null) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "*" -> result = num1 * num2;
                    case "/" -> result = num2 != 0 ? num1 / num2 : 0;
                }
                textField.setText(String.valueOf(result));
                operator = null;
            }
        } else {
            if (!textField.getText().isEmpty()) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
        }
    }

    public static void main(String[] args) {
        new Q2.Calculator();
    }
}
