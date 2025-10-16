/**
 * EBook.java
 * Subclass of Book that adds file size and overrides showInfo().
 */
public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String title, double price, double fileSizeMB) {
        super(title, price);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void showInfo() {
        System.out.printf("EBook: %s, $%.2f, File Size: %.1f MB%n", title, price, fileSizeMB);
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
