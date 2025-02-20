package Assignment7;

/*3.Design an interface called Wallet that declares two methods: addFunds(double amount) and spendFunds(double amount).
 Implement this interface in a class named DigitalWallet that maintains a private balance variable.
  Ensure that the class provides controlled access to update the balance only through the interface methods.
   Then, write a separate class with a main method that creates a DigitalWallet object, performs
    a series of fund additions and expenditures, and prints the updated balance to verify that external classes 
    cannot directly manipulate the wallet’s internal data.*/
interface Wallet{
    void addFunds(double amount);
    void spendFunds(double amount);
}
class DigitalWallet implements Wallet{
    private double balance;
    public DigitalWallet(double balance){
        this.balance=balance;
    }

    public void addFunds(double amount){
        balance+=amount;
        System.out.println("On adding, new balance: "+balance);
    }
    public void spendFunds(double amount){
        if (amount >0 && amount<= balance) {
            balance-=amount;
            System.out.println("On spending new balanxe: "+ balance);
        } else if (amount >balance) {
            System.out.println("Insufficient funds.. Transaction failed");
        } else {
            System.out.println("Invalid amount! ");
        }
    }
        
    }

    public class q3 {
        public static void main(String[] args) {
           DigitalWallet d= new DigitalWallet(10000);
            d.addFunds(1000);
            d.spendFunds(800);
            d.addFunds(1000);
        }
}
