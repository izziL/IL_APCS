public class CardDispenser {
    // Variables
    private String card;
    private int cardValue;
    private int suitNum;
    private String suit;
    // This method returns a random number.
    public int newNum() {
        return (int) (Math.random() * 13 + 1);
    }
    // This method returns the point value of a card.
    public int pointValue(int cardValue) {
        if (cardValue > 10) {
            return 10;
        } else if (cardValue == 1) {
            return 11;
        } else {
            return cardValue;
        }
    }
    // This method returns a random card.
    public String newCard(int valueOfCard) {
        if (valueOfCard < 11) {
            card = Integer.toString(valueOfCard);
        } else if (valueOfCard == 11) {
            card = "Jack";
        } else if (valueOfCard == 12) {
            card = "Queen";
        } else if (valueOfCard == 13) {
            card = "King";
        }
        if (valueOfCard == 1) {
            card = "Ace";
        }
        suitNum = (int) (Math.random() * 4 + 1);
        if (suitNum == 1) {
            suit = "Hearts";
        } else if (suitNum == 2) {
            suit = "Diamonds";
        } else if (suitNum == 3) {
            suit = "Spades";
        } else {
            suit = "Clubs";
        }
        return card + " of " + suit;
    }
}