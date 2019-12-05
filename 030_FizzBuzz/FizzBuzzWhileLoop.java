import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Declare variables.
        int num;
        int count = 1;
        // Make a scaner.
        Scanner scanner = new Scanner(System.in);
        // Get a number from the user.
        System.out.print("Please enter a positive integer you would like to count up to. ");
        num = scanner.nextInt();
        // Close scanner.
        scanner.close();
        // Count up to that number.
        while (count <= num) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(count);
            }
            count++;
        }
    }
}