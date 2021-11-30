public class AssetCreator 
{
	//FIELDS
		//stocks
	private StockIndex[] stockIndexDeck = new StockIndex[6];
	private double stockIndexTotal;
		//bonds
	private Bond[] bondDeck = new Bond[2];
	private double bondTotal;
		//real estate
	private RealEstate[] realEstateDeck = new RealEstate[4];
	private double realEstateTotal;
		//bankAccount
	private double bankAccount;
	private double totalPurchaseValue;
		//Doge
	private boolean dogePurchased;

	//STOCK INDEX METHODS
	//Getter/Setter for entire stock Index Deck
	public StockIndex[] getStockIndexDeck() 
	{
		return stockIndexDeck;
	}
	
	public void setStockIndexDeck(StockIndex[] stockIndexDeck) 
	{
		this.stockIndexDeck = stockIndexDeck;
	}
	
	//Getter/Setter for individual items of the stock Index Deck
	public StockIndex getStockIndexInstance(int itemNum)
	{
		return stockIndexDeck[itemNum];
	}
	
	public void setStockIndexInstance(int itemNum, StockIndex stockItem)
	{
		stockIndexDeck[itemNum] = stockItem; 
	}
		
	//BOND METHODS
	//Getters/Setters for entire bond deck
	public Bond[] getBondDeck() 
	{
		return bondDeck;
	}

	public void setBondDeck(Bond[] bondDeck) 
	{
		this.bondDeck = bondDeck;
	}
	
	//Getter Setters for individual items of the bond index
	public Bond getBondInstance(int itemNum)
	{
		return bondDeck[itemNum];
	}
	
	public void setBondInstance(int itemNum, Bond bondItem)
	{
		bondDeck[itemNum] = bondItem; 
	}
	
	//REALESTATE METHODS
	//Getter/Setter for entire realestate bond deck
	public RealEstate[] getRealEstateDeck() 
	{
		return realEstateDeck;
	}

	public void setRealEstateDeck(RealEstate[] realEstateDeck) 
	{
		this.realEstateDeck = realEstateDeck;
	}
	
	//Getter/Setter for individual realestate assets
	public RealEstate getReaestateInstance(int itemNum)
	{
		return realEstateDeck[itemNum];
	}
	
	public void setBondInstance(int itemNum, RealEstate realEstateItem)
	{
		realEstateDeck[itemNum] = realEstateItem; 
	}

	//METHODS
	public void createAssets(double[] purchases, double[] fullPrices, boolean[] didPurchase, double startingBalance)
	{
		
	// 1 - 6 Creates all stock indexes
 		
		StockIndex sp500 = new StockIndex("S&P 500 GSPC", 4204.11, fullPrices[0], 0.55, -30.03, -32.96, 136, 272, purchases[0], 1.38, true, didPurchase[0], 0);
		StockIndex dowJones = new StockIndex("Dow Jones Industrial average DJI", 34529.45, fullPrices[1], 2.1, -19.16, -33.86, 150.3, 300.6, purchases[1], 2.24, true, didPurchase[1], 1);
		StockIndex nasDaq = new StockIndex("NASDAQ IXIC", 13748.74, fullPrices[2], 2.2, -24.08, -28.16, 118.05, 236.1, purchases[2], 1.17, false, didPurchase[2], 2);
		StockIndex amazon = new StockIndex("Amazon.com AMZN", 3223.07, fullPrices[3], 6.8, -21.73, -11.92, 1476.15, 2952.3, purchases[3], 0, false, didPurchase[3], 3);
		StockIndex boeingBA = new StockIndex("Boeing BA", 247.47, fullPrices[4], 1.8, -13.11, -71.22, 234.12, 468.25, purchases[4], 0, true, didPurchase[4], 4);
		StockIndex exxonMobil = new StockIndex("Exxon MobiL XOM", 58.37, fullPrices[5], 0.4, -10.76, -44.63, 28.27, 56.54, purchases[5], 5.94, true, didPurchase[5], 5);
	
		StockIndex[] tempStockIndexDeck = {sp500, dowJones, nasDaq, amazon, boeingBA, exxonMobil};
		
		for (int i = 0; i < stockIndexDeck.length; i++)
		{
			stockIndexDeck[i] = tempStockIndexDeck[i];
		}
		
		for (int i = 0; i<stockIndexDeck.length; i++)
		{
			stockIndexTotal += fullPrices[i];
		}
		
	//7 & 8 creates all bond indexes
		
		Bond vanguardBond = new Bond("Vanguard Intermediate Term Bond Index VICSX", 3000, fullPrices[6], 0.04, -11.47, -11.47, 18.03, 36.07, purchases[6], 2.6, true, didPurchase[6], 6);
		Bond delawareBond = new Bond("Delaware Extended Duration Bond Fund Class C DEECX", 3000, fullPrices[7], 0.02, -11.47, -19.45, 9.07, 18.15, purchases[7], 6.6, true, didPurchase[7], 7);
		
		Bond[] tempBondDeck = {vanguardBond, delawareBond};
		
		for (int i = 0; i < bondDeck.length; i++)
		{
			bondDeck[i] = tempBondDeck[i];
		}
		
		for (int i = 0; i<bondDeck.length; i++)
		{
			bondTotal += fullPrices[i+6];
		}
		
	//9 - 12 Creates all Real Estate
		
		RealEstate mediumHouse = new RealEstate("Medium Suburban House", 100000, fullPrices[8], 0.3, -16.0, 10, 38, 76, (int)purchases[8], true, didPurchase[8], 8);
		RealEstate largeHouse = new RealEstate("Large Suburban House", 250000, fullPrices[9], 0.3, -16.0, 10, 38, 76, (int)purchases[9], true, didPurchase[9], 9);
		RealEstate cityLand = new RealEstate("City Land Plot", 50000, fullPrices[10], 0.3, -16.0, 10, 38, 76, (int)purchases[10], true, didPurchase[10], 10);
		RealEstate ruralLand = new RealEstate("Rural Land Plot", 25000, fullPrices[11], 0.3, -16.0, 10, 38, 76, (int)purchases[11], true, didPurchase[11], 11);
		
		RealEstate[] tempRealEstateDeck = {mediumHouse, largeHouse, cityLand, ruralLand};
		
		for (int i = 0; i < realEstateDeck.length; i++)
		{
			realEstateDeck[i] = tempRealEstateDeck[i];
		}
		
		for (int i = 0; i < realEstateDeck.length; i++)
		{
			realEstateTotal += fullPrices[i+8];
		}
		
	//Dogecoin
		
		if(didPurchase[12])
		{
			dogePurchased = true;
		}
		
	//What's left (Bank Account)
		
		for(int i = 0; i < fullPrices.length; i++)
		{
			totalPurchaseValue += fullPrices[i];
		}
		
		bankAccount = startingBalance - totalPurchaseValue;

		
	}
	
	public void createPortfolio() //Creates the stock portfolio
	{
		String posNeg = "-"; //Negative or positive month
		
		double total = totalPurchaseValue + bankAccount;
		System.out.println("Portfolio Makeup:\nStocks: %" + (stockIndexTotal/total)*100 + " || Bonds: %" + (bondTotal/total)*100 + " || Real Estate: %" + (realEstateTotal/total)*100 + " || Bank Account: %" + (bankAccount/total)*100);
		System.out.println("");
		
		//EQUITIES
		System.out.println("STOCK INDEXES (total: $" + stockIndexTotal + ")");
		for (int i = 0; i < stockIndexDeck.length; i++)
		{
			if(stockIndexDeck[i].wasPurchased())
			{
				if(stockIndexDeck[i].isPositiveMonth())
				{
					posNeg = "+";
				}
				else
				{
					posNeg = "-";
				}
				
				System.out.print("Name: " + stockIndexDeck[i].getName() + ". || ");
				System.out.print("Market Value: $" + stockIndexDeck[i].getInitialPrice() + ". || ");
				System.out.print("Full Price: $" + stockIndexDeck[i].getFullPrice() + ". || ");
				System.out.print("Last Months Value Change: %" + posNeg + stockIndexDeck[i].getValueChange() + " ($" + stockIndexDeck[i].getMonthly() + "). || ");
				System.out.print("You currently own " + stockIndexDeck[i].getShares()+ " Shares. || ");
				System.out.print("Current Dividend Yield: %" + stockIndexDeck[i].getDividends() + " ($" + stockIndexDeck[i].getDividends() * stockIndexDeck[i].getFullPrice()  + "). || ");
				System.out.println("");
			}
		}
		
		//BONDS
		System.out.println("\nBOND INDEXES (total: $" + bondTotal + ")");
		for (int i = 0; i < bondDeck.length; i++)
		{
			if(bondDeck[i].wasPurchased())
			{
				if(bondDeck[i].isPositiveMonth())
				{
					posNeg = "+";
				}
				else
				{
					posNeg = "-";
				}
				
				System.out.print("Name: " + bondDeck[i].getName() + ". || ");
				System.out.print("Market Value: $" + bondDeck[i].getInitialPrice() + ". || ");
				System.out.print("Full Price: $" + bondDeck[i].getFullPrice() + ". || ");
				System.out.print("Last Months Value Change: %" + posNeg + bondDeck[i].getValueChange() + " ($" + bondDeck[i].getMonthly() + "). || ");
				System.out.print("You currently own " + bondDeck[i].getShares()+ " Bond Assets. || ");
				System.out.print("Current Dividend Yield: %" + bondDeck[i].getDividends() + " ($" + bondDeck[i].getDividends() * bondDeck[i].getFullPrice()  + "). || ");
				System.out.println("");
			}
		}
		
		//ESTATES
		System.out.println("\nREAL ESTATE (total: $" + realEstateTotal + ")");
		for (int i = 0; i < realEstateDeck.length; i++)
		{
			if(realEstateDeck[i].wasPurchased())
			{
				if(realEstateDeck[i].isPositiveMonth())
				{
					posNeg = "+";
				}
				else
				{
					posNeg = "-";
				}
				
				System.out.print("Name: " + realEstateDeck[i].getName() + ". || ");
				System.out.print("Market Value: $" + realEstateDeck[i].getInitialPrice() + ". || ");
				System.out.print("Full Price: $" + realEstateDeck[i].getFullPrice() + ". || ");
				System.out.print("Last Months Value Change: %" + posNeg + realEstateDeck[i].getValueChange() + " ($" + realEstateDeck[i].getMonthly() + "). || ");
				System.out.print("You currently own " + realEstateDeck[i].housesPurchased()+ " '" + realEstateDeck[i].getName() + "' class Estates. || ");
				System.out.println("");
			}
		}
		//DOGE
		if(dogePurchased) System.out.println("\nWow! All your Doge Coin have dissapeared! Such Mystery!");
		//Bank Account
		System.out.println("\nBANK ACCOUNT (total: $" + bankAccount +")");
		System.out.print("Name: Bank Account || ");
		System.out.print("Market Value: $" + bankAccount + ". || ");
		System.out.println("Full Price: $" + bankAccount + ". || ");
		
	}
	
	public int[] assetArrayListCreator() //Creates a list, and array, containing the assets YOU own
	{
		int chNum = 0;
		
		//Creates list, and array length
		//Stocks
		for (int i = 0; i < stockIndexDeck.length; i++)
		{
			if(stockIndexDeck[i].wasPurchased())
			{
				System.out.println("Enter " + (stockIndexDeck[i].getAllDeckNum() + 1) + " for " +  stockIndexDeck[i].getName() + ".");
				chNum++;
			}
		}
		
		//Bonds
		for (int i = 0; i < bondDeck.length; i++)
		{
			if(bondDeck[i].wasPurchased())
			{
				System.out.println("Enter " + (bondDeck[i].getAllDeckNum() + 1) + " for " +  bondDeck[i].getName() + ".");
				chNum++;
			}
		}
		
		//Realestate
		for (int i = 0; i < realEstateDeck.length; i++)
		{
			if(realEstateDeck[i].wasPurchased())
			{
				System.out.println("Enter " + (realEstateDeck[i].getAllDeckNum() + 1) + " for " +  realEstateDeck[i].getName() + ".");
				chNum++;
			}
		}
		
		int[] choices = new int[chNum];
		int j = 0;
	
		//Fills array
		//Stocks
		for (int i = 0; i < stockIndexDeck.length; i++)
		{
			if(stockIndexDeck[i].wasPurchased())
			{
				choices[j] = stockIndexDeck[i].getAllDeckNum();
				j++;
			}
		}
		
		//Bonds
		for (int i = 0; i < bondDeck.length; i++)
		{
			if(bondDeck[i].wasPurchased())
			{
				choices[j] = bondDeck[i].getAllDeckNum();
				j++;
			}
		}
		
		//Realestate
		for (int i = 0; i < realEstateDeck.length; i++)
		{
			if(realEstateDeck[i].wasPurchased())
			{
				choices[j] = realEstateDeck[i].getAllDeckNum();
				j++;
			}
		}
		
		return choices;
	}
	
	
}
