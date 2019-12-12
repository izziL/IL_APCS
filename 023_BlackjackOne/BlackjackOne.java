import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class BlackjackOne {
    public static void main(String[] args) {
        // Declare variables.
        int card1Player;
        int card2Player;
        int card3Player = 0;
        int totalPlayer;
        int card1Dealer;
        int card2Dealer;
        int totalDealer;
        String hitOrStay;
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Tell the player how to play Blackjack. The rules have been simplified so it is easier to code.
        System.out.println("HOW TO PLAY BLACKJACK\nThe goal of Blackjack is to get as close as possible to 21 without going over. You will get two cards at first. Then you decide if you want to get another card or not. At the beginning, aces will count as 11. If you draw another card and go over 21, but you have an 11, the 11 will be changed to a one.");
        // Deal two cards to the player. If the card is any one of the face cards, it counts as 10. Aces count as 11 at first. Tell them what their cards are.
        card1Player = (int) (Math.random() * 13 + 1);
        if (card1Player > 10) {
            card1Player = 10;
        } else if (card1Player == 1) {
            card1Player = 11;
        }
        card2Player = (int) (Math.random() * 13 + 1);
        if (card2Player > 10) {
            card2Player = 10;
        } else if (card2Player == 1) {
            card2Player = 11;
        }
        totalPlayer = card1Player + card2Player;
        System.out.println("The values of your cards are " + card1Player + " and " + card2Player + ". Your current total is " + totalPlayer + ".");
        // Tell them one of the dealer's cards. The dealer only gets two cards because it's too complicated to give the dealer another card.
        card1Dealer = (int) (Math.random() * 13 + 1);
        if (card1Dealer > 10) {
            card1Dealer = 10;
        } else if (card1Dealer == 1) {
            card1Dealer = 11;
        }
        card2Dealer = (int) (Math.random() * 13 + 1);
        if (card2Dealer > 10) {
            card2Dealer = 10;
        } else if (card2Dealer == 1) {
            card2Dealer = 11;
        }
        totalDealer = card1Dealer + card2Dealer;
        System.out.println("One of the dealer's cards is: " + card1Dealer + ".");
        // If the total is 21, the player wins.
        if (totalPlayer == 21) {
            System.out.println("Since your total is 21, you win!");
        }
        // If the total isn't equal to 21, ask the player if they want to hit or stay.
        else {
            System.out.print("Would you like to hit or stay? Please type either \"hit\" or \"stay.\" ");
            hitOrStay = scanner.nextLine();
            // If they want to hit, give them a third card. If they have an ace and their total goes over 21, change the ace to a value of 1.
            if (hitOrStay.equals("hit")) {
                // Give them another card.
                card3Player = (int) (Math.random() * 13 + 1);
                if (card3Player > 10) {
                    card3Player = 10;
                } else if (card3Player == 1) {
                    card3Player = 11;
                }
                totalPlayer = card1Player + card2Player + card3Player;
                // If the sum is greater than 21, change any 11's to 1's.
                if (totalPlayer > 21) {
                    if (card1Player == 11) {
                        card1Player = 1;
                    }
                    if (card2Player == 11) {
                        card2Player = 1;
                    }
                    if (card3Player == 11) {
                        card3Player = 1;
                    }
                    totalPlayer = card1Player + card2Player + card3Player;
                }
                // Tell the player what the value of their cards is. For simplicity, the user cannot draw a fourth card.
                System.out.println("The third card has a value of " + card3Player + ". Your new total is " + totalPlayer + ".");
            }
            // Close scanner.
            scanner.close();
            // They bust if they are over 21.
            if (totalPlayer > 21) {
                System.out.println("Your total is over 21. Dealer wins.");
            } else {
                // Tell the user who won.
                System.out.println("The dealer's cards are: " + card1Dealer + " and " + card2Dealer + ". The dealer's total is " + totalDealer + ".");
                if (totalPlayer > totalDealer) {
                    System.out.println("Your total is larger than the dealer's total. You won!");
                } else {
                    System.out.println("Sorry, the dealer won.");
                }
            } 
        }
    }
}
