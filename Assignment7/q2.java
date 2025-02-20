package Assignment7;
/*
2.Consider an automotive application where you need to manage different types of vehicles. 
Create an interface called Vehicle with methods start(), stop(), and getFuelLevel(). 
Implement this interface in two classes, Car and Motorcycle, each providing its own implementation of the methods.
 Then write a main method that uses a Vehicle reference to hold objects of both Car and Motorcycle
  and calls the methods to demonstrate runtime polymorphism.*/
interface Vehicle{
     void start();
     void stop();
     void getFuelLevel();

}
class Car implements Vehicle{
    private double f;
    public Car(double f){
        this.f=f;
    }
    public void start(){
        System.out.println("Car starting....");
    }
    public void stop(){
        System.out.println("ar is stipping....");
    }
    public void getFuelLevel(){
        System.out.println("CAr fuel price: "+f);
    }
}

class Motorcycle implements Vehicle{
    private double f;
    public Motorcycle(double f){
        this.f = f;

    }
    public void start(){
        System.out.println("Motorcycle starting....");
    }
    public void stop(){
        System.out.println("Motorcycle is stopping....");
    }
    public void getFuelLevel(){
        System.out.println("Motorcycle fuel price: "+f);
    }

}
  public class q2 {
    public static void main(String[] args) {
        Vehicle c= new Car(2000.50);
        Vehicle m= new Motorcycle(670.45);
        c.start();
        c.stop();
        c.getFuelLevel();
        m.start();
        m.stop();
        m.getFuelLevel();
    }
}
