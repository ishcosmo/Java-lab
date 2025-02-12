package Assignment5;
//Design a Java class Employee with attributes name, empid, and salary. Implement a default 
//constructor, a parameterized constructor, and methods to return the employee’s name and salary.
// Add a method increaseSalary(double percentage) to raise the salary by a userspecified percentage. 
//Create a subclass Manager with an additional instance variable department. Develop a test program to validate these functionalities.
public class q2 {
  public static void main(String[] args) {
    Employee e1=new Employee("Ishita",109,70000);
    Manager e2=new Manager("Prerna",200,80000,"Education");

    System.out.println("Employee Name: " + e1.getName());
    System.out.println("Employee Salary: " + e1.getSal());
    e1.increaseSalary(5);
    System.out.println("Employee Salary after increase: " + e1.getSal());

    System.out.println("Manager Name: " + e2.getName());
    System.out.println("Manager Salary: " + e2.getSal());
    System.out.println("Manager Department: " + e2.getDept());
    e2.increaseSalary(10);
    System.out.println("Manager Salary after increase: " + e2.getSal());

  }  
}
class Employee{
    String name;
    int empid;
    double salary;

    public Employee(){
        this.name="default";
        this.empid=0;
        this.salary=0;
    }
    public Employee(String x,int i,double s){
        this.name=x;
        this.empid=i;
        this.salary=s;}

    public String getName(){
        return name;
    }
    public double getSal(){
        return salary;
    }
    public void increaseSalary(double percentage){
        salary+=salary*percentage/100;
    }}

class Manager extends Employee{
    private String dept;
    public Manager(){
        super();
        this.dept="xyz";
    }
    public Manager(String name,int empid,double salary,String dept){
        super(name,empid,salary);
        this.dept=dept;

    }
    public String getDept(){
        return dept;
    }

}