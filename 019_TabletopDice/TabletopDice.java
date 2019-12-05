public class TabletopDice {
    public static void main(String[] args) {
        // Find values for each of the dice.
        int fourSide = (int) (Math.random() * 4 + 1);
        int sixSide = (int) (Math.random() * 6 + 1);
        int eightSide = (int) (Math.random() * 8 + 1);
        int tenSide = (int) (Math.random() * 10 + 1);
        int percentileTenSide = 10 * (int) (Math.random() * 10 + 1);
        int twelveSide = (int) (Math.random() * 12 + 1);
        int twentySide = (int) (Math.random() * 20 + 1);
        // Print out the values for each of the dice.
        System.out.println("The value of the d4 die is " + fourSide + ".");
        System.out.println("The value of the d6 die is " + sixSide + ".");
        System.out.println("The value of the d8 die is " + eightSide + ".");
        System.out.println("The value of the d10 die is " + tenSide + ".");
        System.out.println("The value of the percentile die is " + percentileTenSide + ".");
        System.out.println("The value of the d12 die is " + twelveSide + ".");
        System.out.println("The value of the d20 die is " + twentySide + ".");
    }
}