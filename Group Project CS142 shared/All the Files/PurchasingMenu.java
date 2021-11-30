import java.util.Scanner;
public class PurchasingMenu {
	
	private double totalBal = 0;
	private double initialBalTotal = 0;
	private boolean[] wasPurchased = new boolean[13]; //tells if the item was purchased
	private double[] purchase = new double[13]; //Number of purchases for each item
	private double[] fullPrices = new double[13]; //Full Prices of items
	private double[] prices = {4204.11, 34529.45, 13748.74, 3223.07, 247.47, 58.37, 3000, 3000, 100000, 250000, 25000, 50000, 420.69};
	

	//Balance Setters/Getters
	public double getTotalBal() 
	{
		return totalBal;
	}
	
	public double getInitialBalTotal()
	{
		return initialBalTotal;
	}

	public void setTotalBal(double totalBal) 
	{
		this.totalBal = totalBal;
	}

	//Was Purchased Array getter
	public boolean[] getWasPurchased() 
	{
		return wasPurchased;
	}

	//Purchase array getter
	public double[] getPurchase() 
	{
		return purchase;
	}

	//Full price array getter
	public double[] getFullPrices() 
	{
		return fullPrices;
	}

	//prices array getter
	public double[] getPrices() 
	{
		return prices;
	}

	//Methods
	
	public void setInitialBalance(Scanner s) //Sets the initial balance of your bank account
	{
		double tempVal;
		System.out.println("How much does your account currently hold? (Maximum of $999,999,999.99)");
		while(true)
		{
			System.out.print("\nCurrent Balance: ");
			if(s.hasNextDouble())
			{
				tempVal = s.nextDouble();
				if (tempVal >= 5 && tempVal <= 999_999_999.99)
				{
					totalBal = tempVal;
					initialBalTotal = totalBal;
					return;
				}
				else
				{
					System.out.println("Please input a numeric value between $5 and $999,999,999.99");
					tempVal = 0;
				}
				
			}
			else
			{
				System.out.println("Please input a numeric value.");
			}
			s.nextLine();
		}
	}
	
	public void purchaseMenu() //All of the prompts that make up the purchase menu
	{
		System.out.println("Your account holds an initial balance of $" + totalBal);
		System.out.println("You may input the corresponding values below to make purchases of Stocks, bonds, and RealEstate.\n");
		System.out.println("EQUITIES:");
		System.out.println("Enter 1 for S&P 500 GSPC - Price: $4204.11");
		System.out.println("Enter 2 for DJI Dow Jones Industrial average - Price: $34,529.45");
		System.out.println("Enter 3 for NASDAQ IXIC - Price: $13,748.74");
		System.out.println("Enter 4 for Amazon.com AMZN - Price: $3,223.07");
		System.out.println("Enter 5 for Boeing BA - Price: $247.47");
		System.out.println("Enter 6 for Exxon MobiL XOM - Price: $58.37");
		System.out.println("");
		System.out.println("BONDS AND PROPERTY:");
		System.out.println("Enter 7 for Vanguard Intermediate Term Bond Index VICSX - Price: $3,000");
		System.out.println("Enter 8 for Delaware Extended Duration Bond Fund Class C DEECX - Price: $3,000");
		System.out.println("Enter 9 for Medium suburban house - Price $100,000");
		System.out.println("Enter 10 for Large suburban house - Price $250,000");
		System.out.println("Enter 11 for Rural Land Plot - Price $25,000");
		System.out.println("Enter 12 for City Land Plot - Price $50,000");
		System.out.println("Enter 13 for DOGE - Price $420.69");
		System.out.println("Enter 14 for previous purchases.");
		System.out.println("Enter 15 to exit purchase menu, and load Portfolio (You will not be able to return to the Purchase Menu later).");
	}
	
	public boolean purchaseChecker(String prompt, int item, Scanner s, boolean housePurchases) //Gets user input and checks if your purchases are valid
	{
		double purchaseNum;
		double fullPrice;
		if(!housePurchases) //Houses have to be purchased at integer values, bonds and stocks do not
		{
			while(true)
			{
				System.out.println(prompt);
				System.out.print("\n Exit(0) or Purchase: ");
				if(s.hasNextDouble())
				{
					purchaseNum = s.nextDouble();
					
					if(purchaseNum >= 0)
					{
						fullPrice = purchaseNum * prices[item-1];
						
						if(fullPrice <= totalBal ) //Makes the purchase
						{
							purchase[item-1] += purchaseNum;
							fullPrices[item-1] += fullPrice;
							wasPurchased[item-1] = true;
							totalBal -= fullPrice;
							System.out.println(purchaseNum + " purchases of item " + item + "\nCost was: $" + fullPrice + ", Remaining balance: $" + totalBal);
							return true;
						}
						else
						{
							fullPrice = 0;
							purchaseNum = 0;
							System.out.println("Price exceeds your remaining balance (" + totalBal + ")");
							s.nextLine();
						}
					}
					else
					{
						purchaseNum = 0;
						System.out.println("Input must be zero or greater");
						s.nextLine();
					}
				}
				else
				{
					System.out.println("Please input a valid selection (Decimals Accepted).");
					s.nextLine();
				}
			}
		}
		else //Houses have to be purchased at integer values, bonds and stocks do not
		{ 
			while(true)
			{
				System.out.println(prompt);
				System.out.print("\n Exit(0) or Purchase: ");
				if(s.hasNextInt())
				{
					purchaseNum = s.nextInt();
					
					if(purchaseNum >= 0)
					{
						fullPrice = (double)purchaseNum * prices[item-1];
						
						if(fullPrice <= totalBal) //Makes the purchase
						{
							purchase[item-1] += (double)purchaseNum;
							fullPrices[item-1] += fullPrice;
							wasPurchased[item-1] = true;
							totalBal -= fullPrice;
							System.out.println(purchaseNum + " purchases of item " + item + "\nCost was: $" + fullPrice + ", Remaining balance: $" + totalBal);
							return true;
						}
						else
						{
							fullPrice = 0;
							purchaseNum = 0;
							System.out.println("Price exceeds your remaining balance (" + totalBal + ")");
							s.nextLine();
						}	
					}
					else
					{
						purchaseNum = 0;
						System.out.println("Input must be zero or greater");
						s.nextLine();
					}
					
				}
				else
				{
					System.out.println("Please input a valid selection (whole numbers only).");
					s.nextLine();
				}
			}
		}
		
	}
	
	public void purchaser(int itemNum, Scanner s) //holds dialogue, and uses the checker method to confirm purchases.
	{
		if(itemNum <= 6) //stocks
		{
			s.nextLine();
			purchaseChecker("How many stock index shares would you like to purchase?", itemNum, s, false);
			
		}
		else if(itemNum >= 7 && itemNum <= 8) //bonds
		{
			s.nextLine();
			purchaseChecker("How many bond index shares would you like to purchase?", itemNum, s, false);
			
		}
		else if(itemNum >= 9 && itemNum <= 12) //real estate
		{
			s.nextLine();
			purchaseChecker("How many would you like to purchase?", itemNum, s, true);
			
		}
		else if(itemNum == 13) //Doge coin
		{
			s.nextLine();
			purchaseChecker("Wow, buy much doge coin!", itemNum, s, false);
		}
		else if(itemNum == 14) //for checking previous purchases
		{
			s.nextLine();
			System.out.print("Please select an asset (1 - 13) to see previous purchases on: ");
			if(s.hasNextInt())
			{
				itemNum = s.nextInt();
				if(itemNum > 0 && itemNum < 14)
				{
					System.out.println("You have made " + purchase[itemNum-1] + " purchases of item " + itemNum + "\nTotal cost was: $" + fullPrices[itemNum-1]);
				}
				else
				{
					System.out.println("Invalid Selection. Please choose an Asset between 1 and 13");
					itemNum = 0;
					s.nextLine();
				}
			}
			else
			{
				System.out.println("Invalid Selection. Please input integer values only");
				s.nextLine();
			}
		}	
		else
		{
			System.out.println("ERROR: INVALID VALUE ENTERED!");
		}
	}
	
	//Gathers User Input (use in main method for the purchase menu)
	public void userInput(Scanner s)
	{
		int itemNum = 0;
		boolean endProg = false;
		
		while(!endProg)
		{
			System.out.print("\nPlease make a selection: ");
			if(s.hasNextInt())
			{
				itemNum = s.nextInt();
				if(itemNum <= 14 && itemNum >= 1)
				{
					purchaser(itemNum, s);
				}
				else if(itemNum == 15)
				{
					{
						System.out.println("thank you for your purchases.\nLoading portfolio now...");
						endProg = true;
					}
				}
				else
				{
					itemNum = 0;
					System.out.println("Please input a valid selection.");
					s.nextLine();
				}
			}
			else
			{
				System.out.println("Please input an integer value.");
				s.nextLine();
			}
		}
	}
}
