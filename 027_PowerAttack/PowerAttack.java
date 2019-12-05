public class PowerAttack {
    public static void main(String[] args) {
        // Declare variables.
        int charStrength = 3;
        int monsterArmor = 11;
        int roll;
        int hit = 0;
        // Swing until you hit the monster.
        while (hit < 11) {
            // Make a random roll number.
            roll = (int) (Math.random() * 10 + 1);
            // Tell the user what the hit number is and whether it is high enough to hit the monster.
            System.out.println("You swung a " + (hit = roll + charStrength) + ".");
        }
        System.out.println("You hit the monster!");
    }
}