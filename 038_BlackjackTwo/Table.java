import java.util.Scanner;

public class Table {
    Scanner scanner = new Scanner(System.in);
    public int dealCardsPlayer() {
        // Give the player two cards
        CardDispenser playerCardOne = new CardDispenser();
        playerCardOne.fixValue();
        CardDispenser playerCardTwo = new CardDispenser();
        playerCardTwo.fixValue();
        System.out.println("You received two cards: " + playerCardOne.getCard() + " and " + playerCardTwo.getCard() + ". The value of your cards is " + (playerCardOne.getValue() + playerCardTwo.getValue()) + ".");
        // Return the point value of the player
        return (playerCardOne.getValue() + playerCardTwo.getValue());
    }
    public int dealCardDealer() {
        // Give the dealer one card
        CardDispenser dealerCardOne = new CardDispenser();
        dealerCardOne.fixValue();
        System.out.println("The dealer's card is: " + dealerCardOne.getCard() + ". It has a value of " + dealerCardOne.getValue() + ".");
        return dealerCardOne.getValue();
    }
    // This method makes a new card
    public int makeNewCard() {
        CardDispenser newCard = new CardDispenser();
        newCard.fixValue();
        System.out.println("The new card is: " + newCard.getCard() + ". The value of the new card is " + newCard.getValue() + ".");
        return newCard.getValue();
    }
    // This plays the game using the other custom methods. I know this method is really long but I'm tired of working on this assignment.
    public void playGame() {
        System.out.println("HOW TO PLAY BLACKJACK\nThe goal of Blackjack is to get as close as possible to 21 without going over. You will get two cards at first. Then you decide if you want to get another card or not. Aces will count as 1.\n");
        int totalPlayerPoints = dealCardsPlayer();
        int totalDealerPoints = dealCardDealer();
        boolean keepPlaying = true;
        String hitStay;
        while (totalPlayerPoints < 21 && keepPlaying) {
            System.out.print("Would you like to hit or stay? If you would like to hit, please type in \"hit.\" ");
            hitStay = scanner.nextLine().strip().toLowerCase();
            if (!hitStay.equals("hit")) {
                keepPlaying = false;
            } else {
                totalPlayerPoints += makeNewCard();
                System.out.println("Your new total is " + totalPlayerPoints + ".");
            }
        }
        if (totalPlayerPoints == 21) {
            System.out.println("Good job, you won!");
        } else if (totalPlayerPoints > 21) {
            System.out.println("Sorry, you lost.");
        } else {
            System.out.println("\nDealer's turn");
            while (totalDealerPoints < 17) {
                totalDealerPoints += makeNewCard();
                System.out.println("The dealer's new total is " + totalDealerPoints + ".");
            }
            if (totalDealerPoints > 21) {
                System.out.println("Good job, you won!");
            } else if (totalPlayerPoints > totalDealerPoints) {
                System.out.println("Good job, you won!");
            } else if (totalDealerPoints == totalPlayerPoints) {
                System.out.println("You tied.");
            } else {
                System.out.println("Sorry, you lost.");
        }
        }
        
    }
    public static void main(String[] args) {
        Table game = new Table();
        game.playGame();
    }
}