import java.util.Scanner;

public class CustomCalculator {
    // Custom methods
    public static double add(double a, double b) {
        return (a+b);
    }
    public static double subtract(double a, double b) {
        return (a - b);
    }
    public static double multiple(double a, double b) {
        return (a * b);
    }
    public static double divide(double a, double b) {
        return (a / b);
    }
    public static double exponent(double a, double b) {
        return Math.pow(a, b);
    }
    public static double log(double a) {
        return Math.log10(a);
    }
    public static double ln(double a) {
        return Math.log(a);
    }
    public static double eToPower(double a) {
        return Math.exp(a);
    }
    // Execute the custom methods.
    public static void main(String[] args) {
        // Variables
        int choice;
        String choiceName;
        // Ask what the user wants to do.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like the calculator to do? Please enter the corresponding number: \n1) Add two numbers \n2) Subtract two numbers \n3) Multiply two numbers \n4) Divide two numbers \n5) Raise x to the yth power \n6) Take the log (base 10) of a number \n7) Take the natural log of a number \n8) Raise e to the xth power");
        choice = scanner.nextInt();
        scanner.nextLine();
        // Run the function they want to run.
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
            if (choice == 1) {
                choiceName = "add";
            } else if (choice == 1) {
                choiceName = "subtract";
            } else if (choice == 1) {
                choiceName = "multiply";
            } else {
                choiceName = "divide";
            }
            System.out.print("What is the first number you would like to " + choiceName + "? ");
        }
    }
}