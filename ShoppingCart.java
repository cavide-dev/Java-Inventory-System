import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart that holds a list of selected products.
 */
public class ShoppingCart {
    private List<Product> items; // List to store products

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds a product to the cart.
     * @param product The product object to add.
     */
    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to the shopping cart.");
    }

    /**
     * Simulates the checkout process.
     * Displays the total number of items and clears the cart.
     */
    public void checkout() {
        System.out.println(">> Checkout complete. Total items bought: " + items.size());
        items.clear(); // Empty the cart after purchase
    }
}