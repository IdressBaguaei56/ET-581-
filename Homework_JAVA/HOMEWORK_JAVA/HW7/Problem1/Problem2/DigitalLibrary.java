/**
 * DigitalLibrary.java
 * Extends Library and demonstrates covariant return type by overriding getBook()
 * to return EBook (a subtype of Book).
 */
public class DigitalLibrary extends Library {

    public DigitalLibrary() {
        // super() called implicitly; Library instance block runs before this.
        System.out.println("DigitalLibrary constructed");
    }

    @Override
    public EBook getBook() { // Covariant return type (EBook extends Book)
        return new EBook("Java Basics", 15.00, 2.5);
    }
}
