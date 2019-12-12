import java.util.Scanner;

public class SpellingBeeSimulator {
    public static void main(String[] args) {
        // Declare variables.
        String word;
        String capitalLetter;
        int currentLetterNum = 0;
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a word.
        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        // Close scanner.
        scanner.close();
        // Spell out the word, putting dashes in between the letters.
        System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " is spelled ");
        while (currentLetterNum < word.length()) {
            System.out.print(word.substring(currentLetterNum, currentLetterNum + 1));
            if (currentLetterNum < (word.length() - 1)) {
                System.out.print("-");
            }
            currentLetterNum++;
        }
        System.out.println(".");
    }
}
