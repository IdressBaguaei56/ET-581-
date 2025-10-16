/**
 * Car.java
 * Subclass of Vehicle that demonstrates inheritance, overriding,
 * constructor chaining with super(), and instance initializer.
 */
public class Car extends Vehicle {
    private int doors;

    // Instance initializer block
    {
        System.out.println("Car instance block executed");
    }

    // Constructor calling superclass constructor
    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
        System.out.printf("Car created: %s, doors: %d%n", brand, doors);
    }

    // Overridden method
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    /*
    // This will cause a compile-time error because displayInfo() is final.
    @Override
    public void displayInfo() { }
    */
}
