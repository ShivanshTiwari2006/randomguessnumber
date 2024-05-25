import java.util.Scanner;
import java.util.Random;

public class learning {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;

        // Loop until the user guesses the correct number
        do {
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            // Check the guess
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number!");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }
        } while (guess != numberToGuess); // Loop continues until guess is correct
    }
}
