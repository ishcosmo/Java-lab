package Assignment8;
import java.util.Scanner;
import java.io.*;
/*1)Write a Java program that reads a file name from the user and attempts to open and read the file.
 Define a method readFile() that throws a FileNotFoundException using the throws keyword. 
 In the main method, call this method and handle the exception using a try-catch block. 
 Display an appropriate message if the file is not found. Use a finally block to ensure a message like "File operation attempted" is printed. */

public class q1 {
    public static void readfile(String f) throws FileNotFoundException{
        File file = new File(f);
        Scanner fScanner = new Scanner(file);
        while(fScanner.hasNextLine()){
            System.out.println(fScanner.nextLine());
        }
        fScanner.close();}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Filename");
        String f = s.nextLine();

        try{
            readfile(f);
        }
        catch(FileNotFoundException e){
            System.out.println("THe file is NOT found! Error");
        }
        finally{
            System.out.println("File operation attempted");
        }
        s.close();
    }
}
