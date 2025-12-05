/**
 * Represents a single product in the inventory.
 * Encapsulates product details such as pricing, stock quantity, and profit calculations.
 */
public class Product {
    // --- Fields (Properties) ---
    private String name;          // Name of the product
    private double purchasePrice; // Cost to buy the product (Cost Price)
    private double sellingPrice;  // Price to sell to customers
    private int stockQuantity;    // Current available stock

    /**
     * Constructor to initialize a new Product.
     * * @param name Name of the product
     * @param purchasePrice Cost price
     * @param sellingPrice Selling price
     * @param stockQuantity Initial stock count
     */
    public Product(String name, double purchasePrice, double sellingPrice, int stockQuantity) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.stockQuantity = stockQuantity;
    }

    // --- Business Logic Methods ---

    /**
     * Adds new stock to the inventory.
     * @param amount Quantity to add.
     */
    public void addStock(int amount) {
        if (amount > 0) {
            this.stockQuantity += amount;
            System.out.println(amount + " units added to " + this.name + ". New Stock: " + this.stockQuantity);
        } else {
            System.out.println("Error: Invalid amount.");
        }
    }

    /**
     * Processes a sale by reducing the stock.
     * Checks if there is enough stock before selling.
     * @param amount Quantity to sell.
     */
    public void sellProduct(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Invalid amount.");
        } else if (amount <= this.stockQuantity) {
            this.stockQuantity -= amount;
            System.out.println(amount + " units of " + this.name + " sold. Remaining: " + this.stockQuantity);
        } else {
            System.out.println("Error: Insufficient stock for " + this.name + "! (Current: " + this.stockQuantity + ")");
        }
    }

    /**
     * Calculates the net profit for a single unit.
     * Formula: Selling Price - Purchase Price
     */
    public double calculateProfit() {
        return this.sellingPrice - this.purchasePrice;
    }

    /**
     * Calculates the profit margin percentage.
     * Formula: (Net Profit / Purchase Price) * 100
     */
    public double calculateProfitMargin() {
        if (this.purchasePrice <= 0) return 0.0; // Avoid division by zero
        return (calculateProfit() / this.purchasePrice) * 100;
    }

    /**
     * Calculates the total value of the inventory based on the purchase cost.
     */
    public double getTotalCostValue() {
        return this.stockQuantity * this.purchasePrice;
    }

    // --- Getters ---
    public String getName() { return name; }
    public double getSellingPrice() { return sellingPrice; }
    public int getStockQuantity() { return stockQuantity; }

    @Override
    public String toString() {
        return String.format("Product: %s | Stock: %d | Buy: $%.2f | Sell: $%.2f", 
                             name, stockQuantity, purchasePrice, sellingPrice);
    }
}
