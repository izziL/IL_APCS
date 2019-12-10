public class RefactorATableOfVariables {
    public static void main(String [] args) {
        // The following variables are for rows 2-5 and columns 1-3. row = r and column = c.
        // Initial variables.
        int c1r2 = 1;
        int c1r3 = 2;
        int c1r4 = 3;
        int c1r5 = 4;
        // Multiply the initial variables together to get the other variables.
        int c2r2 = c1r2 * c1r2;
        int c2r3 = c1r3 * c1r3;
        int c2r4 = c1r4 * c1r4;
        int c2r5 = c1r5 * c1r5;
        int c3r2 = c1r2 * c1r2 * c1r2;
        int c3r3 = c1r3 * c1r3 * c1r3;
        int c3r4 = c1r4 * c1r4 * c1r4;
        int c3r5 = c1r5 * c1r5 * c1r5;
        // This makes the top row of the table.
        System.out.println("a\ta^2\ta^3");
        // The following lines print the rest of the table.
        System.out.println("1\t" + c2r2 + "\t" + c3r2);
        System.out.println("2\t" + c2r3 + "\t" + c3r3);
        System.out.println("3\t" + c2r4 + "\t" + c3r4);
        System.out.println("4\t" + c2r5 + "\t" + c3r5);
    }
}
