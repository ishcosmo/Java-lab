package ECommerce;
/*4)In an Online Shopping System, different methods for handling product inventory and discounts need to be securely managed.
 Create a package ECommerce containing a class Product with a public method getProductDetails() to retrieve product information, 
 a protected method applyDiscount() for internal discount management, 
 a default-access method updateStock() for inventory updates within the same package,
  and a private method calculateProfit() that computes earnings internally.
   Then, create another package CustomerPortal with a class CustomerCart that attempts to access these methods from an instance of Product. 
   Demonstrate which methods are accessible and explain how Java’s access control 
   mechanism ensures that only the appropriate users can access sensitive product operations.*/
public class Product {
    String pname;
    double price;
   
    public Product(String pname,double price){
        this.pname=pname;
        this.price=price;
    }
    public void getProductDetails(){
        System.out.println("Product name is: "+pname);
        System.out.println("Product price is: "+price);
    }
    protected void applyDiscount(double discount){
        price+=price*discount/100;
    }
    void updateStock( int quantity){
        System.out.println("in The updated stock added quantity: "+quantity);

    }
    
    private void calculateProfit(double costPrice, double sellingPrice){
        double profit= sellingPrice-costPrice;
        System.out.println("Profit calculated: " + profit);
        
    }
}
