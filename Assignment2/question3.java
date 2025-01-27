package Assignment2;

import java.util.Scanner;

class Area {
    public float area(float l, float b) {
        return l *b;
    }

    public float area(float s) {
        return s * s;
    }

    public double area(double r) {
        return (3.14)* r* r;
    }

    public double area(double b, double h) {
        return (0.5)*b*h;
    }
}

public class question3 {
    public static void main(String[] args) {
        System.out.println("To find area of \n-Rectangel: Enter 1\n-Square: Enter 2\n-Circle:Enter 3\n-Triangle:Enter 4");
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        
        Area shape = new Area();
        if(c==1){
            System.out.println("Enter length:");
            float l = s.nextFloat();
            System.out.println("Enter breadthh: ");
            float b = s.nextFloat();
            double aa= shape.area(l,b);
            System.out.println(aa);
        }
        else if(c==2){
            System.out.println("Enter side:");
            float si= s.nextFloat();
            double bb=shape.area(si);
            System.out.println(bb);
        }
        else if(c==4){
            System.out.println("Enter base:");
            double base = s.nextDouble();
            System.out.println("Enter height: ");
            double h = s.nextDouble();
            double cc= shape.area(h,base);
            System.out.println(cc);
        }
        else if(c==3){
            System.out.println("Enter radius:");
            double r=s.nextDouble();
            double d=shape.area(r);
            System.out.println(d);
        }
        else {
            System.out.println("Invalid input");
        }
        s.close();
    }
}
