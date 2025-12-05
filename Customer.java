/**
 * Represents a customer in the system.
 * Each customer has a unique ID, personal details, and a shopping cart.
 */
public class Customer {
    // Private Fields (Encapsulation)
    private int id;
    private String fullName;
    private String email;
    private ShoppingCart cart; // Association: Customer has-a ShoppingCart

    /**
     * Constructor to create a new Customer.
     * Automatically initializes an empty shopping cart.
     * @param id Unique Customer ID
     * @param fullName Full Name of the customer
     * @param email Email address
     */
    public Customer(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.cart = new ShoppingCart(); 
    }

    // --- GETTERS (Read Access) ---
    // These methods allow controlled read access to private fields.

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    // --- SETTERS (Write Access) ---
    // These methods allow updating specific customer details.
    // ID and Cart do not have setters because they should not be changed after creation.

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}