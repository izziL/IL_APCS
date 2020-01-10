import java.util.Scanner;

public class DateTranslator {
    // European date format
    public static void printEuropean(int day, int month, int year) {
        System.out.println("The European format of the date is " + day + "/" + month + "/" + year + ".");
    }

    // American date format
    public static void printAmerican(int day, int month, int year) {
        System.out.println("The American format of the date is " + month + "/" + day + "/" + year + ".");
    }

    public static void main(String[] args) {
        // Variables
        int dayInput;
        int monthInput;
        int yearInput;
        String dateFormat;
        // Make a scanner and ask for the inputs.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        dayInput = scanner.nextInt();
        System.out.print("Enter a month: ");
        monthInput = scanner.nextInt();
        System.out.print("Enter a year: ");
        yearInput = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Which date format would you like? Type in either \"American\" or \"European.\" ");
        dateFormat = scanner.nextLine().strip().toLowerCase();
        scanner.close();
        // Change it to American or European date format.
        if (dateFormat.equals("american")) {
            printAmerican(dayInput, monthInput, yearInput);
        } else if (dateFormat.equals("european")) {
            printEuropean(dayInput, monthInput, yearInput);
        } else {
            System.out.println("Sorry, I couldn't understand your answer.");
        }
    }
}