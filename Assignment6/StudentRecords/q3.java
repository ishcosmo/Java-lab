package StudentRecords;
/*3)In a Student Records Management System,
 personal and academic details of students need to be stored securely while providing controlled access to their data.
  Create a package named StudentRecords containing a class Student with private attributes studentId, name, and grade.
   Provide a public constructor to initialize these attributes and a method displayStudentInfo() to print student details.
    Then, write another program outside the package that imports StudentRecords, creates Student objects, and displays their details. 
    This exercise will illustrate how encapsulation is maintained in Java, allowing data to be accessed only through well-defined 
    public methods while preventing direct modification of private fields.*/
public class q3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s2.details(2,"Prerna","O");
        s1.details(1,"Ishita","A");

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        
    }
}
