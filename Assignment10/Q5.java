

package Assignment10;

/*Write a Java Swing program to implement a simple Stopwatch. 
The GUI should include a JLabel to display the elapsed time (in seconds) and three JButtons labeled "Start", "Stop", and "Reset". 
Use a Swing Timer to update the JLabel every second while the stopwatch is running. 
The "Start" button should begin timing, the "Stop" button should pause the timer, and the "Reset" button should set the elapsed time back to zero.
 Ensure that the GUI updates correctly based on the user’s interactions. */
 import javax.swing.*;
 import java.awt.*;
 
 
 public class Q5 {
 
     private int elapsedTime = 0;     // time in seconds
     private boolean isRunning = false;
     private Timer timer;
 
     public Q5() {
         
         JFrame frame = new JFrame("Stopwatch");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300, 150);
         frame.setLayout(new BorderLayout());
 
        
        JLabel timeLabel = new JLabel("0", SwingConstants.CENTER);
         timeLabel.setFont(new Font("SansSerif", Font.BOLD, 40));
         frame.add(timeLabel, BorderLayout.CENTER);
 
        
         JButton startButton = new JButton("Start");
           JButton stopButton = new JButton("Stop");
         JButton resetButton = new JButton("Reset");
 
     
         JPanel buttonPanel = new JPanel();
         buttonPanel.add(startButton);
         buttonPanel.add(stopButton);
         buttonPanel.add(resetButton);
         frame.add(buttonPanel, BorderLayout.SOUTH);
 
         
         timer = new Timer(1000, e -> {
             elapsedTime++;
             timeLabel.setText(String.valueOf(elapsedTime));
         });
 
       
         startButton.addActionListener(e -> {
             if (!isRunning) {
                 timer.start();
                 isRunning = true;
             }
         });
 
         stopButton.addActionListener(e -> {
             if (isRunning) {
                 timer.stop();
                 isRunning = false;
             }
         });
 
         resetButton.addActionListener(e -> {
             timer.stop();
             isRunning = false;
             elapsedTime = 0;
             timeLabel.setText("0");
         });
 
         
         frame.setVisible(true);
     }
 
     public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> new Q5());
     }
 }
 
