// Idress Baguaei
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        String sentence = sc.nextLine();   // read full sentence

        // 1. Print sentence length using .length()
        System.out.println("Sentence length: " + sentence.length());

        // 2. Find index of "Java"
        int index = sentence.indexOf("Java");
        System.out.println("index is: " + index);

        // 3. if index is equal to -1 end main method
        if (index == -1) {
            System.out.println("terminate main method...");
            sc.close();
            return; // exit main method and terminate program.
        }

        // 4. Get substring from index to end
        String subString = sentence.substring(index);
        System.out.println("Substring: " + subString);

        // 4. Tokenize substring
        StringTokenizer st = new StringTokenizer(subString);
        String firstWord = st.nextToken();
        String secondWord = st.nextToken();

        System.out.println("firstWord: " + firstWord);
        System.out.println("secondWord: " + secondWord);

        // 5. Word lengths and comparison
        int len1 = firstWord.length();
        int len2 = secondWord.length();
        System.out.println("first word length: " + len1);
        System.out.println("second word length: " + len2);

        if (len1 > len2) {
            System.out.println("firstWord.length() > secondWord.length()");
        } else {
            System.out.println("firstWord.length() <= secondWord.length()");
        }

        // 6. Concatenated string
        String concatenated = firstWord.concat(secondWord);
        System.out.println("concatenated words: " + concatenated);

        // 7. Check if any word equals "Java"
        if (firstWord.equals("Java") || secondWord.equals("Java")) {
            System.out.println("One of the words is Java.");
        }

        // 8. Switch statement on first word
        switch (firstWord) {
            case "Java":
                System.out.println("You like Java!");
                break;
            case "Python":
                System.out.println("You like Python!");
                break;
            default:
                System.out.println("Other language detected");
        }

        sc.close();
    }
}
