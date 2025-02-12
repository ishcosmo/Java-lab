package Assignment5;
//Uni person claass 3.A university has different types of people associated with it, including staff members and students.
// The base class Person contains common attributes such as name, age, and address.The class Staff extends Person and adds attributes like staffId and department.
// Further, a subclass Professor extends Staff by introducing an additional attribute, specialization, and a method conductLecture(). 
//Similarly, the Student class extends Person and adds studentId and course. Finally, the subclassGraduateStudent extends Student, adding researchTopic and a method submitThesis().
// Implement this university management system in Java using multilevel inheritance andmethodoverriding.
//Demonstrate polymorphism by creating an array of Person objects containing instances of Professor and GraduateStudent, and call their respective methods.
class Person{
    String name;
    int age;
    String address;
    public Person(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
class Staff extends Person{
    int staffid;
    String dept;
    public Staff(String name,int age,String address, int staffid,String dept){
        super(name,age,address);
        this.staffid=staffid;
        this.dept=dept;
    }

    @Override
    public void disp(){
        super.disp();
        System.out.println("I am Staff");
        System.out.println("Staff ID: " + staffid);
        System.out.println("Department: " + dept);
    }
}
class Professor extends Staff{
    String s;//specialization=s
    public Professor(String name,int age,String address,int staffid, String dept,String s){
        super(name,age,address,staffid,dept);
        this.s=s;
    }
    @Override
    public void disp(){
        super.disp();
        System.out.println("I am Professor");
        System.out.println("Specialixation is: "+s);
    }
    public void conductLecture(String s){
        System.out.println("Lecture conducted: "+ s);
    };
}
class Student extends Person{
    int sid;
    String course;
    public Student(String name,int age,String address,int sid,String c){
        super(name,age,address);
        this.sid=sid;
        this.course=c;
    }
    @Override
    public void disp(){
        super.disp();
        System.out.println("I am Student");
       
        System.out.println("Student id: "+sid);
        System.out.println("Student course: "+course);
    }

}
class GraduateStudent extends Student{
    String rtopic;
    public GraduateStudent(String name,int age,String address,int sid,String c,String rtopic){
        super(name,age,address,sid,c);
        this.rtopic=rtopic;
    }
    @Override
    public void disp(){
        super.disp();
        System.out.println("Thesis topic is: "+rtopic);
    }
    public void submitThesis(String rtopic){
        System.out.println("Thesis conducted on: "+ rtopic);
    };
}



public class q3 {
    public static void main(String[] args) {
        Professor a = new Professor("ISh",20,"123xyz",109,"EDTECH","CCVT");
        GraduateStudent b= new GraduateStudent("Prerna",20,"!@#$POL",123,"Physics","Themal expansion");
        a.conductLecture("Cloud computong ");
        a.disp();
        b.submitThesis("Heat and entropy");
        b.disp();




    }
}
