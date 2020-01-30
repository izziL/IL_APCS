public class Table {
    public static void playBlackjack() {
        // Variables
        String playerCardOne;
        String playerCardTwo;
        // Blackjack Rules
        System.out.println("HOW TO PLAY BLACKJACK\nThe goal of Blackjack is to get as close as possible to 21 without going over. You will get two cards at first. Then you decide if you want to get another card or not. At the beginning, aces will count as 11. If you draw another card and go over 21, but you have an 11, the 11 will be changed to a one.");
        // Give two cards to the player and tell them their point value
        CardDispenser dispenser = new CardDispenser();
        playerCardOne = dispenser.newCard();
        playerCardTwo = dispenser.newCard();
        System.out.println("hi");
        //System.out.println("You have been dealt two cards: " + dispenser.getValue(playerCardOne) + " and " + dispenser.getValue(playerCardTwo) /*+ ". The value of your cards is " + (dispenser.getValue(playerCardOne) + dispenser.getValue(playerCardTwo)) + "."*/);
    }
    public static void main(String[] args) {
        playBlackjack();
    }
}