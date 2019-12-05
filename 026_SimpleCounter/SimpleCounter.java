import java.util.Scanner;

public class SimpleCounter {
    public static void main(String[] args) {
        // Declare variables.
        int num;
        int count = 1;
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Ask for the input.
        System.out.print("Please enter a positive integer that you would like me to count up to. ");
        num = scanner.nextInt();
        // Close the scanner.
        scanner.close();
        // Count up to the integer.
        while (count <= num) {
            System.out.println(count);
            count++;
        }
    }
}