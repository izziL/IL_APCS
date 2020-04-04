public class SumPositiveOrNegative {
    public static void main(String[] args) {
        int sumOfPositives = 0;
        int sumOfNegatives = 0;
        // Get array
        OneThousandPositiveOrNegativeInts numberArray = new OneThousandPositiveOrNegativeInts();
        int[] array = numberArray.getOneThousandPositiveOrNegativeInts();
        // Calculate the sums of the positives and negatives using a for-each loop.
        for (int number : array) {
            if (number > 0) {
                sumOfPositives += number;
            } else {
                sumOfNegatives += number;
            }
        }
        System.out.println("The sum of the positives is " + sumOfPositives + ", and the sum of the negatives is " + sumOfNegatives + ".");
    }
}
