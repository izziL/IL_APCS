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

    public static void hitOrStay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to hit or stay? If you would like to hit, please type in \"hit.\"");
        
        scanner.close();
    }

    public static void main(String[] args) {
        dealOriginalCards();
    }
}