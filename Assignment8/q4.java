package Assignment8;
/*4)Write a program that prompts the user for a text file name, opens the file using a FileInputStream (or FileReader), 
and counts the total number of words and characters (excluding whitespace). Print these counts to the console. 
Test your program on files with varied content and edge cases (e.g., empty file, file with only whitespace, etc.). */
import java.io.*;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text file name:");
        String fileName = s.nextLine();
        
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            int charCount = 0;
            int wordCount = 0;
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String words[] = line.trim().split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                        charCount += word.length();
                    }
                }
            }
            
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
        s.close();
    }
    
}
