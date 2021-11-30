
public class RealEstate extends Asset{
	
	//Fields
	private String address;
	private String province;
	private String country;
	private boolean positiveMonth;

	public RealEstate(String name, double initialPrice, double valueChange, double mortgageSim, 
			double covidSim, double tenYear, double twentyYear, String address,String province,
			String country, boolean positiveMonth)
	{
		super(name, initialPrice, valueChange, mortgageSim, covidSim, tenYear, twentyYear);
		this.address = address;
		this.province = province;
		this.country = country;
		this.positiveMonth = positiveMonth;
	}

	//Getter/Setter for Address
	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	//Getter/Setter for Province
	public String getProvince() 
	{
		return province;
	}

	public void setProvince(String province) 
	{
		this.province = province;
	}

	//Getter/Setter for Country
	public String getCountry() 
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
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
