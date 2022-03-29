import java.util.Scanner;

// Jared Howard

public class YardSaleScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double remainingBudget = yardSale(s, 50.75);
	}

	public static double yardSale(Scanner s, double money) {

		double moneyRemaining = money;
		double price = 0;
		double quantity = 0;
		double totalQuantity = 0;
		double mostExpensive = 0;

		while (moneyRemaining > price) {
			System.out.println("Price? ");
			if (s.hasNextDouble()) {
				price = s.nextDouble();
			}
			System.out.println("Quantity? ");
			if (s.hasNextDouble()) {
				quantity = s.nextInt();
				totalQuantity = (totalQuantity += quantity);
			}
			if ((quantity * price < moneyRemaining) && (price < 10)) {
				System.out.println("What a deal! I'll buy it.");
				System.out.println("Remaining money: $" + (moneyRemaining - (quantity * price)));
				System.out.println("");

				double purchase = (price * quantity);
				moneyRemaining = moneyRemaining - (quantity * price);
				if (purchase > mostExpensive) {
					mostExpensive = purchase;
				}

			} else {
				System.out.println("Remaining money: $" + (moneyRemaining));
				System.out.println("");
			}
		}

		System.out.println("Total quantity purchased: " + totalQuantity);
		System.out.println("Most expensive purchase: " + (mostExpensive));

		return moneyRemaining;
	}
}
