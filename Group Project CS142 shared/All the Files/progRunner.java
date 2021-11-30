//Project Created by Jared Howard, Malcolm Lanksbury, Dylan Stevenson, and Micheal Tran

import java.util.Scanner;
public class progRunner {

	public static void main(String[] args)
	{
		//Creates instances of the classes
		Scanner scan = new Scanner(System.in);
		PurchasingMenu purchasingMenu = new PurchasingMenu();
		AssetCreator assetCreator = new AssetCreator();
		Simulation simulator = new Simulation();
		
		//Runs the program in its entirety
		purchasingMenu.setInitialBalance(scan);;
		purchasingMenu.purchaseMenu();
		purchasingMenu.userInput(scan);
		System.out.println("\n Stock Portfolio: \n");
		assetCreator.createAssets(purchasingMenu.getPurchase(), purchasingMenu.getFullPrices(), purchasingMenu.getWasPurchased(), purchasingMenu.getInitialBalTotal());
		assetCreator.createPortfolio();
		simulator.userInput(scan, assetCreator);
		
	}
}
