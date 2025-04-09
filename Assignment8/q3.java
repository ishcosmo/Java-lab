package Assignment8;
/*3) Write a Java program that reads the contents of a file named student.txt using FileReader 
and displays the data on the console. Handle FileNotFoundException if the file does not exist and display an appropriate error message. 
Use a try-catch block for exception handling. */
import java.io.*;
public class q3 {
    public static void main(String[] args) {
        String fileName = "student.txt";
        
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
