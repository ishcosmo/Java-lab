package Assignment8;
import java.util.Scanner;
import java.io.*;

/*2) Write a Java program that takes user input for a student's name, roll number,
 and grade, and writes this information to a file named student.txt using FileWriter.
  Ensure the program appends the data to the file if it already exists. Handle any exceptions using try-catch 
  and display an appropriate message if an error occurs.
Sample File Content: 
Name: Aman, Roll Number: 120112, Grade: A
Name: Parul, Roll Number: 120131, Grade: B */
public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        
        
        String sd = "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n";
        //sd mtlb student ka data
       
        try (FileWriter writer = new FileWriter("student.txt", true)) { // 'true' enables appending mode
            writer.write(sd);
            System.out.println("Student information saveed!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
        scanner.close();
    }
}
