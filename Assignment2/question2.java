package Assignment2;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        int bill=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of units consumed: ");
        int x = s.nextInt();
        if(x>=1 && x<=100){
            bill=x*5;
        }
        else if(x>=101 && x<=200){
            bill=(x-100)*7+(100*5);
        }
        else if(x>=201 && x<=300){
            bill=(x-200)*10+(x-100)*7+(100*5);
        }
        else if(x>300){
            bill=(x-300)*15+(x-200)*10+(x-100)*7+(100*5);
        }
        System.out.println("The total electricity bill is Rs "+bill);
        s.close();
    }
}
