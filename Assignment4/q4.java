// car class and disply detailss
class Car{
    String make;
    String model;
    int year;
    public Car(String x,String y,int z){
        this.make=x;
        this.model=y;
        this.year=z;

    }
    public void displayCar(){
        System.out.println("MAke: "+make);
        System.out.println("Model= "+model);
        System.out.println("year of production: "+year);
    }
    
}
public class q4 {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla","Model 3",2025);
        Car c2 = new Car("Xpq","Yrs",2000);
        c1.displayCar();
        c2.displayCar();
    }
}
