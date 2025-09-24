// Idress Baguaei 
// Problem 3: Reverse each word in a sentence
import java.util.StringTokenizer;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Tokenize the sentence into words
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        // Loop through each word and reverse it
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            System.out.println(reversed);
        }

        sc.close();
    }
}
