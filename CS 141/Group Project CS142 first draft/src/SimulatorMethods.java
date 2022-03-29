
public class SimulatorMethods {
	public static void main(String[] args) {
		//Based on those inputs divSim should output 628.89
		System.out.println(divSim(100, 10, 5, 10));
		divSimOutput("Stock", 100, 10, 5, 10);
		//Based on those inputs tenYearsSim should output 3000
		System.out.println(tenYearsSim(100, 10, 200));
		tenYearSimOutput("Stock", 100, 10, 200);
		//Based on those inputs twentyYearsSim should output 5000
		System.out.println(twentyYearsSim(100, 10, 400));
		twentyYearSimOutput("Stock", 100, 10, 400);
		//Based on those inputs mortgageCrisisSim should output 750
		System.out.println(mortgageCrisisSim(100, 10, 25));
		mortgageCrisisCrash("Stock", 100, 10, 25);
		//Based on those inputs covidLossSim should output 650
		System.out.println(covidLossSim(100, 10, 35));
		covidCrash("Stock", 100, 10, 35);
	}
	//I have a sample of a new field here to show where I'm getting all the variables for the methods
	//public StockIndex(String name, double initialPrice, double valueChange, double mortgageSim,
	//		double covidSim, double tenYear, double twentyYear, double shares, double dividends,
	//		boolean positiveMonth)
	
//DIVIDEND SIMULATOR
	//Calculates the numbers
	public static double divSim(double initialPrice, double shares, double dividends, double years) {
		double principal = initialPrice * shares;
		double multiplier = 1 + dividends / 100;
		double totalValue = principal * (Math.pow(multiplier, years));
		double dividendsEarned = totalValue - principal;
		return dividendsEarned;
	}
	//A method to print out a message with all the numbers (laid out without the objects linked in)
	public static void divSimOutput(String name, double initialPrice, double shares, double dividends, double years) {
	//does things to fill in the variables
		System.out.println("Based on dividend yields of " + dividends + "% and a value of $" + 
	(initialPrice * shares)+ " as of April 30th, 2021, your holding " + name + " would earn $" + divSim(initialPrice, shares, dividends, years) + 
	"after " + years + " years");
	}
	
//TEN YEAR GROWTH SIMULATOR
	//Calculates the numbers
	public static double tenYearsSim(double initialPrice, double shares, double tenYear) {
		double valueInTen = (initialPrice * shares) * (1 + tenYear / 100);
		return valueInTen;
	}
	//A method to print out a message with all the numbers (laid out without the objects linked in)
	public static void tenYearSimOutput(String name, double initialPrice, double shares, double tenYear) {
		//does things to fill in the variables (some getters?)
		System.out.println("Based on annual average return over the past ten years of " + (tenYear / 10) + 
				"%, between 2021 and 2031, " + name + " will have gained " + tenYear + "% or $" +
				(tenYearsSim(initialPrice, shares, tenYear) - (initialPrice * shares)) + 
				" in value for a total value of $" + tenYearsSim(initialPrice, shares, tenYear));
	}
	
//TWENTY YEAR GROWTH SIMULATOR
	//Calculates the numbers
	public static double twentyYearsSim(double initialPrice, double shares, double twentyYear) {
		double valueInTwenty = (initialPrice * shares) * (1 + twentyYear / 100);
		return valueInTwenty;
	}
	//A method to print out a message with all the numbers (laid out without the objects linked in)
	public static void twentyYearSimOutput(String name, double initialPrice, double shares, double twentyYear) {
		//does things to fill in the variables (some getters?)
		System.out.println("Based on annual average return over the past ten years of " + (twentyYear / 10) + 
				"%, between 2021 and 2031, " + name + " will have gained " + twentyYear + "% or $" +
				(twentyYearsSim(initialPrice, shares, twentyYear) - (initialPrice * shares)) + 
				" in value for a total value of $" + twentyYearsSim(initialPrice, shares, twentyYear));
	}

//MORTGAGE CRISIS SIMULATOR
	//Calculates the numbers
	public static double mortgageCrisisSim(double initialPrice, double shares, double mortgageSim) {
		double mortgageCrisisLoss = (initialPrice * shares) * ((100 - mortgageSim) / 100);
		return mortgageCrisisLoss;
	}
	//A method to print out a message with all the numbers (laid out without the objects linked in)
	public static void mortgageCrisisCrash(String name, double initialPrice, double shares, double mortgageSim) {
		//does things to fill in the variables (some getters?)
		System.out.println("Based on record market losses resulting from the burst of the U.S. housing bubble and plummeting value of MBS between September 26th and October 27th 2008, "
		+ name + "would have lost " + mortgageSim + "% or $" + (mortgageCrisisSim(initialPrice, shares, mortgageSim) - (initialPrice * shares)) +
		" in value for a remaining value of $" + (mortgageCrisisSim(initialPrice, shares, mortgageSim)));
	}
//MORTGAGE CRISIS SIMULATOR
	//Calculates the numbers
	public static double covidLossSim(double initialPrice, double shares, double covidSim) {
		double covidLoss = (initialPrice * shares) * ((100 - covidSim) / 100);
		return covidLoss;
	}
	//A method to print out a message with all the numbers (laid out without the objects linked in)
	public static void covidCrash(String name, double initialPrice, double shares, double covidSim) {
		//does things to fill in the variables (some getters?)
		System.out.println("Based on record market losses resulting from COVID19 between February 21st and March 23rd 2020, "
				+ name + "would have lost " + covidSim + "% or $" + (covidLossSim(initialPrice, shares, covidSim) - (initialPrice * shares)) +
				"in value for a remaining value of $" + (covidLossSim(initialPrice, shares, covidSim)));
	}
}
