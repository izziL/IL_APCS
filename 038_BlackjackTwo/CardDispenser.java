public class CardDispenser {
    // Variables
    private String card;
    private int cardValue;
    private int suitNum;
    private String suit;
    // This method returns a random card.
    public String newCard() {
        cardValue = (int) (Math.random() * 13 + 1);
        if (cardValue < 11) {
            card = Integer.toString(cardValue);
        } else if (cardValue == 11) {
            cardValue = 10;
            card = "Jack";
        } else if (cardValue == 12) {
            cardValue = 10;
            card = "Queen";
        } else if (cardValue == 13) {
            cardValue = 10;
            card = "King";
        }
        if (cardValue == 1) {
            cardValue = 11;
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
    public int getValue(String card) {
        String stringCardValue = card.substring(0, 1);
        int finalCardValue = Integer.parseInt(stringCardValue);
        return finalCardValue;
    }
}