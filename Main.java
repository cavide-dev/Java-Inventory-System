/**
 * Inventory Management System - Main Entry Point
 * * This class simulates a real-world scenario of a market inventory system.
 * It creates products, processes sales, manages stock, and handles customer interactions.
 * * @author Cavide Kurtes
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("--- Market Inventory System Started ---");

        // 1. Create Products (Initializing objects with real-world data)
        // Format: Name, Purchase Price, Selling Price, Initial Stock
        Product p1 = new Product("Organic Milk", 10.50, 15.00, 100);
        Product p2 = new Product("Chocolate Bar", 4.00, 7.50, 200);

        // 2. Display Initial Stock Status
        System.out.println("\n--- Initial Stock Status ---");
        printProductDetails(p1);
        printProductDetails(p2);

        // 3. Process Transactions (Simulating Sales and Restocking)
        System.out.println("\n--- Processing Transactions ---");
        
        // Selling items
        p1.sellProduct(20);  // Successful sale
        p2.sellProduct(250); // Should fail (Insufficient stock)
        
        // Restocking items
        p2.addStock(75);     // Adding new stock

        // 4. Customer Shopping Simulation
        System.out.println("\n--- Customer Shopping Simulation ---");
        Customer c1 = new Customer(101, "Alice Smith", "alice@example.com");
        
        // Adding products to customer's cart
        c1.getCart().addProduct(p1);
        c1.getCart().addProduct(p2);
        
        // Completing the purchase
        c1.getCart().checkout();

        System.out.println("\n--- System Shutdown ---");
    }

    /**
     * Helper method to print detailed information about a product.
     * Calculates and displays profit margins and total inventory value.
     * * @param p The product object to be displayed.
     */
    public static void printProductDetails(Product p) {
        System.out.println(p.toString());
        System.out.printf("Profit per Unit: $%.2f | Margin: %.2f%%\n", 
                          p.calculateProfit(), p.calculateProfitMargin());
        System.out.printf("Total Inventory Value (Cost): $%.2f\n", p.getTotalCostValue());
        System.out.println("------------------------------------------------");
    }
}