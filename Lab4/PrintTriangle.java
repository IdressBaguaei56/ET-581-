public class PrintTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("--------------------");

        // First row of n stars
        for (int i = 0; i > n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("--------------------");

        // Decreasing rows of stars
        for (int j = 0; j < n; j++) { 
            for (int i = 0; i <= j; i++) { 
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

        System.out.println("--------------------");

    }
}
