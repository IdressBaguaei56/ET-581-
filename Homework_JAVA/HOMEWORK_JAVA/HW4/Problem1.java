// Idress Baguaei
//  Problem 1: Sum of each row

public class Problem1 {
    public static void main(String[] args) {

        // 2D array given
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Loop to calculate sum of each row
        for (int i = 0; i < arr.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumRow += arr[i][j];
            }
            System.out.println("Sum of row " + i + ": " + sumRow);
        }
    }
}
