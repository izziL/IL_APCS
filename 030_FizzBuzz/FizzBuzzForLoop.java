import java.util.Scanner;

public class FizzBuzzForLoop {
    public static void main(String[] args) {
        // Declare variables.
        int num;
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Get a number from the user.
        System.out.print("Please enter a positive integer you would like to count up to. ");
        num = scanner.nextInt();
        // Close scanner.
        scanner.close();
        // Count up to the inputted number.
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
