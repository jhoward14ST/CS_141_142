import java.util.Scanner;

public class PurchaseMenu {
	// I'm going to have all of our prompts and messages up here to keep the lower
	// code a bit cleaner
	// Down to continuePrompt are the messages that'll be shown to the player until
	// the main portfolio screen
	static String beginningPrompt = "Welcome to investment portfolio simulator, you have $500000 to invest.";
	static String itemPrompt = "Please select what you would like to buy.";
	static String errorMessage = "That is more than you can afford! Please try again.";
	static String quantityPrompt = "Enter amount you would like to purchase:";
	static String dogePurchase = "Very good and smart purchase. plz buy more";
	static String endPrompt = "Done investing? Enter 123 to go to portfolio. ";
	static String continuePrompt = "Want to keep buying? Enter 321.";

	public static void purchaseMenu() {
		print("EQUITIES:");
		print("Enter 1 for S&P 500 GSPC - Price: $4204.11");
		print("Enter 2 for DJI Dow Jones Industrial average - Price: $34,529.45");
		print("Enter 3 for NASDAQ IXIC - Price: $13,748.74");
		print("Enter 4 for Amazon.com AMZN - Price: $3,223.07");
		print("Enter 5 for Boeing BA - Price: $247.47");
		print("Enter 6 for Exxon MobiL XOM - Price: $58.37");
		print("BONDS AND PROPERTY:");
		print("Enter 7 for Vanguard Intermediate Term Bond Index VICSX - Price: $3,000");
		print("Enter 8 for Delaware Extended Duration Bond Fund Class C DEECX - Price: $3,000");
		print("Enter 9 for Medium suburban house - Price $100,000");
		print("Enter 10 for Large suburban house - Price $250,000");
		print("Enter 11 for Plot of land outside the city - Price $25,000");
		print("Enter 12 for Plot of land in the city - Price $50,000");
		print("Enter 13 for DOGE - Price $420.69");
	}

	// Below are the prompts that will be displayed after the player is done
	// purchasing
	static String returnOrSimPrompt = "Enter 1 for portfolio or 2 for simulations.";
	static String portfolioMenu = "Welcome to your portfolio. Here are your holdings:";
	static String divSimYearsPrompt = "How many years would you like to simulate (1-20)?";
	static String simulationPrompt = "Please select one of the following simulations to run";

	public static void simulationMenu() {
		print("Enter 1 for Dividend Simulator");
		print("Enter 2 for Ten year growth simulator");
		print("Enter 3 for Twenty year growth simulator");
		print("Enter 4 for COVID 19 simulator");
		print("Enter 5 for Mortgage crisis simulator");
		print("Enter 246 to end program");
	}

	// Making a print method here to avoid writing System.out.println every time
	public static void print(String s) {
		System.out.println(s);
	}

	public static double promptNumberReadLine(Scanner s, String prompt, double max) {

		while (true) {
			System.out.print(prompt);
			if (!s.hasNextInt()) {
				System.out.println("That was not a valid number! Please try again.");
				s.nextLine();
			} else {
				double input = s.nextInt();
				s.nextLine();
				if (input < 1 || input > max) {
					System.out.println("That was not a valid number! Please try again.");
				} else {
					return input;
				}
			}
		}
	}

	public static double continuePrompt(Scanner s, String promptA, String promptB) {

		while (true) {
			// Prints out endPrompt
			System.out.print(promptA);
			// Prints out continuePrompt
			System.out.println(promptB);
			if (!s.hasNextInt()) {
				System.out.println("That was not a valid number! Please try again.");
				s.nextLine();
			} else {
				double input = s.nextInt();
				s.nextLine();
				if (input != 321 && input != 123) {
					System.out.println("That was not a valid number! Please try again.");
				} else {
					return input;
				}
			}
		}
	}

	public static double simulationMenu(Scanner s, String promptA) {
		while (true) {
			// Prompt a will be simulationPrompt
			System.out.print(promptA);
			// Prints out list of simulations
			simulationMenu();
			if (!s.hasNextInt()) {
				System.out.println("That was not a valid number! Please try again.");
				s.nextLine();
			} else {
				double input = s.nextInt();
				s.nextLine();
				if (input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 246) {
					System.out.println("That was not a valid number! Please try again.");
				} else {
					return input;
				}
			}
		}
	}

	public static double dividendSimPrompt(Scanner s, String promptA) {
		while (true) {
			// Prompt a will be divSimYearsPrompt
			System.out.print(promptA);
			if (!s.hasNextInt()) {
				System.out.println("That was not a valid number! Please try again.");
				s.nextLine();
			} else {
				double input = s.nextInt();
				s.nextLine();
				if (input <= 0) {
					System.out.println("That was not a valid number! Please try again.");
				} else {
					return input;
				}
			}
		}
	}

	// This will be used to create objects as the player selects what they want to
	// purchase
	public static void purchaseAssetCreator(double asset, double quantity) {
		if (asset == 1) {
			StockIndex GSPC = new StockIndex("S&P 500 GSPC", 4204.11, 0.55, 30.02, 32.96, 136, 272, quantity, 1.38, true);
		}
		if (asset == 2) {
			StockIndex DJI = new StockIndex("Dow Jones Industrial average DJI", 34529.45, 2.1, 19.16, 33.86, 150.3, 300.6, quantity, 2.24, true);
		}
		if (asset == 3) {
			StockIndex IXIC = new StockIndex("NASDAQ IXIC", 13748.74, 2.2, 24.08, 28.16, 118.05, 236.1, quantity, 1.17, false);
		}
		if (asset == 4) {
			StockIndex AMZN = new StockIndex("Amazon.com AMZN", 3223.07, 6.8, 21.73, 11.92, 1476.15, 2952.3, quantity, 0, false);
		}
		if (asset == 5) {
			StockIndex BA = new StockIndex("Boeing BA", 247.47, 1.8, 13.11, 71.22, 234.12, 468.25, quantity, 0, true);
		}
		if (asset == 6) {
			StockIndex XOM = new StockIndex("Exxon MobiL XOM", 58.37, 0.4, 10.76, 44.63, 28.27, 56.54, quantity, 5.94, true);
		}
		if (asset == 7) {
			StockIndex VICSX = new StockIndex("Vanguard Intermediate Term Bond Index VICSX", 3000, 0.04, 11.47, 11.47, 18.03, 36.07, quantity, 2.6, true);
		}
		if (asset == 8) {
			StockIndex DEECX = new StockIndex("Delaware Extended Duration Bond Fund Class C DEECX", 3000, 0.02, 11.47, 19.45, 9.07, 18.15, quantity, 6.6, true);
		}
//		if (asset == 9) {
//			RealEstate MediumHouse = new RealEstate("Medium Suburban house", 100000,);
//		}
//		if (asset == 10) {
//			RealEstate LargeHouse = new RealEstate("Large Suburban house", 250000,);
//		}
//		if (asset == 11) {
//			RealEstate CityLand = new RealEstate("Plot of land outside the city", 25000,);
//		}
//		if (asset == 12) {
//			RealEstate RuralLand = new RealEstate("Plot of land inside the city", 50000,);
//		}
//		if (asset == 13) {
//			StockIndex DOGE = new StockIndex("DOGE", 420.69, 10, 98, 99, 420, 840, quantity, 6.9, true);
//		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Buying is true until player chooses to go to portfolio menu
		boolean buying = true;
		// Viewing is false until player chooses to view holdings
		boolean viewing = false;
		// Simulating is false until player chooses to begin simulations
		boolean simulating = false;
		// Amount of money the player begins with
		double moneyRemaining = 500000;
		print(beginningPrompt);
		print("");
		while (buying) {
			purchaseMenu();
			print("");
			double item = promptNumberReadLine(s, itemPrompt, 13);
			if (item == 13) {
				// doge has different code than the rest
				double quantity = promptNumberReadLine(s, quantityPrompt, 8600);
				if (item * quantity > moneyRemaining) {
					// player can't spend more than 500000
					print(errorMessage);
				} else {
					double purchase = item * quantity;
					print("You have selected " + quantity + " of " + item + ". Total purchase = $" + purchase
							+ ". Enter C to confirm.");
					if (s.next().contains("c")) {
						//Calls purchaseAssetCreator to create object of holding
						purchaseAssetCreator(13, quantity);
						//Subtracts purchase from cash available
						moneyRemaining -= purchase;
						print(dogePurchase);
						print("You have $" + moneyRemaining + " to invest.");
						// prompting the player to either keep buying or go to portfolio menu
						double selection = continuePrompt(s, endPrompt, continuePrompt);
						if (selection == 123) {
							// end the purchase prompts and go to the main portfolio
							buying = false;
							viewing = true;
						} else { // else if the player opted to keep purchasing
							buying = true;
						}
					}
				}
			} else {
				double quantity = promptNumberReadLine(s, quantityPrompt, 8600);
				if (item * quantity > moneyRemaining) {
					// player can't spend more than 500000
					print(errorMessage);
				} else {
					double purchase = item * quantity;
					print("You have selected " + quantity + " of " + item + ". Total purchase = $" + purchase
							+ ". Enter C to confirm.");
					if (s.next().contains("c")) {
						//Calls purchaseAssetCreator to create object of holding
						purchaseAssetCreator(item, quantity);
						//Subtracts purchase from cash available
						moneyRemaining -= purchase;
						print("You have purchased " + quantity + " of " + item + ".");
						print("You have $" + moneyRemaining + " to invest.");
						// prompting the player to either keep buying or go to portfolio menu
						double selection = continuePrompt(s, endPrompt, continuePrompt);
						if (selection == 123) {
							// end the purchase prompts and go to the main portfolio
							buying = false;
							viewing = true;
						} else { // else if the player opted to keep purchasing
							buying = true;
						}
					}
				}
			}
		}
		while (viewing) {

		}
		while (simulating) {
			simulationMenu();
			print("");
			double simulation = simulationMenu(s, simulationPrompt);
			print("");
			// If player selects 1 run Dividend Simulator
			if (simulation == 1) {
				double years = dividendSimPrompt(s, divSimYearsPrompt);
				String name = ""; // needs object field
				double initialPrice = 0; // needs object field
				double shares = 0; // needs object field
				double dividends = 0; // needs object field
				// May not need the method below this line
				SimulatorMethods.divSim(initialPrice, shares, dividends, years);
				// WILL need the method one line below
				SimulatorMethods.divSimOutput(name, initialPrice, shares, dividends, years);
				simulating = false;
			}
			// If player selects 2 run Ten year growth simulator
			if (simulation == 2) {
				String name = ""; // needs object field
				double initialPrice = 0; // needs object field
				double shares = 0; // needs object field
				double tenYear = 0; // needs object field
				// May not need the method below this line
				SimulatorMethods.tenYearsSim(initialPrice, shares, tenYear);
				// WILL need the method one line below
				SimulatorMethods.tenYearSimOutput(name, initialPrice, shares, tenYear);
				simulating = false;
			}
			// If player selects 3 run Twenty year growth simulator
			if (simulation == 3) {
				String name = ""; // needs object field
				double initialPrice = 0; // needs object field
				double shares = 0; // needs object field
				double twentyYear = 0; // needs object field
				// May not need the method below this line
				SimulatorMethods.twentyYearsSim(initialPrice, shares, twentyYear);
				// WILL need the method one line below
				SimulatorMethods.twentyYearSimOutput(name, initialPrice, shares, twentyYear);
				simulating = false;
			}
			// If player selects 4 run COVID 19 simulator
			if (simulation == 4) {
				String name = ""; // needs object field
				double initialPrice = 0; // needs object field
				double shares = 0; // needs object field
				double covidSim = 0; // needs object field
				SimulatorMethods.covidLossSim(initialPrice, shares, covidSim);
				// WILL need the method one line below
				SimulatorMethods.covidCrash(name, initialPrice, shares, covidSim);
				simulating = false;
			}
			// If player selects 5 run Mortgage crisis simulator
			if (simulation == 5) {
				String name = ""; // needs object field
				double initialPrice = 0; // needs object field
				double shares = 0; // needs object field
				double mortgageSim = 0; // needs object field
				// May not need the method below this line
				SimulatorMethods.mortgageCrisisSim(initialPrice, shares, mortgageSim);
				// WILL need the method one line below
				SimulatorMethods.mortgageCrisisCrash(name, initialPrice, shares, mortgageSim);
				simulating = false;
			}
			// If player selects 246 end program
			if (simulation == 246) {
				break;
			}
		}
	}
}
