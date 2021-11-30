import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// get a random number between 0 and 100
		int target = (int) (Math.random() * 100) + 1;
		// get a guess to start with
		int guess = getGuess(s);

		// in a while loop:
		while (target != guess) {
			// compare the guess to the target
			// if not correct, give a message and repeat
			if (guess < target) {
				System.out.println("Your guess is too small. Try again. ");
			} else {
				System.out.println("Your guess is too big. Try again. ");
			}
			guess = getGuess(s);
		}

		// when loop is done, give a message and end.
		System.out.println("Yes! My number was " + target + ". Nice job!");

	}

	// prompt the user for a guess, and validate it
	public static int getGuess(Scanner s) {
		while (true) {
			System.out.println("Please enter a number from 0 to 100: ");
			if (s.hasNextInt()) {
				int input = s.nextInt();
				s.nextLine();
				if (input <= 0 || input > 100) {
					System.out.println("That is not in the correct range. Try again.");
				} else {
					return input;
				}
			} else {
				s.nextLine();
				System.out.println("That's not a valid guess. Try again.");
			}
		}
	}

}