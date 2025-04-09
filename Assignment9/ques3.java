
/*3) Use a HashMap to manage a product inventory where keys are productId (Integer) and values are quantity (Integer).
 Add three products, update the quantity of one product, remove another, and display the final inventory. */
package Assignment9;
import java.util.HashMap;

public class ques3 {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> inventory = new HashMap<>();

        inventory.put(101, 50); // key banai id and value bni qty
        inventory.put(102, 30); 
        inventory.put(103, 20); 

        
        inventory.put(102, 40); // Update kari qty at key 102

        inventory.remove(103);

    
        System.out.println("Final Inventory:");
        for (Integer productId : inventory.keySet()) {
            System.out.println("Product ID: " + productId + ", Quantity: " + inventory.get(productId));
        }
    }
}