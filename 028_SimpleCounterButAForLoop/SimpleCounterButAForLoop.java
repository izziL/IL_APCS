public class SimpleCounterButAForLoop {
    public static void main(String[] args) {
        // Print out numbers from 0 to 300, inclusive.
        for (int i = 0; i <= 300; i++) {
            System.out.println(i);
        }
        // Print out numbers from 300 to 0, inclusive.
        for (int i = 300; i >= 0; i--) {
            System.out.println(i);
        }
        // Print out numbers from 4798 and 5324, inclusive.
        for (int i = 4798; i <= 5324; i++) {
            System.out.println(i);
        }
        // Print out numbers from 5324 to 4798, inclusive.
        for (int i = 5324; i >= 4798; i--) {
            System.out.println(i);
        }
    }
}
