

/*
1) Store a list of integers in an ArrayList<Integer> using autoboxing. Iterate through the list, unbox each value,
 and determine if it is a prime number, printing the results.
 */
package Assignment9;
import java.util.ArrayList;
public class ques1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> n = new ArrayList<>();
        for (int i =1; i <=10; i++) {
            n.add(i); // autoboxing hui
        }
        for (Integer num : n) {
            int value = num; // unboxin hui
            if (isPrime(value)) {
                System.out.println(value + " is a prime number");
            } else {
                System.out.println(value + " isNOT a prime number");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
