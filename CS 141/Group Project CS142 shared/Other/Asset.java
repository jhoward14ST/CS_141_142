
public class Asset 
{
	//Fields
	private String name;
	private double initialPrice;
	private double valueChange;
	private double mortgageSim;
	private double covidSim;
	private double tenYear;
	private double twentyYear;

	
	
	//Constructor
	public Asset(String name, double initialPrice, double valueChange, double mortgageSim, double covidSim,
			double tenYear, double twentyYear)
	{
		this.name = name;
		this.initialPrice = initialPrice;
		this.valueChange = valueChange;
		this.mortgageSim = mortgageSim;
		this.covidSim = covidSim;
		this.tenYear = tenYear;
		this.twentyYear = twentyYear;
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
	
	
}
