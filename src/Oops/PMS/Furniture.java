package Oops.PMS;

public class Furniture extends Product implements Discountable {
    private String Material;
    Furniture(int productId, String productName, double price, int quantity, String Material) {
        super(productId, productName, price, quantity);
            this.Material = Material;
    }
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Material: " + this.Material);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount for Furniture
    }
}
//Furniture Class (Derived Class):
//Inherits from the Product class.
//Additional Attributes:
//String material: Material used for the furniture (e.g., wood, metal).
//Methods:
//Constructor to initialize attributes.
//Override displayProductDetails() to include the material.