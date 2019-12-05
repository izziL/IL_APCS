import java.util.Scanner;

public class ScrabbleCalculator {
    public static void main(String[] args) {
        // Declare variables. Adding in blank tiles would screw up my whole program so I'm not doing that.
        String word;
        int points;
        int invalidCharacters = 0;
        int totalA = 9;
        int totalB = 2;
        int totalC = 2;
        int totalD = 4;
        int totalE = 12;
        int totalF = 2;
        int totalG = 3;
        int totalH = 2;
        int totalI = 9;
        int totalJ = 1;
        int totalK = 1;
        int totalL = 4;
        int totalM = 2;
        int totalN = 6;
        int totalO = 8;
        int totalP = 2;
        int totalQ = 1;
        int totalR = 6;
        int totalS = 4;
        int totalT = 6;
        int totalU = 4;
        int totalV = 2;
        int totalW = 2;
        int totalX = 1;
        int totalY = 2;
        int totalZ = 1;
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;
        int numF = 0;
        int numG = 0;
        int numH = 0;
        int numI = 0;
        int numJ = 0;
        int numK = 0;
        int numL = 0;
        int numM = 0;
        int numN = 0;
        int numO = 0;
        int numP = 0;
        int numQ = 0;
        int numR = 0;
        int numS = 0;
        int numT = 0;
        int numU = 0;
        int numV = 0;
        int numW = 0;
        int numX = 0;
        int numY = 0;
        int numZ = 0;
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Make the user enter a word.
        System.out.print("Enter a word to see what its point value is in Scrabble: ");
        word = scanner.nextLine();
        // Close scanner.
        scanner.close();
        // Figure out how many of each letter are in the box.
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equalsIgnoreCase("a")) {
                numA++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("b")) {
                numB++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("c")) {
                numC++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("d")) {
                numD++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("e")) {
                numE++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("f")) {
                numF++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("g")) {
                numG++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("h")) {
                numH++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("i")) {
                numI++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("j")) {
                numJ++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("k")) {
                numK++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("l")) {
                numL++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("m")) {
                numM++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("n")) {
                numN++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("o")) {
                numO++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("p")) {
                numP++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("q")) {
                numQ++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("r")) {
                numR++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("s")) {
                numS++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("t")) {
                numT++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("u")) {
                numU++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("v")) {
                numV++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("w")) {
                numW++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("x")) {
                numX++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("y")) {
                numY++;
            } else if (word.substring(i, i + 1).equalsIgnoreCase("z")) {
                numZ++;
            } else {
                invalidCharacters++;
            }
        }
        // If there are more of a letter in the word than letters in the box, or if there is an invalid character, tell them thay can't make that word. Otherwise, add up and tell them their score.
        if ((numA > totalA) || (numB > totalB) || (numC > totalC) || (numD > totalD) || (numE > totalE) || (numF > totalF) || (numG > totalG) || (numH > totalH) || (numI > totalI) || (numJ > totalJ) || (numK > totalK) || (numL > totalL) || (numM > totalM) || (numN > totalN) || (numO > totalO) || (numP > totalP) || (numQ > totalQ) || (numR > totalR) || (numS > totalS) || (numT > totalT) || (numU > totalU) || (numV > totalV) || (numW > totalW) || (numX > totalX) || (numY > totalY) || (numZ > totalZ) || (invalidCharacters > 0)) {
            System.out.println("Sorry, you can't make this word with the letters in a Scrabble box.");
        } else {
            points = numA + numE + numI + numO + numU + numL + numN + numS + numT + numR + 2 * (numD + numG) + 3 * (numB + numC + numM + numP) + 4 * (numF + numH + numV + numW + numY) + 5 * numK + 8 * (numJ + numX) + 10 * (numQ + numZ);
            System.out.println("The total point value for the word " + word + " is " + points + " points.");
        }
    }
}