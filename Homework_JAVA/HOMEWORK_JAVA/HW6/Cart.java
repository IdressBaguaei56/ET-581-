/**
 * Idress Baguaei 
 * ET581 - HW6
 * Cart.java
 * 
 * This class stores up to 5 Product objects and keeps track of the total carts created.
 */
public class Cart {
    // Task 2: array of Product (size 5) and count
    private Product[] products = new Product[5];
    private int count = 0;

    // Task 3: static variable and method to track total carts
    private static int totalCartNumber = 0;

    // Constructor increments totalCartNumber
    public Cart() {
        totalCartNumber++;
    }

    // Add a product to the cart
    public void addProduct(Product p) {
        if (count >= products.length) {
            System.out.println("Cart is full!");
            return;
        }
        products[count] = p;
        count++;
    }

    // Calculate total price of all products
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    // Show product names and total
    public void showCart() {
        System.out.println("---- Cart Contents ----");
        if (count == 0) {
            System.out.println("(empty)");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("- " + products[i].getName());
            }
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("-----------------------");
    }

    // Static method: total carts created
    public static void printTotalCartNumber() {
        System.out.println("Total carts created: " + totalCartNumber);
    }
}
