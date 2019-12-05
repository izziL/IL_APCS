import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Make variables for the inputs and calculations.
        double principleBalance;
        double interestRate;
        double remainingMonths;
        double monthlyInterest;
        double monthlyPayment;
        // Ask for the principle balance.
        System.out.print("Enter your principle balance: ");
        principleBalance = scanner.nextDouble();
        // Ask for the annual interet rate.
        System.out.print("Enter your annual interest rate (in percentages, eg enter 5.5 for a 5.5% annual interest rate): ");
        interestRate = scanner.nextDouble();
        // Ask for the remaining months on their loan.
        System.out.print("Enter how many months you have left on your loan: ");
        remainingMonths = scanner.nextDouble();
        // Turn off the scanner.
        scanner.close();
        // Calculate and tell them what their monthly interst is.
        monthlyInterest = principleBalance * ((interestRate / 100) / remainingMonths);
        System.out.println("You monthly interest is $" + monthlyInterest + " per month.");
        // Calculate and tell them what their monthly payment will be.
        monthlyPayment = principleBalance / remainingMonths + monthlyInterest;
        System.out.println("Your monthly payment is $" + monthlyPayment + " per month.");
    }
}