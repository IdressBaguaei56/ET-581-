// HW1.java Number 8
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input tool
        System.out.print("Enter a 4 digit integer: ");
        int n = input.nextInt(); // read number

        // extract digits
        int first  = n / 1000;
        int second = (n / 100) % 10;
        int third  = (n / 10) % 10;
        int forth  = n % 10;

        // print results
        System.out.println("first digit: " + first);
        System.out.println("second digit: " + second);
        System.out.println("third digit: " + third);
        System.out.println("forth digit: " + forth);

        input.close(); // done
    }
}

// HW10.java Number 10 
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input tool
        System.out.print("Enter total seconds: ");
        int total = input.nextInt(); // read the number

        // convert to hours to minutes to seconds
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        // print result
        System.out.println(total + " seconds = " + hours + " hours, "
                           + minutes + " minutes, and " + seconds + " seconds");

        input.close(); // done
    }
}

