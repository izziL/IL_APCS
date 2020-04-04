public class AHerdOfCats {
    public void feedCats(Cat[] clowder) {
        // This happens for every cat in the array
        for (Cat cat : clowder) {
            System.out.println(cat.getName() + "'s weight is " + cat.getWeight() + " pounds. I am feeding the cat one pound of fish.");
            cat.setWeight(cat.getWeight() + 1);
            System.out.println("The cat's new weight is " + cat.getWeight() + " pounds.");
        }
    }
    public static void main(String[] args) {
        // Creating cats
        Cat a = new Cat("Alex", 8.6);
        Cat b = new Cat("Bella", 12.7);
        Cat c = new Cat("Charlie", 9.4);
        Cat d = new Cat("Daisy", 8.1);
        Cat e = new Cat("Edward", 15.3);
        // Putting the cats into an array and feeding all of them
        Cat[] catClowder = new Cat[]{a, b, c, d, e};
        AHerdOfCats newClowder = new AHerdOfCats();
        newClowder.feedCats(catClowder);
    }
}