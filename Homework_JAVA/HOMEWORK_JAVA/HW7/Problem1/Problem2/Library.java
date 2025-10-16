/**
 * Library.java
 * Demonstrates instance initializer and a factory-like method getBook().
 */
public class Library {

    // Instance initializer block executes before the constructor
    {
        System.out.println("Library instance block executed");
    }

    public Library() {
        System.out.println("Library constructed");
    }

    /** Returns a Book (parent type). Can be overridden. */
    public Book getBook() {
        return new Book("Unknown", 10.00);
    }
}
