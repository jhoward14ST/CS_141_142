
public class SpellCaster extends Adventurer {

	int maxMP;
	int currMP;
	
	public int getMaxMP() {
		return maxMP;
	}

	public void setMaxMP(int maxMP) {
		this.maxMP = maxMP;
	}

	public int getCurrMP() {
		return currMP;
	}

	public void setCurrMP(int currMP) {
		this.currMP = currMP;
	}

	public SpellCaster(String name, String job, int str, int dex, int intel, int maxMP) {
		super(name, job, str, dex, intel);
		this.maxMP = maxMP;
		this.currMP = maxMP;
	}
	
	public void heal(Adventurer a) {
		if (currMP >= 5) {
			a.setCurrHP(a.getMaxHP());
			currMP -= 5;
		}
	}
	
	@Override
	public void rest() {
		super.rest();
		currMP = maxMP;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCurrent MP: " + currMP;
		return s;
	}
}
