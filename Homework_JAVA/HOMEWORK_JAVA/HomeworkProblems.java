package Homework_JAVA.HOMEWORK_JAVA;

// Idress Baguaei
// Problem 1: Sum, Average, Minimum, Maximum


import java.util.Scanner;

public class HomeworkProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu for user to choose which problem to run
        System.out.println("Choose a problem to run:");
        System.out.println("1. Problem 1 - Sum, Average, Min, Max");
        System.out.println("2. Problem 2 - Reverse String and Count Vowels");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear newline from buffer

        if (choice == 1) {
            runProblem1(sc);
        } else if (choice == 2) {
            runProblem2(sc);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }

    // ------------------ Problem 1 ------------------
    public static void runProblem1(Scanner sc) {
        // Ask user for number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements must be positive.");
            return;
        }

        // Create array to store integers
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize sum, min, max
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop to calculate sum, min, and max
        for (int i = 0; i < n; i++) {
            sum += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Compute average
        double average = (double) sum / n;

        // Output results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }

    // Problem 2: Reverse String and Count Vowels
    // ------------------ Problem 2 ------------------
    public static void runProblem2(Scanner sc) {
        // Ask user for a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Print original string
        System.out.println("Original string: " + input);

        // Reverse using a for loop and charAt()
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Reversed (for loop): " + reversed.toString());

        // Count vowels
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }
}
