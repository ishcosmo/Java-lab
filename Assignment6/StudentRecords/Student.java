package StudentRecords;
/*3)In a Student Records Management System,
 personal and academic details of students need to be stored securely while providing controlled access to their data.
  Create a package named StudentRecords containing a class Student with private attributes studentId, name, and grade.
   Provide a public constructor to initialize these attributes and a method displayStudentInfo() to print student details.
    Then, write another program outside the package that imports StudentRecords, creates Student objects, and displays their details. 
    This exercise will illustrate how encapsulation is maintained in Java, allowing data to be accessed only through well-defined 
    public methods while preventing direct modification of private fields.*/
public class Student {
    private int studentid;
    private String name;
    private String grade;

    public void details(int studentid,String name,String grade){
        this.studentid=studentid;
        this.name=name;
        this.grade=grade;}
    
    public void displayStudentInfo(){
        System.out.println("Student name: "+name);
        System.out.println("Student id: "+studentid);
        System.out.println("Student grade: "+grade);
    }
}
