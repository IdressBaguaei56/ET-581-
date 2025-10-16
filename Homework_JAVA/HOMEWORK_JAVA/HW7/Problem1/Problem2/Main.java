/**
 * Main.java
 * Test program for Problem 2.
 */
public class Main {
    public static void main(String[] args) {
        // Polymorphism with override
        Book b1 = new EBook("AI in Education", 12.50, 1.8);
        b1.showInfo(); // Calls EBook's showInfo()

        // Library with covariant return type
        Library lib = new DigitalLibrary();
        Book b2 = lib.getBook(); // Actually an EBook instance
        b2.showInfo();

        // (Optional) Demonstrate safe downcast to access EBook-specific method
        if (b2 instanceof EBook) {
            EBook eb = (EBook) b2;
            System.out.printf("Size via getter: %.1f MB%n", eb.getFileSizeMB());
        }

        System.out.println("Program finished.");
    }
}
