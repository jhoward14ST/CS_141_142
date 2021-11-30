
public class BankAccount extends Asset {
	//Fields
	private double balance;
	
	public BankAccount(String name, double initialPrice, double valueChange, double mortgageSim, double covidSim,
			double tenYear, double twentyYear)
	{
		super(name, initialPrice, valueChange, mortgageSim, covidSim, tenYear, twentyYear);
		balance = initialPrice;
	}
	
	//Getter for balance
	public double getBalance()
	{
		return balance;
	}
	
	//Withdrawal & Deposit
	public double deposit (double amountDeposited)
	{
		balance += amountDeposited;
		return amountDeposited;
	}
	
	public double withdrawal(double amountWithdrawn)
	{
		balance -= amountWithdrawn;
		return amountWithdrawn;
	}
}
