import java.util.Scanner;

public class YetAgainRefactorATableOfVariables {
    public static void main(String [] args) {
        // The following variables are for rows 2-5 and columns 1-3. row = r and column = c.
        // Initial variables for the first row.
        int c1r2 = 1;
        int c1r3 = 2;
        int c1r4 = 3;
        int c1r5 = 4;
        // Multiply the initial variables together to get the other variables.
        double c2r2 = Math.pow(c1r2, 2);
        double c2r3 = Math.pow(c1r3, 2);
        double c2r4 = Math.pow(c1r4, 2);
        double c2r5 = Math.pow(c1r5, 2);
        double c3r2 = Math.pow(c1r2, 3);
        double c3r3 = Math.pow(c1r3, 3);
        double c3r4 = Math.pow(c1r4, 3);
        double c3r5 = Math.pow(c1r5, 3);
        // This makes the top row of the table.
        System.out.println("a\ta^2\ta^3");
        // The following lines print the rest of the table.
        System.out.println("1\t" + c2r2 + "\t" + c3r2);
        System.out.println("2\t" + c2r3 + "\t" + c3r3);
        System.out.println("3\t" + c2r4 + "\t" + c3r4);
        System.out.println("4\t" + c2r5 + "\t" + c3r5);
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Ask for what value the user would like to know what a^2 and a^3 are.
        System.out.println("Pick a number you would like me to calculate a^2 and a^3 for:");
        double number = scanner.nextDouble();
        // Close scanner.
        scanner.close();
        // Print out the values of a^2 and a^3.
        System.out.println("If a = " + number + ", then a^2 = " + Math.pow(number, 2) + " and a^3 = " + Math.pow(number, 3) + ".");
    }
}