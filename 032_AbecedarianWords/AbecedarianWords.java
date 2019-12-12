import java.util.Scanner;

public class AbecedarianWords {
    public static void main(String[] args) {
        // Declare variables.
        String word;
        boolean abecedarian = true;
        int count;
        // Ask the user to enter a word and store it in a variable.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check and see if it is an abecedarian word: ");
        word = scanner.nextLine();
        scanner.close();
        // Check to see whether the word is an abecedarian word. If two of the same letter are in the word next to each other, it is abecedarian.
        count = 1;
        while (count < word.length()) {
            if (word.substring(count, count + 1).compareToIgnoreCase(word.substring(count - 1, count)) < 0) {
                System.out.println("This word is not abecedarian.");
                abecedarian = false;
                break;
            }
            count++;
        }
        if (abecedarian) {
            System.out.println("This word is abecedarian.");
        }
        
    }
}
