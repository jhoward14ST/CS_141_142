import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// make a new Scanner object
		Scanner scanFace = new Scanner(System.in);

		// System.out.println("Please enter your first name: ");
		// String firstName = scanFace.nextLine();
		// System.out.println("Your first name is: " + firstName);

		 System.out.println("Please enter your full name: ");
		 String firstName = scanFace.next();
		 String lastName = scanFace.next();
		 System.out.println("Your first name is: " + firstName);
		 System.out.println("Your last name is : " + lastName);

	}



}