# 🛒 Java Market Inventory System

A robust, console-based **Inventory Management System** built with **Java**.
This project demonstrates core **Object-Oriented Programming (OOP)** principles such as **Encapsulation**, **Class Interactions**, and **Business Logic Implementation**.

## 🚀 Features
* **Product Management:** Tracks stock levels, purchase/selling prices, and calculates profit margins automatically.
* **Stock Control:** Prevents selling more items than available in stock (Validation).
* **Shopping Cart System:** Simulates a customer adding items to a cart and checking out.
* **Financial Reporting:** Calculates total inventory value (Cost vs. Sales) and individual product profitability.
* **Clean Code:** Written with English documentation and professional naming conventions.

## 🛠️ Technologies Used
* **Language:** Java (JDK 21 compatible)
* **Concepts:** OOP (Classes, Objects, Constructors, Encapsulation), Collections (ArrayList).
* **IDE:** VS Code / IntelliJ IDEA

## 💻 How to Run
You can compile and run this project using the command line or any Java IDE.

1. **Compile the source files:**
   ```bash
   javac Main.java
   ```

2. **Run the application:**
    ```bash
    java Main
    ```
## 📊 Example Output
Here is the real execution log of the system simulation:
 ```text
    --- Market Inventory System Started ---

--- Initial Stock Status ---
Product: Organic Milk | Stock: 100 | Buy: $10,50 | Sell: $15,00
Profit per Unit: $4,50 | Margin: 42,86%
Total Inventory Value (Cost): $1050,00
------------------------------------------------
Product: Chocolate Bar | Stock: 200 | Buy: $4,00 | Sell: $7,50
Profit per Unit: $3,50 | Margin: 87,50%
Total Inventory Value (Cost): $800,00
------------------------------------------------

--- Processing Transactions ---
20 units of Organic Milk sold. Remaining: 80
Error: Insufficient stock for Chocolate Bar! (Current: 200)
75 units added to Chocolate Bar. New Stock: 275

--- Customer Shopping Simulation ---
Organic Milk added to the shopping cart.
Chocolate Bar added to the shopping cart.
>> Checkout complete. Total items bought: 2

--- System Shutdown ---
```
## 📜 License
This project is open-source and available under the **MIT License**.


