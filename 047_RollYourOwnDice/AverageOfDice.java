import java.util.*;

public class AverageOfDice {
    ArrayList<Integer> rolls = new ArrayList<Integer>();
    public int roll100Die() {
        return (int) (Math.random() * 100 + 1);
    }
    public void addRoll(int roll) {
        System.out.println("Your roll: " + roll);
        rolls.add(roll);
        int rollTotal = 0;
        for (int number : rolls) {
            rollTotal += number;
        }
        System.out.println("The average of the rolls is: " + (rollTotal / rolls.size()));
    }
    public static void main(String[] args) {
        AverageOfDice rollingDice = new AverageOfDice();
        rollingDice.addRoll(100);
        rollingDice.addRoll(50);
    }
}