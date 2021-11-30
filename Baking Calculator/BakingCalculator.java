
// Jared Howard
public class BakingCalculator {
	
	public static int bagsOfFlour(int cookieCount,int loafCount) {
		// Calculates bags of flour required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.135/36.0 + loafCount * 0.09);
		// Replace this with the actual solution.
	}

	public static int containersOfSalt(int cookieCount, int loafCount) {
		// Calculates containers of Salt required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.0048/36.0 + loafCount * 0.0016);
	}

	public static int boxesOfBakingSoda(int cookieCount, int loafCount) {
		// Calculates boxes of baking soda required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.0104/36.0 + loafCount * 0.0104); //Replace this with the actual solution.
	}

	public static int bottlesOfVanilla(int cookieCount, int loafCount) {
		// Calculates bottles of vanilla required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.0312/36.0 + loafCount * 0.0416); //Replace this with the actual solution.
	}

	public static int cartonsOfEggs(int cookieCount, int loafCount) {
		// Calculates cartons of eggs required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.1666/36.0 + loafCount * 0.1666); //Replace this with the actual solution.
	}

	public static int bagsOfSugar(int cookieCount, int loafCount) {
		// Calculates bags of sugar required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.075/36.0 + loafCount * 0.0375); //Replace this with the actual solution.
	}

	public static int packagesOfButter(int cookieCount, int loafCount) {
		// Calculates packages of butter required for cookies and loaves
		return (int) Math.ceil(cookieCount * 0.375/36.0 + loafCount * 0.1666); //Replace this with the actual solution.
	}

	public static int bananas(int cookieCount, int loafCount) {
		// Calculates bananas required for cookies and loaves
		return (int) (cookieCount * 0 + loafCount * 2); //Replace this with the actual solution
	}

	public static int bagsOfChocolateChips(int cookieCount, int loafCount) {
		// Calculates bags of chocolate chips required for cookies and loaves
		return (int) Math.ceil(cookieCount * 1.25/36.0); //Replace this with the actual solution.
	}

	public static double totalCost(int cookieCount, int loafCount) {
		// Calculates total cost of cookies and loaves
		double totalCost = bagsOfFlour( cookieCount,  loafCount)* 2.60;
		totalCost = boxesOfBakingSoda( cookieCount, loafCount)* 0.98 + totalCost;
		totalCost = containersOfSalt( cookieCount,  loafCount)* 1.07 + totalCost;
		totalCost = bottlesOfVanilla( cookieCount,  loafCount)* 20.48 + totalCost;
		totalCost = cartonsOfEggs( cookieCount,  loafCount)* 2.21 + totalCost;
		totalCost = bagsOfSugar( cookieCount,  loafCount)* 4.53 + totalCost;
		totalCost = packagesOfButter( cookieCount,  loafCount)* 4.59 + totalCost;
		totalCost = bananas( cookieCount,  loafCount)* 0.3 + totalCost;
		totalCost = bagsOfChocolateChips( cookieCount,  loafCount)* 3.48 + totalCost;
		return totalCost;
	}
}
