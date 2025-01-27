package Assignment2;
// package keyword - any class can be shared locally between all java files of assignment 2
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers n1 and n2");
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        System.out.println("Enter operation to perform(+,-,*,/,%)");
        String o = s.next();
        switch(o){
            case "+":
                System.out.println("Sum is: "+(n1+n2));
                break;
            case "-":
                System.out.println("Subtraction (n1-n2): "+(n1-n2));
                System.out.println("Subtraction (n2-n1): "+(n2-n1));
               break;
            case "*":
                System.out.println("Multiplocation is: "+(n1*n2));
                break;
            case "/'":
                System.out.println("Division (n1/n2): "+(n1/n2));
                System.out.println("Division (n2/n1): "+(n2/n1));
                break;
            default:
                System.out.println("Invalid operation");
        }
        s.close();
    }
}
