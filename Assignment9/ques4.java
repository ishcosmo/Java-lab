

/*4) Given an array of names with duplicates (e.g., ["Aman", "Varchasv", "Sourabh", "Varchasv", ”Aman”]), 
store them in a HashSet to eliminate duplicates.
 Check if a specific name exists in the set and print the unique names. */
package Assignment9;
import java.util.HashSet;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
        
        String n[] = {"Ishita", "Diwa", "Mini", "Diwa", "Ishita"};

        HashSet<String> nameUnique = new HashSet<>();
        for (String name : n) {
            nameUnique.add(name);
        }

        
        System.out.println("Unique names: " + nameUnique);

        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name to check if it exists: ");
        String nameToCheck = s.nextLine();

        if (nameUnique.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the set.");
        } else {
            System.out.println(nameToCheck + " does not exist in the set.");
        }

        s.close();
    }
}

