package Assignment7;
/*1.In a 3D modeling application, define an abstract class named Solid that declares an abstract method calculateVolume().
 Then, derive two concrete classes—Cuboid and Sphere—from the Solid class.
  Each subclass should override calculateVolume() to compute its volume using the appropriate geometric formula.
   Finally, in your main method, create objects of Cuboid and Sphere and call their calculateVolume() methods
    to display the computed volumes. */
public class q1 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(2.4,3.2,5.6);
        Sphere s =  new Sphere(3.0);

        c.calculateVolume();
        s.calculateVolume();

    }
    
}

abstract class Solid{
    public abstract void calculateVolume();
}
class Cuboid extends Solid{
    double l,b,h;
    public Cuboid(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void calculateVolume(){
        System.out.printf("Volume of cuboid: %f ", (l*b*h));
    }
}
class Sphere extends Solid{
    double radius;
    public Sphere(double radius){
        this.radius=radius;
    }
    public void calculateVolume(){
        System.out.printf("Volume of spjere is: %f",((4.0/3.0)*3.14*(radius*radius*radius)));
    }
}