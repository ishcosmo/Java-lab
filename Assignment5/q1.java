package Assignment5;
//Java program to demonstrate that a private member of a superclass cannot be accessed directly from a derived class.
class q {//q is superclasss
    private int x = 123;
    public int getPrivVar(){
        return x;}
}
class q11 extends q{
    public void disp(){
        System.out.println("Privater variable accessed by get "+getPrivVar());
    }
}
public class q1{
    public static void main(String[] args) {
        q11 obj = new q11();
        obj.disp();

    }
}











