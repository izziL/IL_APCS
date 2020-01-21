import java.util.Scanner;

public class CustomCalculator {
    // Custom methods
    public static double add(double a, double b) {
        return (a+b);
    }
    public static double subtract(double a, double b) {
        return (a - b);
    }
    public static double multiply(double a, double b) {
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
        String choiceName = "";
        double numOne;
        double numTwo = 0;
        // Ask what the user wants to do.
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like the calculator to do? Please enter the corresponding number: \n1) Add two numbers \n2) Subtract two numbers \n3) Multiply two numbers \n4) Divide two numbers \n5) Raise x to the yth power \n6) Take the log (base 10) of a number \n7) Take the natural log of a number \n8) Raise e to the xth power");
        choice = scanner.nextInt();
        scanner.nextLine();
        // Run the function they want to run.
        if (choice == 1 || choice == 3) {
            if (choice == 1) {
                choiceName = "add";
            } else {
                choiceName = "multiply";
            }
            System.out.print("What is the first number you would like to " + choiceName + "? ");
            numOne = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("What is the second number you would like to " + choiceName + "? ");
            numTwo = scanner.nextDouble();
            System.out.print("The answer is ");
            if(choiceName.equals("add")) {
                System.out.println(add(numOne, numTwo) + ".");
            } else {
                System.out.println(multiply(numOne, numTwo) + ".");
            }
        } else if (choice == 2) {
            System.out.print("What number would you like to subtract from? (minuend) ");
            numOne = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("What number would you like to subtract? (subtrahend) ");
            numTwo = scanner.nextDouble();
            System.out.println("The answer is " + subtract(numOne, numTwo) + ".");
        } else if (choice == 4) {
            System.out.print("What number would you like to divide? (dividend) ");
            numOne = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("What would you like the divisor to be? ");
            numTwo = scanner.nextDouble();
            System.out.println("The answer is " + divide(numOne, numTwo) + ".");
        } else if (choice == 5) {
            System.out.print("What would you like the base to be? ");
            numOne = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("What would you like the exponent to be? ");
            numTwo = scanner.nextDouble();
            System.out.println("The answer is " + exponent(numOne, numTwo) + ".");
        } else if (choice == 6) {
            System.out.print("What number would you like to take the log base 10 of? ");
            numOne = scanner.nextDouble();
            System.out.println("The answer is " + log(numOne) + ".");
        } else if (choice == 7) {
            System.out.print("What number would you like to take the natural log of? ");
            numOne = scanner.nextDouble();
            System.out.println("The answer is " + ln(numOne) + ".");
        } else if (choice == 8) {
            System.out.print("To what power would you like to raise e to? ");
            numOne = scanner.nextDouble();
            System.out.println("The answer is " + eToPower(numOne) + ".");
        }
        scanner.close();
    }
}