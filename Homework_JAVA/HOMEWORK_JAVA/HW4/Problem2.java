// Idress Baguaei 
// Problem 2: Sum of each column

public class Problem2 {
    public static void main(String[] args) {

        // 2D array given
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Loop to calculate sum of each column
        for (int col = 0; col < arr[0].length; col++) {
            int sumCol = 0;
            for (int row = 0; row < arr.length; row++) {
                sumCol += arr[row][col];
            }
            System.out.println("Sum of column " + col + ": " + sumCol);
        }
    }
}
