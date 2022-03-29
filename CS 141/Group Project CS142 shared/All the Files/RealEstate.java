
public class RealEstate extends Asset{
	
	//Fields
	private int housesPurchased;
	private boolean positiveMonth;

	public RealEstate(String name, double initialPrice, double fullPrice, double valueChange, double mortgageSim, 
			double covidSim, double tenYear, double twentyYear, int housesPurchased, boolean positiveMonth, boolean wasPurchased, int allDeckNum)
	{
		super(name, initialPrice, fullPrice, valueChange, mortgageSim, covidSim, tenYear, twentyYear, wasPurchased, allDeckNum);
		this.housesPurchased = housesPurchased;
		this.positiveMonth = positiveMonth;
	}

	//Getter/Setter for housesPurchased
	public int housesPurchased() 
	{
		return housesPurchased;
	}

	public void setHousesPurchased(int housesPurchased) 
	{
		this.housesPurchased = housesPurchased;
	}

	//Getter/Setter for positive month
	public boolean isPositiveMonth() 
	{
		return positiveMonth;
	}

	public void setPositiveMonth(boolean positiveMonth) 
	{
		this.positiveMonth = positiveMonth;
	}
	
	
}
