/**
 * Driver.java
 * Demonstrates aggregation (Driver HAS-A Vehicle).
 */
public class Driver {
    private String name;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void drive() {
        vehicle.start();
        System.out.printf("Driver %s is driving%n", name);
    }
}
