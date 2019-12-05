import java.util.Scanner;

public class IsItLegalForYou {
    public static void main(String[] args) {
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Ask for the user's age.
        System.out.println("What is your age?");
        double age = scanner.nextDouble();
        // Close scanner.
        scanner.close();
        // Tell them what they are and aren't legally allowed to do.
        if (age >= 16) {
            System.out.println("You can get a driver's license.");
        } else {
            System.out.println("Sorry, you are not old enough to get a driver's license.");
        }
        if (age >= 18) {
                System.out.println("You are old enough to buy cigarettes.");
                System.out.println("You can go to a casino.");
        } else {
                System.out.println("Sorry, you cannot buy cigarettes.");
                System.out.println("Sorry, you are not old enough to go to a casino.");
        }
        if (age >= 21) {
            System.out.println("You are allowed to buy alcohol.");
            System.out.println("You can rent a car. If you are under 25, some companies may not allow you to rent a car, or you might have to pay a surcharge.");
        } else {
            System.out.println("You are not allowed to buy alcohol.");
            System.out.println("You can't rent a car.");
        }
    }
}