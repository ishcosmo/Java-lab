

/*
2) Create an ArrayList to store Employee objects with attributes like name, id, and salary.
 Add three employees, update one employee's salary, remove another by their id, and print the remaining employees.
 */
package Assignment9;
import java.util.ArrayList;
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return display();
    }
    public String display() {
        return name + " (ID: " + id + ", Salary: " + salary + ")";
    }
}

public class ques2 {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();

        e.add(new Employee("Ish", 1, 50000));
        e.add(new Employee("Diwa", 2, 60000));
        e.add(new Employee("Mini", 3, 70000));


        for (Employee emp : e) {
            if (emp.getId() == 2) {
                emp.setSalary(65000);
                break;
            }
        }

        
        e.removeIf(emp -> emp.getId() ==3);
        for (Employee emp : e) {
            System.out.println(emp);
        }
    }
}
