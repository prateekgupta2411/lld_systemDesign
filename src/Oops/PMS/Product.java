package Oops.PMS;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayProductDetails(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }

//    @Override
//    public double calculateDiscount() {
//        return 0; // No discount for base product
//    }
}
//Attributes:
//int productId: A unique identifier for each product.
//String productName: The name of the product.
//double price: The price of the product.
//int quantity: The quantity available in the inventory.
//Methods:
//Constructor to initialize product attributes.
//Getter and setter methods for all attributes.
//displayProductDetails(): Method to display the details of a product.