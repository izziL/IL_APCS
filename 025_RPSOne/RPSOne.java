import java.util.Scanner;

public class RPSOne {
    public static void main(String[] args) {
        // Make variables.
        String userChoice;
        int computerNum;
        String computerChoice;
        // RPS rules.
        System.out.println("HOW TO PLAY ROCK, PAPER, SCISSORS \nRock beats scissors. Scissors beats paper. Paper beats rock.");
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Get the user's input, either rock, paper, or scissors.
        System.out.print("Enter either \"rock,\" \"paper\" or \"scissors.\" ");
        userChoice = scanner.nextLine().trim();
        // Close scanner.
        scanner.close();
        // Make sure the input is valid. Whitespace is fine because it was trimmed when it was put into a variable.
        if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
            System.out.println("Invalid input. Please try again.");
        } else {
            // Give the computer either rock, paper or scissors.
            computerNum = (int) (Math.random() * 3);
            if (computerNum == 0) {
                computerChoice = "rock";
            } else if (computerNum == 1) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            // Tell the user who won.
            if (userChoice.equals(computerChoice)) {
                System.out.println("Your choice was " + userChoice + ", and the computer chose " + computerChoice + ". You tied.");
            } else if (userChoice.equals("rock")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("You chose rock, and the computer chose paper. You lost.");
                } else {
                    System.out.println("You chose rock, and the computer chose scissors. You win!");
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("You chose paper, and the computer chose rock. You win!");
                } else {
                    System.out.println("You chose paper, and the computer chose scissors. You lost.");
                }
            } else {
                if (computerChoice.equals("rock")) {
                    System.out.println("You chose scissors, and the computer chose rock. You lost.");
                } else {
                    System.out.println("You chose scissors, and the computer chose paper. You win!");
                }
            }
        }
    }
}