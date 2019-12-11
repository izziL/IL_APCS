public class LoremIpsumStringMethods {
    public static void main(String[] args) {
        // Lorem Ipsum
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Vulputate sapien nec sagittis aliquam malesuada bibendum arcu. Nisi est sit amet facilisis magna etiam tempor orci eu. Imperdiet dui accumsan sit amet nulla. Mauris pellentesque pulvinar pellentesque habitant morbi tristique senectus et netus. Gravida dictum fusce ut placerat orci nulla pellentesque dignissim enim. Lorem ipsum dolor sit amet consectetur. Dui vivamus arcu felis bibendum. Aenean euismod elementum nisi quis eleifend quam adipiscing vitae proin. Enim sit amet venenatis urna cursus eget. Bibendum ut tristique et egestas. Nibh sit amet commodo nulla. Non enim praesent elementum facilisis leo. Bibendum enim facilisis gravida neque convallis a cras semper. Pretium viverra suspendisse potenti nullam ac tortor. Ac auctor augue mauris augue neque gravida in fermentum. In hac habitasse platea dictumst vestibulum. A scelerisque purus semper eget duis at tellus at urna. Congue nisi vitae suscipit tellus mauris a diam maecenas sed. Semper auctor neque vitae tempus quam. Eleifend donec pretium vulputate sapien nec sagittis aliquam. Velit scelerisque in dictum non consectetur a. Aliquet lectus proin nibh nisl condimentum id. Tortor pretium viverra suspendisse potenti nullam ac tortor vitae. Fermentum et sollicitudin ac orci phasellus egestas tellus rutrum tellus. Consequat interdum varius sit amet mattis vulputate enim nulla. Velit egestas dui id ornare. Tellus rutrum tellus pellentesque eu tincidunt. Parturient montes nascetur ridiculus mus mauris vitae ultricies. Sit amet aliquam id diam. Amet nisl suscipit adipiscing bibendum est ultricies integer quis auctor. Nisi porta lorem mollis aliquam ut porttitor leo a. Vitae auctor eu augue ut lectus arcu bibendum at. Tellus at urna condimentum mattis pellentesque id nibh tortor id. Ultrices dui sapien eget mi proin. Vitae turpis massa sed elementum tempus egestas sed sed risus. Sit amet aliquam id diam maecenas ultricies. Adipiscing elit duis tristique sollicitudin nibh sit. Nec dui nunc mattis enim ut tellus elementum sagittis. Dolor purus non enim praesent elementum. Vestibulum lectus mauris ultrices eros in cursus turpis. Nec ullamcorper sit amet risus nullam eget felis eget. Sit amet commodo nulla facilisi nullam vehicula ipsum a. Amet consectetur adipiscing elit ut aliquam purus sit amet luctus. Sed velit dignissim sodales ut. Semper eget duis at tellus at. Euismod in pellentesque massa placerat duis ultricies. Pellentesque elit eget gravida cum sociis. Tellus in hac habitasse platea dictumst vestibulum rhoncus. Tellus in hac habitasse platea dictumst vestibulum rhoncus est pellentesque. Eget dolor morbi non arcu risus quis. Pulvinar neque laoreet suspendisse interdum consectetur libero. Porttitor massa id neque aliquam vestibulum. Nunc non blandit massa enim nec dui nunc. Amet aliquam id diam maecenas ultricies mi. Ut placerat orci nulla pellentesque dignissim enim sit amet. Aenean sed adipiscing diam donec adipiscing tristique risus nec feugiat. Gravida neque convallis a cras semper auctor neque vitae tempus. Amet luctus venenatis lectus magna fringilla urna porttitor rhoncus. Sed sed risus pretium quam. In mollis nunc sed id semper risus in hendrerit gravida. Ullamcorper sit amet risus nullam. Diam quis enim lobortis scelerisque fermentum dui faucibus. Sed risus ultricies tristique nulla aliquet. Pellentesque id nibh tortor id aliquet lectus. Dui id ornare arcu odio ut. Tincidunt tortor aliquam nulla facilisi cras fermentum odio eu. Urna nec tincidunt praesent semper feugiat nibh. Habitasse platea dictumst vestibulum rhoncus est. Massa sed elementum tempus egestas sed sed risus pretium quam. Facilisis leo vel fringilla est ullamcorper. At risus viverra adipiscing at. Sit amet dictum sit amet justo donec enim diam vulputate.                                                         ";
        // Print out the length of the blob.
        System.out.println("The length of the string is " + loremIpsum.length() + " characters. \n");
        // Make a new Lorem Ipsum string.
        String newLoremIpsum = loremIpsum.trim();
        // Print out the length of the new blob.
        System.out.println("The length of the new string is " + newLoremIpsum.length() + " characters. \n");
        // Print out the blob in upper case.
        System.out.println("The string is printed in upper case: " + newLoremIpsum.toUpperCase() + "\n");
        // Print out the blob in lower case.
        System.out.println("The string is printed in lower case: " + newLoremIpsum.toLowerCase() + "\n");
        // Figure out if the blob is equal to the word "goat."
        String goat = "goat";
        System.out.println("Is the string equal to the word \"goat\"? " + newLoremIpsum.equals(goat) + "\n");
        // Figure out if the blob is equal to the original blob.
        System.out.println("Is the string equal to the original string? " + newLoremIpsum.equals(loremIpsum) + "\n");
        // Figure out if the blob is equal to itself.
        System.out.println("Is the string equal to itself? " + newLoremIpsum.equals(newLoremIpsum) + "\n");
        // Find the index of the first "q" in the blob.
        System.out.println("What is the index of the first q? " + newLoremIpsum.indexOf("q") + "\n");
        // Find the index of the first "nullam" in the blob.
        System.out.println("What is the index of the word nullam? " + newLoremIpsum.indexOf("nullam") + "\n");
        // Substitute the letter "o" with the letter "x."
        System.out.println("Replace every \"o\" with \"x\": " + newLoremIpsum.replace("o", "x") + "\n");
        // Figure out if the blob contains the letter "z."
        System.out.println("Does the blob contain the letter \"z\"? " + newLoremIpsum.contains("z"));
    }
}
