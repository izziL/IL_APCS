public class FlipACoin {
    public static void main(String[] args) {
        // Generate a random number: either 0 or 1.
        int number = (int) (Math.random() * 2);
        // Make this into heads or tails.
        if (number == 0) {
            System.out.println("The result of the coin fip is heads.");
        } else {
            System.out.println("The result of the coin fip is tails.");
        }
    }
}