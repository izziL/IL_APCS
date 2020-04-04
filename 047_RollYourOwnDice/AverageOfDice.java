import java.util.*;

public class AverageOfDice {
    // Creates new, empty array list and variables
    ArrayList<Integer> rolls = new ArrayList<Integer>();
    static double average = 0;
    // Roll a random number
    public int roll100Die() {
        return (int) (Math.random() * 100 + 1);
    }
    // Adds a roll and calculates the new average
    public void addRoll(int roll) {
        double rollTotal = 0;
        System.out.println("Your roll: " + roll);
        rolls.add(roll);
        for (int number : rolls) {
            rollTotal += number;
        }
        average = rollTotal / rolls.size();
        System.out.println("The average of the rolls so far is: " + average);
    }
    // Main method that calls fuctions from the class
    public static void main(String[] args) {
        AverageOfDice rollingDice = new AverageOfDice();
        boolean keepGoing = true;
        String input;
        // Create a scanner and ask them how many times they want to roll
        Scanner scanner = new Scanner(System.in);
        while (keepGoing) {
            System.out.print("Would you like to roll the die? If so, please type \"roll.\" ");
            input = scanner.nextLine().strip().toLowerCase();
            if (input.equals("roll")) {
                rollingDice.addRoll(rollingDice.roll100Die());
            } else {
                keepGoing = false;
            }
        }
        scanner.close();
        System.out.println("The average of all your rolls is: " + average);
    }
}