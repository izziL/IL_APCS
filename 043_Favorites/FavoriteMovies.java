public class FavoriteMovies {
    public static void main(String[] args) {
        // Set up the array
        String[] moviesList = new String[3];
        // Load in each value
        moviesList[0] = "Movie 1";
        moviesList[1] = "Movie 2";
        moviesList[2] = "Movie 3";
        // Print out items by accessing the values
        System.out.println("Some of my favorite movies are: " + moviesList[0] + ", " + moviesList[1] + ", and " + moviesList[2] + ".");
        // Print out the items with a for each loop
        System.out.print("Some of my favorite movies are: ");
        for (String i : moviesList) {
            System.out.print(" " + i);
        }
        System.out.println(".");
    }
}