/*5) Given an ArrayList of integers (possibly with duplicates), find the sum of its unique values. [Hint: Convert it to HashSet]
Example:
Input: [3, 5, 3, 8, 2, 5]
Unique values: [3, 5, 8, 2]
Sum: 18
 */
package Assignment9;
import java.util.ArrayList;
import java.util.HashSet;
public class ques5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(1);
        n.add(8);
        n.add(5);
        n.add(2);

        
        HashSet<Integer> uniqueNumbers = new HashSet<>(n);

        int sum=0;
        for (int num :uniqueNumbers) {
            sum += num;
        }
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum: " + sum);
    }
}
