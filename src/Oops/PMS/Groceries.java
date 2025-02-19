package Oops.PMS;

public class Groceries extends Product implements  Discountable{
    public String expiryDate;
    public Groceries(int productId, String productName, double price, int quantity, String expiryDate) {
        super(productId, productName, price, quantity);
        this.expiryDate = expiryDate;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount for groceries
    }
}
//Groceries Class (Derived Class):
//Inherits from the Product class.
//Additional Attributes:
//String expiryDate: Expiry date of the grocery item.
//Methods:
//Constructor to initialize attributes.
//Override displayProductDetails() to include the expiry date.
