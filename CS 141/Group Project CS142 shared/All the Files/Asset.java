//Deck Nums
// 0-5 Stock Index
// 6-7 Bonds
// 8-11 RealEstate


public class Asset 
{
	//Fields
	private String name;
	private double initialPrice; //Price one instance is sold at
	private double fullPrice; //Full price of the users combined shares/instances
	private double valueChange; //Change of last months value
	private double mortgageSim; //increase/decrease for the mortgage crisis simulator
	private double covidSim; //increase/decrease for the Covid crisis simulator
	private double tenYear; //increase/decrease in the following ten years
	private double twentyYear; //increase/decrease for in the following twenty years
	private boolean wasPurchased; //Checks to see if the user purchased this item
	private int allDeckNum; //Their position in the combined "deck", or list of all items (1-13). The all deck is the same as their positions in the purchasing menu (-1 because of array logic)

	
	
	//Constructor
	public Asset(String name, double initialPrice, double fullPrice, double valueChange, double mortgageSim, double covidSim,
			double tenYear, double twentyYear, boolean wasPurchased, int allDeckNum)
	{
		this.name = name;
		this.initialPrice = initialPrice;
		this.fullPrice = fullPrice;
		this.valueChange = valueChange;
		this.mortgageSim = mortgageSim;
		this.covidSim = covidSim;
		this.tenYear = tenYear;
		this.twentyYear = twentyYear;
		this.wasPurchased = wasPurchased;
		this.allDeckNum = allDeckNum;
	}

	//Getters/Setters for deck position.
	public int getAllDeckNum() 
	{
		return allDeckNum;
	}

	public void setAllDeckNum(int allDeckNum) 
	{
		this.allDeckNum = allDeckNum;
	}

	//Getter/Setter for if it was purchased
	public boolean wasPurchased() 
	{
		return wasPurchased;
	}

	public void setWasPurchased(boolean wasPurchased) 
	{
		this.wasPurchased = wasPurchased;
	}

	//Getter for name
	public String getName() 
	{
		return name;
	}

	//Getter/Setter for initialPrice
	public double getInitialPrice() 
	{
		return initialPrice;
	}
	
	public void setInitialPrice(double initialPrice) 
	{
		this.initialPrice = initialPrice;
	}

	//Getter/Setter for valueChange
	public double getValueChange() 
	{
		return valueChange;
	}

	public void setValueChange(double valueChange) 
	{
		this.valueChange = valueChange;
	}

	//Getter/Setter for mortgageSim
	public double getMortgageSim() 
	{
		return mortgageSim;
	}

	public void setMortgageSim(double mortgageSim) 
	{
		this.mortgageSim = mortgageSim;
	}

	//Getter/Setter for covidSim
	public double getCovidSim() 
	{
		return covidSim;
	}

	public void setCovidSim(double covidSim) 
	{
		this.covidSim = covidSim;
	}

	//Getter/Setter for ten year simulator
	public double getTenYear() 
	{
		return tenYear;
	}

	public void setTenYear(double tenYear) 
	{
		this.tenYear = tenYear;
	}

	//Getter/Setter for twenty year simulator
	public double getTwentyYear() 
	{
		return twentyYear;
	}

	public void setTwentyYear(double twentyYear)
	{
		this.twentyYear = twentyYear;
	}
	
	//Getter for Full price
	public double getFullPrice() {
		return fullPrice;
	}
	
	//Simulations;
	
	public double getMonthly()
	{
			return fullPrice*(valueChange/100);
	}

	public double mortgageSim()
	{
		return fullPrice + (fullPrice * (mortgageSim/100));
	}
	
	public double covidSim()
	{
		return fullPrice + (fullPrice * (covidSim/100));
	}
	
	public double tenYearSim()
	{
		return fullPrice + (fullPrice * (tenYear/100));
	}
	
	public double twentyYearSim()
	{
		return fullPrice + (fullPrice * (twentyYear/100));
	}
	
	
}
