import java.util.Scanner;

public class RootCalculator {

	public static void main(String[] args) {
		// create the scanner
		Scanner scannyMcScanFace = new Scanner(System.in);
		double root = rootCalculator(scannyMcScanFace);
		System.out.println("The square root is: " + root);
		
		root = rootCalculator(scannyMcScanFace);
		System.out.println("The square root is: " + root);
	}

	public static double rootCalculator(Scanner s) {
		while (true) {
			System.out.println("Please enter a nonnegative number: ");

			if (s.hasNextDouble()) {
				double input = s.nextDouble();
				s.nextLine(); //clears out anything left in the input after retrieving what we want.
				if (input >= 0) {
					return Math.sqrt(input);
				} else {
					System.out.println("That number is negative. Try again.");
				}
			} else {
				s.nextLine(); //clear out the invalid input before repeating the loop.
				System.out.println("Invalid Input. Try again.");
			}
		}

	}

}