import java.util.Scanner;

public class Table {
    public static void dealOriginalCards() {
        // Give the player two cards
        CardDispenser playerCardOne = new CardDispenser();
        playerCardOne.fixValue();
        CardDispenser playerCardTwo = new CardDispenser();
        playerCardTwo.fixValue();
        System.out.println("You received two cards: " + playerCardOne.getCard() + " and " + playerCardTwo.getCard() + ". The value of your cards is " + (playerCardOne.getValue() + playerCardTwo.getValue()) + ".");
        // Give the dealer one card
        CardDispenser dealerCardOne = new CardDispenser();
        dealerCardOne.fixValue();
        System.out.println("The dealer's card is: " + dealerCardOne.getCard() + ". It has a value of " + dealerCardOne.getValue() + ".");
    }
    // This method makes a new card
    public static int makeNewCard() {
        CardDispenser newCard = new CardDispenser();
        newCard.fixValue();
        System.out.println("You received a new card: " + newCard.getCard() + ". The value of your new card is " + newCard.getValue() + ".");
        return newCard.getValue();
    }
    // This method is what happens when the user wants to hit to get another card.
    public static void hitOrStay() {
        String hitOrStay;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to hit or stay? If you would like to hit, please type in \"hit.\"");
        hitOrStay = scanner.nextLine().strip().toLowerCase();
        if (hitOrStay.equals("hit")) {
            makeNewCard();
        }
        scanner.close();
    }
    // This plays the game using the other custom methods.
    public static void playGame() {
        dealOriginalCards();
    }

    public static void main(String[] args) {
        playGame();
    }
}