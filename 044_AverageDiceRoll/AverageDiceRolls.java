public class AverageDiceRolls {
    public void findAverageDieValue() {
        int totalPoints = 0;
        // Get the array
        OneThousandDiceRolls die = new OneThousandDiceRolls();
        int[] dieRolls = die.getDiceRolls();
        for (int roll : dieRolls) {
            totalPoints += roll;
        }
        System.out.println("The average die roll is " + (totalPoints / 1000) + ".");
    }
    public static void main(String[] args) {
        AverageDiceRolls x = new AverageDiceRolls();
        x.findAverageDieValue();
    }
}