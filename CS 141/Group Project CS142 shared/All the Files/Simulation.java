import java.util.Scanner;

public class Simulation {
	
	//Field
	int[] assetChoices; //holds an array of all the assets (through their AllList Tag)
	
	//Prompts for the choice menu
	public void simPrompt()
	{
		System.out.println("");
		System.out.println("Enter 1 for 10 year growth projections.");
		System.out.println("Enter 2 for 20 year growth projections.");
		System.out.println("Enter 3 for mortgage crisis simulator.");
		System.out.println("Enter 4 for covid crash simulator.");
		System.out.println("Enter 5 to end program.");
		System.out.println("");
	}
	
	//Gets all of the user input
	public void userInput (Scanner s, AssetCreator assetCrer)
	{
		int input = 0;
		int asset = 0;
		while(true)
		{
			input = 0;
			asset = 0;
			simPrompt();
			input = inputValidation(s, "\nEnter one of the options above.", 1, 5);
			System.out.println("");
			
			if (input == 1)
			{
				assetChoices = assetCrer.assetArrayListCreator();
				asset = assetValidation(s, "\nPlease choose an asset", assetChoices);
				System.out.println("");
				tenYear(asset, assetCrer.getStockIndexDeck(), assetCrer.getBondDeck(), assetCrer.getRealEstateDeck());
			}
			else if (input == 2)
			{
				assetChoices = assetCrer.assetArrayListCreator();
				asset = assetValidation(s, "\nPlease choose an asset", assetChoices);
				System.out.println("");
				twentyYear(asset, assetCrer.getStockIndexDeck(), assetCrer.getBondDeck(), assetCrer.getRealEstateDeck());
			}
			else if (input == 3)
			{
				assetChoices = assetCrer.assetArrayListCreator();
				asset = assetValidation(s, "\nPlease choose an asset", assetChoices);
				System.out.println("");
				mortgageSim(asset, assetCrer.getStockIndexDeck(), assetCrer.getBondDeck(), assetCrer.getRealEstateDeck());
			}
			else if (input == 4)
			{
				assetChoices = assetCrer.assetArrayListCreator();
				asset = assetValidation(s, "\nPlease choose an asset", assetChoices);
				System.out.println("");
				covidCrashSim(asset, assetCrer.getStockIndexDeck(), assetCrer.getBondDeck(), assetCrer.getRealEstateDeck());
				
			}
			else
			{
				System.out.println("");
				System.out.println("Thank you for using the CS142 Group Investment Portfolio Project. \n Goodbye.");
				return;
			}
			s.nextLine();
		}
		
	}
	
	//Validates that users inputs one of the simulator choices
	public int inputValidation(Scanner s, String prompt, int minVal, int maxVal)
	{
		int tempInput;
		while(true)
		{
			System.out.println(prompt);
			System.out.print("Please enter a value: ");
			if(s.hasNextInt())
			{
				tempInput = s.nextInt();
				if(tempInput >= minVal && tempInput <= maxVal)
				{
					return tempInput;
				}
				else
				{
					System.out.println("Please enter a number between " + minVal + " and " + maxVal + ".\n");
					s.nextLine();
				}
			}
			else
			{
				System.out.println("Please enter an integer value.\n");
				s.nextLine();
			}
		}
	}
	
	//Validates that user inputs an asset they own
	public int assetValidation(Scanner s, String prompt, int[] choices)
	{
		int tempInput;
		while(true)
		{
			System.out.println(prompt);
			System.out.print("Please enter a value: ");
			if(s.hasNextInt())
			{
				tempInput = s.nextInt();
				for (int i = 0; i < choices.length; i++)
				{
					if (choices[i] == tempInput-1) return tempInput-1;
				}	
				System.out.println("Input does not match an Asset you own.\n");
				s.nextLine();
			}
			else
			{
				System.out.println("Please enter an integer value.\n");
				s.nextLine();
			}
		}
	}
	
	//Ten Year Simulator
	public void tenYear(int asset, StockIndex[] stockDeck, Bond[] bondDeck, RealEstate[] realEstateDeck)
	{
		if(asset >= 0 && asset <= 5) //Stock Indexes
		{
			double tenYear = stockDeck[asset].tenYearSim();
			System.out.println("Based on the your " + stockDeck[asset].getShares() + " share(s), currently valued at $" + stockDeck[asset].getFullPrice() + ",\n"
					+ " your Stock Asset(s) from the " + stockDeck[asset].getName() + " will be worth $" + tenYear + " in 10 years.");
			System.out.println("");
		}
		else if(asset >= 6 && asset <= 7) //Bonds
		{
			asset -= 5;
			double tenYear = bondDeck[asset].tenYearSim();
			System.out.println("Based on the your " + bondDeck[asset].getShares() + " bond(s), currently valued at $" + bondDeck[asset].getFullPrice() + ",\n"
					+ " your Bond Asset(s) from the " + bondDeck[asset].getName() + " will be worth $" + tenYear + " in 10 years.");
			System.out.println("");
		}
		else if(asset >= 8 && asset <= 11) //Real estate
		{
			asset -= 8;
			double tenYear = realEstateDeck[asset].tenYearSim();
			System.out.println("Based on the your " + realEstateDeck[asset].housesPurchased() + "Estates, currently valued at $" + realEstateDeck[asset].getFullPrice() + ",\n"
					+ " your Estates in the field of, " + realEstateDeck[asset].getName() + " will be worth $" + tenYear + " in 10 years.");
			System.out.println("");
		}
	}
	
	//Twenty Year Simulator
	public void twentyYear(int asset, StockIndex[] stockDeck, Bond[] bondDeck, RealEstate[] realEstateDeck)
	{
		if(asset >= 0 && asset <= 5) //Stock Indexes
		{
			double twentyYear = stockDeck[asset].twentyYearSim();
			System.out.println("Based on the your " + stockDeck[asset].getShares() + " shares, currently valued at $" + stockDeck[asset].getFullPrice() + ",\n"
					+ " your Stock Assets from " + stockDeck[asset].getName() + " will be worth $" + twentyYear + " in 20 years.");
			System.out.println("");
		}
		else if(asset >= 6 && asset <= 7) //Bonds
		{
			asset -= 5;
			double twentyYear = bondDeck[asset].twentyYearSim();
			System.out.println("Based on the your " + bondDeck[asset].getShares() + " bonds, currently valued at $" + bondDeck[asset].getFullPrice() + ",\n"
					+ " your Bond Assets from the " + bondDeck[asset].getName() + " will be worth $" + twentyYear + " in 20 years.");
			System.out.println("");
		}
		else if(asset >= 8 && asset <= 11) //Real estate
		{
			asset -= 8;
			double twentyYear = realEstateDeck[asset].twentyYearSim();
			System.out.println("Based on the your " + realEstateDeck[asset].housesPurchased() + "Estates, currently valued at $" + realEstateDeck[asset].getFullPrice() + ",\n"
					+ "your Estates in the field of, " + realEstateDeck[asset].getName() + " will be worth $" + twentyYear + " in 20 years.");
			System.out.println("");
		}
	}
	
	//Mortgage Crisis Simulator
	public void mortgageSim(int asset, StockIndex[] stockDeck, Bond[] bondDeck, RealEstate[] realEstateDeck)
	{
		if(asset >= 0 && asset <= 5) //Stock Indexes
		{
			double mortgageLoss = stockDeck[asset].mortgageSim();
			System.out.println("Based on record market losses resulting from the burst of the U.S. housing bubble and plummeting "
					+ "value of MBS between September 26th and October 27th 2008, your Stock Asset(s) in the " + stockDeck[asset].getName() + " would fall from $" + stockDeck[asset].getFullPrice() + ", to $" + mortgageLoss + "a %" + stockDeck[asset].getMortgageSim() + " loss.");
			System.out.println("");
		}
		else if(asset >= 6 && asset <= 7) //Bonds
		{
			asset -= 5;
			double mortgageLoss = bondDeck[asset].mortgageSim();
			System.out.println("Based on record market losses resulting from the burst of the U.S. housing bubble and plummeting "
					+ "value of MBS between September 26th and October 27th 2008, your Stock Asset(s) in the " + bondDeck[asset].getName() + " would fall from $" + bondDeck[asset].getFullPrice() + ", to $" + mortgageLoss + "a %" + bondDeck[asset].getMortgageSim() + " loss.");
			System.out.println("");
		}
		else if(asset >= 8 && asset <= 11) //Real estate
		{
			asset -= 8;
			double mortgageLoss = realEstateDeck[asset].mortgageSim();
			System.out.println("Based on record market losses resulting from the burst of the U.S. housing bubble and plummeting "
					+ "value of MBS between September 26th and October 27th 2008, your Stock Asset(s) in the " + realEstateDeck[asset].getName() + " would fall from $" + realEstateDeck[asset].getFullPrice() + ", to $" + mortgageLoss + "a %" + realEstateDeck[asset].getMortgageSim() + " loss.");
			System.out.println("");
		}
	}
	
	//Covid Crash Simulator
	public void covidCrashSim(int asset, StockIndex[] stockDeck, Bond[] bondDeck, RealEstate[] realEstateDeck)
	{
		if(asset >= 0 && asset <= 5) //Stock Indexes
		{
			double covidLoss = stockDeck[asset].covidSim();
			System.out.println("“Based on record market losses resulting from COVID19 between February 21st and march 23rd 2020,\n" + 
					"your Stock Asset(s) in the " + stockDeck[asset].getName() + " would fall from $" + stockDeck[asset].getFullPrice() + ", to $" + covidLoss + "a %" + stockDeck[asset].getCovidSim() + " loss.");
			System.out.println("");
		}
		else if(asset >= 6 && asset <= 7) //Bonds
		{
			asset -= 5;
			double covidLoss = bondDeck[asset].covidSim();
			System.out.println("“Based on record market losses resulting from COVID19 between February 21st and march 23rd 2020,\n" + 
					"your Bond Asset(s) in the " + bondDeck[asset].getName() + " would fall from $" + bondDeck[asset].getFullPrice() + ", to $" + covidLoss + "a %" + bondDeck[asset].getCovidSim() + " loss.");
			System.out.println("");
		}
		else if(asset >= 8 && asset <= 11) //Real estate
		{
			asset -= 8;
			double covidLoss = realEstateDeck[asset].covidSim();
			System.out.println("“Based on record market losses resulting from COVID19 between February 21st and march 23rd 2020,\n" + 
					"your Estate(s) in the field of '" + realEstateDeck[asset].getName() + "' would increase from $" + realEstateDeck[asset].getFullPrice() + ", to $" + covidLoss + "a %" + realEstateDeck[asset].getCovidSim() + " gain.");
			System.out.println("");
		}
	}
	
}
