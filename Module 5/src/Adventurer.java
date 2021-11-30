
public class Adventurer {
	//fields
		private String name;
		private String job;
		private int[] abilityScores; // three elements: str, dex, intel
//		private int strength;
//		private int dexterity;
//		private int intelligence;
		private int maxHP = 10;
		private int currHP = maxHP;

		public int getCurrHP() {
			return currHP;
		}

		public void setCurrHP(int currHP) {
			this.currHP = currHP;
		}

		//constructors	
		public Adventurer(int str, int dex, int intel) {
			abilityScores = new int[3];
			abilityScores[0] = str;
			abilityScores[1] = dex;
			abilityScores[2] = intel;
		}
		
		public Adventurer(String name, String job) {
			this.name = name;
			this.setJob(job);
		}
		
		public Adventurer(String name, String job, int str, int dex, int intel) {
			this(str, dex, intel);
			this.name = name;
			this.setJob(job);
		}
		
		public String getName() {
			return this.name;
		}
		
		public String getJob() {
			return job;
		}

		public int getStrength() {
			return abilityScores[0];
		}

		public void setStrength(int strength) {
			abilityScores[0] = strength;
		}

		public int getDexterity() {
			return abilityScores[1];
		}

		public void setDexterity(int dexterity) {
			if (dexterity <= 0 || dexterity > 20) {
				System.out.println("That's not a valid score.");
			} else { 
				abilityScores[1] = dexterity;
			}
		}

		public int getIntelligence() {
			return abilityScores[2];
		}

		public void setIntelligence(int intelligence) {
			abilityScores[3] = intelligence;
		}

		public int getMaxHP() {
			return maxHP;
		}

		public void setMaxHP(int maxHitPoints) {
			this.maxHP = maxHitPoints;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public void setName(String newName) {
			this.name = newName;
		}
		
		
		//methods
		public void introduceSelf() {
			System.out.println("My name is " + name + " and I am a " + getJob() +".");
		}
		
		public void attack(Monster m) {
			m.takeDamage(10);
		}
		
		public void rest() {
			currHP = maxHP;
		}
		
		@Override
		public String toString() {
			String s = name +": " + job + "\nCurrent HP: " + currHP;
			return s;
		}
		
//		public void listStats() {
//			System.out.println("Here are my stats:");
//			System.out.println("Strength: " + strength);
//			System.out.println("Dexterity: " + dexterity);
//			System.out.println("Intelligence: " + intelligence);
//		}
		
//	}
}
