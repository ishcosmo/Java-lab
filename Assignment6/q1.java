//package Assignment6;
/*1)n a taxation system, businesses need to calculate the tax applied to their invoices while ensuring the tax rate remains unchanged. 
Create a class TaxCalculator that defines a final variable GST_RATE, set to 18.0%, which cannot be modified.
 Additionally, define a final method displayGST() that prints the tax rate.
  Create another class Invoice that extends TaxCalculator and includes a method calculateTotalWithTax(double amount), 
  which computes the total amount after applying GST_RATE. In the main() method, test the calculateTotalWithTax() method and observe
  what happens if you attempt to modify GST_RATE or override displayGST(). 
  This exercise will highlight how the final keyword ensures that tax rates remain constant across all calculations.*/
class TaxCalculator{
    final double gst_rate =18.0;
    final public void displayGST(){
        System.out.println(gst_rate);
    }
}
class Invoice extends TaxCalculator{
    
    public void calculateTotalWithTax(double amount){
        amount+= amount*gst_rate/100;
        System.out.println("The amount after tax is: "+amount);
}
}
public class q1 {
    public static void main(String[] args) {
        Invoice i = new Invoice();
        i.calculateTotalWithTax(2000.0);

    }
}
