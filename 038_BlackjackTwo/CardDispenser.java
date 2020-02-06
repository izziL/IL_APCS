public class CardDispenser {
    // Value of card
    private int cardNum = (int) (Math.random() * 13 + 1);
    private int cardValue = cardNum;
    private int suitNum = (int) (Math.random() * 4 + 1);
    private String suit;
    // Accessor methods
    public int getValue() {
        return cardValue;
    }
    public String getCard() {
        if (suitNum == 1) {
            suit = "Hearts";
        } else if (suitNum == 2) {
            suit = "Diamonds";
        } else if (suitNum == 3) {
            suit = "Spades";
        } else {
            suit = "Clubs";
        }
        return cardValue + " of " + suit;
    }
    // Mutator methods
    public void fixValue() {
        if (cardValue > 10) {
            cardValue = 10;
        }
    }
}