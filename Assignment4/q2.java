//Customer class + methiod overloading
class Customer{
    private double balance=2000.20;
    public void addBalance(double amount){
        balance += amount;
        showBalance();
    }
    public void addBalance(int amount){
        balance += amount;
        showBalance();
    }
    public void deductBalance(double amount){
        if(balance < amount){
            System.out.println("Cannot detuct as insufficient balance");
            return;
        }
        balance -= amount;
        showBalance();
    }
    public void deductBalance(int amount){
        if(balance < amount){
            System.out.println("Cannot detuct as insufficient balance");
            return;
        }
        balance -= amount;
        showBalance();
    }

    void showBalance(){
        System.out.printf("\nCurrent balance is: %f ",balance);
    }

}
public class q2 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.addBalance(200);
        c.deductBalance(100);
        c.addBalance(200.80);
    }
    
}
