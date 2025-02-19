package Oops.PMS;

public class Electronics extends Product implements Discountable{
    public String warrantyPeriod;

    public Electronics(int productId, String productName, double price, int quantity, String warranty) {
        super(productId, productName, price, quantity);
        this.warrantyPeriod = warranty;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Warranty Period: " + warrantyPeriod);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount for electronics
    }
}
//Electronics Class (Derived Class):
//Inherits from the Product class.
//Additional Attributes:
//String warrantyPeriod: Warranty period of the electronics product.
//Methods:
//Constructor to initialize attributes.
//Override displayProductDetails() to include the warranty period.