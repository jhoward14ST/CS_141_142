public class Bond extends Asset {
	
	//Fields
	private double shares;
	private double dividends;
	private boolean positiveMonth;
	
	//Constructor
	public Bond(String name, double initialPrice, double fullPrice, double valueChange, double mortgageSim,
			double covidSim, double tenYear, double twentyYear, double shares, double dividends,
			boolean positiveMonth, boolean wasPurchased, int allDeckNum)
	{
		super(name, initialPrice, fullPrice, valueChange, mortgageSim, covidSim, tenYear, twentyYear, wasPurchased, allDeckNum);
		this.shares = shares;
		this.dividends = dividends;
		this.positiveMonth = positiveMonth;
	}

	//Getter/Setter for Shares
	public double getShares() 
	{
		return shares;
	}

	public void setShares(double shares) 
	{
		this.shares = shares;
	}

	//Getter/Setter for Dividends
	public double getDividends() 
	{
		return dividends;
	}

	public void setDividends(double dividends) 
	{
		this.dividends = dividends;
	}

	//Getter/Setter for Positive Month boolean
	public boolean isPositiveMonth() 
	{
		return positiveMonth;
	}

	public void setPositiveMonth(boolean positiveMonth) 
	{
		this.positiveMonth = positiveMonth;
	}
}
