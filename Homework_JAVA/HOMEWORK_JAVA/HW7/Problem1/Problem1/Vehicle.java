/**
 * Vehicle.java
 * Superclass representing a generic vehicle.
 * Demonstrates: constructor, instance initializer, regular and final methods.
 */
public class Vehicle {
    protected String brand;
    protected int year;

    // Instance initializer block: runs before the constructor
    {
        System.out.println("Vehicle instance block executed");
    }

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        System.out.printf("Vehicle created: %s, %d%n", brand, year);
    }

    // Regular method
    public void start() {
        System.out.println("Vehicle starts");
    }

    // Final method cannot be overridden
    public final void displayInfo() {
        System.out.printf("Brand: %s, Year: %d%n", brand, year);
    }
}
