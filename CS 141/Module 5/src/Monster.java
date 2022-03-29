
public class Monster {
	private int maxHP;
	private int currHP = maxHP;
	private String name;
	
	/**
	 * @param maxHP maximum hit points
	 * @param name the monster's name
	 */
	public Monster(int maxHP, String name) {
		this.maxHP = maxHP;
		this.name = name;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getCurrHP() {
		return currHP;
	}

	public void setCurrHP(int currHP) {
		this.currHP = currHP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void takeDamage(int damage) {
		currHP -= damage;
		if (currHP <= 0) {
			System.out.println(name + " has been defeated.");
		}
		
	}	
}
