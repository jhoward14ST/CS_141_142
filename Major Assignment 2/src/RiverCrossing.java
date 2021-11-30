
public class RiverCrossing {
	public static void main(String[] args) {
		System.out.println(isMoveLegal(1,1, 1,1, 1,1, 1));
	}
	
	public static boolean isMoveLegal(int wolfBefore, int wolfAfter, int goatBefore, int goatAfter, int cabbageBefore, int cabbageAfter, int boatBefore) {
//		For each item (wolf, goat, cabbage), determine if it moved (compare before and after). 
//		If it did, check that this obeyed the rules:
//			Check that not too many things moved.
//			Hidden rule: check that the moving item started on the side with the boat.
		int itemsMoved = 0; //this is the total number, from wolf, goat, cabbage, of things that moved. 
		if (wolfBefore != wolfAfter) {
			//the wolf moved
			itemsMoved += 1;
			if (wolfBefore != boatBefore) {
				System.out.println("Error. The boat and wolf must start on the same side.");
				return false;
			}
		}
		
		if (goatBefore != goatAfter) {
			//the goat moved
			itemsMoved += 1;
			if (goatBefore != boatBefore) {
				System.out.println("Error. The boat and goat must start on the same side.");
				return false;
			}
		}
		
		if (cabbageBefore != cabbageAfter) {
			//the cabbage moved
			itemsMoved += 1;
			if (cabbageBefore != boatBefore) {
				System.out.println("Error. The boat and cabbage must start on the same side.");
				return false;
			}
		}
		
		if (itemsMoved > 1) {
			System.out.println("Error. You moved too many things.");
			return false;
		}

		int boatAfter = 1; // tracks where the boat is after the move.
		if (boatBefore == 1) {
			boatAfter = 2;
		}
		
//		On the “After” side, check if there are any bad combos: Wolf and goat alone, or goat and cabbage alone.
		if (wolfAfter == goatAfter) {
			if (boatAfter != wolfAfter) {
				System.out.println("Error. The goat would be eaten.");
				return false;
			}
		}
		
		if (goatAfter == cabbageAfter) {
			if (boatAfter != goatAfter) {
				System.out.println("Error. My cabbages!");
				return false;
			}
		}
		
		System.out.println("The move looks good.");
		return true;
		
	}

}
