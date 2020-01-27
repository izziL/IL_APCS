public class CardDispenser {
    // Variables
    int number;
    int suitNum;
    String suit;
    // This method returns a random card. There are no jacks, queens or kings, but 10s are 4 times as likely to show up as any other number.
    public String newCard() {
        number = (int) (Math.random() * 13 + 1);
        if (number > 10) {
            number = 10;
        }
        suitNum = (int) (Math.random() * 4 + 1);
        if (suitNum == 1) {
            suit = "hearts";
        } else if (suitNum == 2) {
            suit = "diamonds";
        } else if (suitNum == 3) {
            suit = "spades";
        } else {
            suit = "clubs";
        }
        return number + " of " + suit;
    }
}