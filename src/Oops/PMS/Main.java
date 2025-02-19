package Oops.PMS;
import java.util.*;
public class Main {
    public static double calculateTotalInventoryValueWithDiscount(List<Product> products) {
        double totalValue = 0;
        for (Product product : products) {
            double discount = 0;
            if (product instanceof Discountable) {
                discount = ((Discountable) product).calculateDiscount();
            }
            totalValue += (product.getPrice() - discount) * product.getQuantity();
        }
        return totalValue;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Creating products
        products.add(new Electronics(101, "Laptop", 50000, 2, "2 years"));
        products.add(new Groceries(102, "Rice", 200, 10, "2025-01-01"));
        products.add(new Furniture(103, "Table", 3000, 5, "Wood"));

        // Displaying product details
        for (Product product : products) {
            product.displayProductDetails();
            if (product instanceof Discountable) {
                System.out.println("Discount: " + ((Discountable) product).calculateDiscount());
            }
            System.out.println("--------------------------------");
        }

        // Calculating and displaying total inventory value with discount
        double totalValue = calculateTotalInventoryValueWithDiscount(products);
        System.out.println("Total Inventory Value (after discount): " + totalValue);
    }
}
