//company tracks product details
class Product{
    int productId;
    String productName;
    String category;
    private int price;
    static int productCount=0;
    public Product(){
        this.productId=123;
        this.productName="XYZ";
        this.category="ABC";
        this.price=1000;
        productCount +=1;
    }
    public Product(int x,String y,String z, int xx){
        this.productId=x;
        this.productName=y;
        this.category=z;
        this.price=xx;
        productCount +=1;
    }
    public void getPrice(){
        System.out.println("Price is - "+price);
    }
    public void displayProductInfo(){
        System.out.println("Product Id: "+ productId);
        System.out.println("Product Name: "+ productName);
        System.out.println("Category: "+ category);

    }
    public static int getProductCount(){
        return productCount;
    }
    public float calculateStockValue(int quantity) {
        return price * quantity;
    }
    public float calculateStockValue(int quantity, float discount) {
        return (price * quantity)*(1-discount);
    }

}

public class q5 {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2 = new Product(11,"Oxford Dictionary","Book",850);
        p1.displayProductInfo();
        p2.displayProductInfo();
        System.out.println("Total number of products: " + Product.getProductCount());
        System.out.println("Stock value: " + p2.calculateStockValue(12));
        System.out.println("Stock value after discount: " + p2.calculateStockValue(12, 0.2f));



    }
}
