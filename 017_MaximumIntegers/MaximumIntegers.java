public class MaximumIntegers {
    public static void main(String[] args) {
        // Maximum value of an integer.
        int maxInt = Integer.MAX_VALUE;
        // Minimum value of an integer.
        int minInt = Integer.MIN_VALUE;
        // Print out the value of the max and min integers.
        System.out.println("The maximum value of an integer is " + maxInt + " and the minimum value of an integer is " + minInt + ".");
        // Overflow the maximum to get 1 million.
        maxInt += 2_147_000_000;
        maxInt += 1_483_649;
        System.out.println("The variable maxInt is equal to " + maxInt);
        // Underflow the minimum to make 745.
        minInt -= 2_147_482_903;
        System.out.println("The variable minInt is equal to " + minInt);
    }
}
