
//4.Design an abstract class named Vehicle with abstract methods such as startEngine() and stopEngine(),
// as well as a non-abstract method serviceInfo() that prints basic servicing instructions. 
//Include a couple of protected or private fields (e.g., make, model) and a constructor for Vehicle that initializes those fields.
//Create a concrete class Car that extends Vehicle and provides implementations for startEngine() and stopEngine().
// Within these methods, include print statements or logic that simulates starting and stopping a car engine. 
//Finally, instantiate a Car object in the main method, call all available methods (including the inherited non-abstract method), and verify that your abstraction works as intended.
abstract class Vehicle{
    private final String make;
    private final String model;
    public Vehicle(String make,String model){
        this.make=make;
        this.model=model;
    }
    abstract public void startEngine();
    abstract public void stopEngine();
    public void serviceInfo(){
        System.out.println("some basic servicing instructions are: Tyre check, alignment, oiling etc");
    }
    public String getMake(){
        return make;
    }
    public String getModel() {
        return model;
    }
    

}
class Car extends Vehicle{
    public Car (String make,String model)
    { 
        super(make,model);
    }
    @Override
    public void startEngine() {
        System.out.println("The car engine is starting ..");
    }
    @Override
    public void stopEngine() {
        System.out.println("The car engine is stopping ..");
    }
}

public class q4 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Model 333");
        c.startEngine();
        c.stopEngine();
        c.serviceInfo();
        System.out.println("Car make: " + c.getMake());
        System.out.println("Car model: " + c.getModel());
    }
}
