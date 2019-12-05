public class ATableOfVariables {
    public static void main(String [] args) {
        // The following variables are for rows 2-5 and columns 2 and 3. row = r and column = c.
        int c2r2 = 1;
        int c2r3 = 4;
        int c2r4 = 9;
        int c2r5 = 16;
        int c3r2 = 1;
        int c3r3 = 8;
        int c3r4 = 27;
        int c3r5 = 64;
        // This makes the top row of the table.
        System.out.println("a\ta^2\ta^3");
        // The following lines print the rest of the table.
        System.out.println("1\t" + c2r2 + "\t" + c3r2);
        System.out.println("2\t" + c2r3 + "\t" + c3r3);
        System.out.println("3\t" + c2r4 + "\t" + c3r4);
        System.out.println("4\t" + c2r5 + "\t" + c3r5);
    }
}