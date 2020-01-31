public class Table {
    public static void dealCards() {
        // Variables
        int playerCardOneNum;
        int playerCardOneValue;
        String playerCardOne;
        int playerCardTwoNum;
        int playerCardTwoValue;
        String playerCardTwo;
        // Blackjack Rules
        System.out.println("HOW TO PLAY BLACKJACK\nThe goal of Blackjack is to get as close as possible to 21 without going over. You will get two cards at first. Then you decide if you want to get another card or not. At the beginning, aces will count as 11. If you draw another card and go over 21, but you have an 11, the 11 will be changed to a one.");
        // Give two cards to the player and tell them their point value
        CardDispenser dispenser = new CardDispenser();
        playerCardOneNum = dispenser.newNum();
        playerCardTwoNum = dispenser.newNum();
        playerCardOneValue = dispenser.pointValue(playerCardOneNum);
        playerCardTwoValue = dispenser.pointValue(playerCardTwoNum);
        playerCardOne = dispenser.newCard(playerCardOneNum);
        playerCardTwo = dispenser.newCard(playerCardTwoNum);
        System.out.println("You have been dealt two cards: " + playerCardOne + " and " + playerCardTwo + ". The value of your cards is " + (playerCardOneValue + playerCardTwoValue) + ".");
    }
    public static void main(String[] args) {
        dealCards();
    }
}