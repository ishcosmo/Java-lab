package CustomerPortal;
import ECommerce.Product;

public class CustomerCart {
    public static void main(String[] args) {
        Product product = new Product("Laptop",80000.659);
        product.getProductDetails(); // Accessible (as itss a public method)
        // product.applyDiscount(24.0); // Not accessible  (protected method, its inn a different package without any inheritance)
        // product.updateStock(122); // Not accessible (default access, different package)
        // product.calculateProfit(80.0, 152.0); // Not accessible (private method)
    }
}
