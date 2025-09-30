// Idress Baguaei
// ET581 - Java HW5
// Sep 30, 2025

public class HW5_IdressBaguaei {

    // Task 1: Find the maximum value in a 1D array
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // Task 2: Build a 2D array with random numbers (0–100)
    public static int[][] createRandom2DArray(int rows, int cols) {
        int[][] grid = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = (int)(Math.random() * 101);
            }
        }
        return grid;
    }

    // Task 3: Return the absolute difference between two numbers
    public static int absoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    // Task 4: Swap two elements in an array
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Helpers for printing arrays
    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    private static void print2D(int[][] grid) {
        for (int[] row : grid) printArray(row);
    }

    public static void main(String[] args) {
        // Test Task 1
        int[] numbers1 = {12, 45, 7, 89, 34};
        System.out.println("Max of numbers1 = " + maxArray(numbers1));

        // Test Task 2
        System.out.println("\nRandom 3x4 grid:");
        print2D(createRandom2DArray(3, 4));

        // Test Task 3
        System.out.println("\n|15 - 27| = " + absoluteDifference(15, 27));
        System.out.println("|30 - 10| = " + absoluteDifference(30, 10));

        // Test Task 4
        int[] numbers2 = {10, 20, 30, 40, 50};
        System.out.print("\nBefore swap: ");
        printArray(numbers2);
        swap(numbers2, 1, 3);
        System.out.print("After swap:  ");
        printArray(numbers2);
    }
}
