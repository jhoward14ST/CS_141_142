public class AssetCreator extends StockIndex {
	//STOCK INDEX creators
	//S&P 500 -
	StockIndex GSPC = new StockIndex("S&P 500 GSPC", 4204.11, 0.55, 30.02, 32.96, 136, 272, double shares, 1.38, true);
	//DJI -
	StockIndex DJI = new StockIndex("Dow Jones Industrial average DJI", 34529.45, 2.1, 19.16, 33.86, 150.3, 300.6, double shares, 2.24, true);
	//IXIC -
	StockIndex IXIC = new StockIndex("NASDAQ IXIC", 13748.74, 2.2, 24.08, 28.16, 118.05, 236.1, double shares, 1.17, false);
	//AMZN -
	StockIndex AMZN = new StockIndex("Amazon.com AMZN", 3223.07, 6.8, 21.73, 11.92, 1476.15, 2952.3, double shares, 0, false);
	//BA -
	StockIndex BA = new StockIndex("Boeing BA", 247.47, 1.8, 13.11, 71.22, 234.12, 468.25, double shares, 0, true);
	//XOM -
	StockIndex XOM = new StockIndex("Exxon MobiL XOM", 58.37, 0.4, 10.76, 44.63, 28.27, 56.54, double shares, 5.94, true);
	//VICSX -
	StockIndex VICSX = new StockIndex("Vanguard Intermediate Term Bond Index VICSX", 3000, 0.04, 11.47, 11.47, 18.03, 36.07, double shares, 2.6, true);
	//DEECX -
	StockIndex DEECX = new StockIndex("Delaware Extended Duration Bond Fund Class C DEECX", 3000, 0.02, 11.47, 19.45, 9.07, 18.15, double shares, 6.6, true);
	//DOGE -
	StockIndex DOGE = new StockIndex("DOGE", 420.69, 10, 98, 99, 420, 840, double shares, 6.9, true);
	}	
	//REAL ESTATE
	public RealEstate(String name, double initialPrice, double valueChange, double mortgageSim, 
			double covidSim, double tenYear, double twentyYear, String address,String province,
			String country, boolean positiveMonth) {
		//Medium Suburban house -
		RealEstate MediumHouse = new RealEstate("Medium Suburban house", 100000, 0.3, -16.0, 10, 38, 76, "456 T Street", "Stockville", "Stocklandia", true);
		//Large Suburban house -
		RealEstate LargeHouse = new RealEstate("Large Suburban house", 250000, 0.3, -16.0, 10, 38, 76, "789 T Street", "Stocktopia", "Stocklandia", true);
		//Plot of land outside the city -
		RealEstate CityLand = new RealEstate("Plot of land outside the city", 25000, 0.3, -16, 10, 38, 76, "147 P Street", "Stockville", "Stocklandia", true);
		//Plot of land inside the city -
		RealEstate RuralLand = new RealEstate("Plot of land inside the city", 50000, 0.3, -16, 10, 38, 76, "258 P Street", "Stocktopia", "Stocklandia", true);
	}

	//Bond
		public Bond(String name, double initialPrice, double valueChange, double mortgageSim, double covidSim,
				double tenYear, double twentyYear, double fixedInterest, double bondValue, double maturityPeriod,
				double dividend, double marketValue) {
			
		}

		
	//Bank Account
		public BankAccount(String name, double initialPrice, double valueChange, double mortgageSim, double covidSim,
				double tenYear, double twentyYear) {
			
		}
}
