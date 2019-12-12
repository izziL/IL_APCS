import java.util.Scanner;

public class ShippingCalculator {
    public static void main(String[] args) {
        // Declare variables.
        double cost = 0;
        double weight;
        // Create a scanner.
        Scanner scanner = new Scanner(System.in);
        // Ask how heavy their package is.
        System.out.print("How heavy is the package you would like to ship? ");
        weight = scanner.nextDouble();
        // Close the scanner.
        scanner.close();
        // See if the input is valid.
        if (weight <= 0) {
            System.out.println("This weight is an invalid input.");
        } else if (weight > 20) {
            System.out.println("This package is too large to be shipped.");
        } else {
            // Calculate and tell them how much shipping the package will cost.
            if (weight <= 1) {
                cost = 3.5;
            } else if (weight <= 3) {
                cost = 5.5;
            } else if (weight <= 10) {
                cost = 8.5;
            } else if (weight <= 20) {
                cost = 10.5;
            }
            System.out.println("It will cost $" + cost + "0 to ship the package.");
        }
    }
}
