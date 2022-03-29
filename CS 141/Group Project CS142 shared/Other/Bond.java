public class Bond extends Asset {
	
	private double fixedInterest;
	private double bondValue;
	private double maturityPeriod;
	private double dividend;
	private double marketValue;
	
	public Bond(String name, double initialPrice, double valueChange, double mortgageSim, double covidSim,
			double tenYear, double twentyYear, double fixedInterest, double bondValue, double maturityPeriod,
			double dividend, double marketValue)
	{
		super(name, initialPrice, valueChange, mortgageSim, covidSim, tenYear, twentyYear);
		fixedInterest = initialPrice;
		this.fixedInterest = fixedInterest;
		this.bondValue = bondValue;
		this.maturityPeriod = maturityPeriod;
		this.dividend = dividend;
		this.marketValue = marketValue;
		
	}

	//Getter for fixed Interest
	public double getFixedInterest() 
	{
		return fixedInterest;
	}
	
	//Getter for bondValue
	public double getBondValue() 
	{
		return bondValue;
	}
	
	//Getter for Maturity Period
	public double getMaturityPeriod() 
	{
		return maturityPeriod;
	}

	//Getter/Setter for Dividend
	public double getDividend() 
	{
		return dividend;
	}

	public void setDividend(double dividend) 
	{
		this.dividend = dividend;
	}
	
	//Getter/Setter for price
	public double getMarketValue() 
	{
		return marketValue;
	}

	public void setMarketValue(double marketValue) 
	{
		this.marketValue = marketValue;
	}


	//METHODS
	
	//Bond Value
	public double bondValueAtTime (double time)
	{
		return bondValue + time*(bondValue*fixedInterest);
	}
	
	//Bond payback
	public double totalYield()
	{
		return maturityPeriod*(bondValue*fixedInterest);
	}
	
	
}
