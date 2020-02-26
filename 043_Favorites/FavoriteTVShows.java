public class FavoriteTVShows {
    public static void main(String[] args) {
        // Load the array
        String[] showsList = {"Show 1", "Show 2", "Show 3"};
        // Print out items by accessing the values
        System.out.println("Some of my favorite shows are: " + showsList[0] + ", " + showsList[1] + ", and " + showsList[2] + ".");
        // Print out the items with a for each loop
        System.out.print("Some of my favorite shows are: ");
        for (String i : showsList) {
            System.out.print(" " + i);
        }
        System.out.println(".");
    }
}