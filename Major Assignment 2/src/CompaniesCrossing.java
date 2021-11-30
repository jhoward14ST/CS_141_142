
public class CompaniesCrossing {
	
	public static boolean isMoveOkay(int beforeBoat, int beforeA, int beforeB, int beforeC, 
			int beforeD, int beforeE, int beforeF, int afterBoat, int afterA, int afterB, 
			int afterC, int afterD, int afterE, int afterF) {		  
		
		//PART OF STEP 1
		if (beforeBoat < 1 || beforeBoat > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterBoat < 1 || afterBoat > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeA < 1 || beforeA > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterA < 1 || afterA > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeB < 1 || beforeB > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterB < 1 || afterB > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeC < 1 || beforeC > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterC < 1 || afterC > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeD < 1 || beforeD > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterD < 1 || afterD > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeE < 1 || beforeE > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterE < 1 || afterE > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (beforeF < 1 || beforeF > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		if (afterF < 1 || afterF > 2) {System.out.println("All positions must be 1 or 2!");
			return false;}
		
		//PART OF STEP 2
		if (beforeBoat == afterBoat) {
			System.out.println("The boat must move!");
			return false;
		}
		
		int peopleMoved = 0;
		if (beforeA != afterA) {
			//PART OF STEP 3
			//company1 manager moved
			peopleMoved += 1;
			if (beforeA != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (beforeB != afterB) {
			//PART OF STEP 3
			//company1 engineer moved
			peopleMoved += 1;
			if (beforeB != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (beforeC != afterC) {
			//PART OF STEP 3
			//company2 manager moved
			peopleMoved += 1;
			if (beforeC != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (beforeD != afterD) {
			//PART OF STEP 3
			//company2 engineer moved
			peopleMoved += 1;
			if (beforeD != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (beforeE != afterE) {
			//PART OF STEP 3
			//company3 manager moved
			peopleMoved += 1;
			if (beforeE != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (beforeF != afterF) {
			//PART OF STEP 3
			//company3 engineer moved
			peopleMoved += 1;
			if (beforeF != beforeBoat) {
				System.out.println("You may not move a person who is not with the boat!");
				return false;
			}
		}
		if (peopleMoved < 1) {
			//PART OF STEP 4
			System.out.println("You must move one or two people!");
			return false;
		}
		if (peopleMoved > 2) {
			//PART OF STEP 4
			System.out.println("You must move one or two people!");
			return false;
		}
		//PART OF STEP 5
		
		
		//PART OF STEP 5	
//		if (beforeA == beforeD && beforeC != beforeD && beforeA ==2) {
//			System.out.println("Company1 manager would try to recruit someone");
//			return false;
//		}
//		if (beforeA == beforeF && beforeE != beforeF && beforeA == 2) {
//			System.out.println("Company1 manager would try to recruit someone");
//			return false;
//		}
		//PART OF STEP 5
//		if (beforeC == beforeB && beforeA != beforeB && beforeC ==2) {
//			System.out.println("Company2 manager would try to recruit someone");
//			return false;
//		}
//		if (beforeC == beforeF && beforeE != beforeF && beforeC == 2) {
//			System.out.println("Company2 manager would try to recruit someone");
//			return false;
//		}
		//PART OF STEP 5
//		if (beforeE == beforeB && beforeA != beforeB && beforeE == 2) {
//			System.out.println("Company3 manager would try to recruit someone");
//			return false;
//		}
//		if (beforeE == beforeD && beforeC != beforeD && beforeE == 2) {
//			System.out.println("Company3 manager would try to recruit someone");
//			return false;
//		}
		//PART OF STEP 5
		if (afterA == afterC && afterF != afterC) {
			System.out.println("Company 1 manager would try to recruit someone!");
			return false;
		}
		if (afterA == afterD && afterB != afterD) {
			System.out.println("Company 1 manager would try to recruit someone!");
		    return false;
		}
		//PART OF STEP 5
		if (afterF == afterE && afterA != afterE) {
			System.out.println("Company 2 manager would try to recruit someone!");
			return false;
		}
		if (afterF == afterD && afterB != afterD) {
			System.out.println("Company 2 manager would try to recruit someone!");
		    return false;	
		}
		
		
		//PART OF STEP 5		
		if (afterB == afterE && afterA != afterE) {
			System.out.println("Company 3 manager would try to recruit someone!");
			return false;
		}
		if (afterB == afterC && afterF != afterC) {
			System.out.println("Company 3 manager would try to recruit someone!");
		    return false;
		}
		

		//PART OF FINAL STEP
		if (peopleMoved >= 6) {
			return true;
		}
		//PART OF FINAL STEP
		if (afterBoat ==2  && afterA == 2 && afterB == 2 && afterC == 2 && afterD == 2 && afterE == 2 && afterF == 2) {System.out.println("You solved the puzzle!");
		return true;}
		
		return true;
	}
}
