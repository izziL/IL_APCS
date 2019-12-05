import java.util.Scanner;

public class BasicNestedPractice {
    public static void main(String[] args) {
        // Declare variables.
        String letter;
        int rows;
        int columns;
        // Get the user inputs.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in a character you want me to print out. If you type in a word, I will use the first character. ");
        letter = scanner.nextLine().trim().substring(0, 1);
        System.out.print("How many rows of the letter would you like to print out? ");
        rows = scanner.nextInt();
        System.out.print("How many columns of the letter would you like to print out? ");
        columns = scanner.nextInt();
        scanner.close();
        // Make sure they don't want more than 20 rows or columns.
        if (rows > 20 || columns > 20) {
            System.out.println("Sorry, I can't print out more than 20 rows or columns.");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(letter + " ");
                }
                System.out.println();
            }
        }
    }
}