/**
 * Book.java
 * Base class for a book.
 */
public class Book {
    protected String title;
    protected double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    /** Show basic book info. Can be overridden. */
    public void showInfo() {
        System.out.printf("Book: %s, $%.2f%n", title, price);
    }
}
