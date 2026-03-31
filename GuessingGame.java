import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
 
        int numberToGuess = random.nextInt(100) + 1; 
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

   
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            
            
            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please stay within the 1-100 range!");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You found it in " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("That's not a valid number. Try again.");
                scanner.next(); 
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
