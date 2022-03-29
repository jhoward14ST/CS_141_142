import java.util.Arrays;

public class CharacterCreator {

	public static void main(String[] args) {
		Adventurer alara = new Adventurer(10, 12, 17);
		alara.setName("Alara Silverscales");
		alara.setJob("Sorcerer");
		//the following is not needed since we know about constructors now
//		alara.strength = 10;
//		alara.dexterity = 12;
//		alara.intelligence = 17;
		
//		alara.introduceSelf();
//		alara.listStats();
//		System.out.println();
		
		Adventurer thud = new Adventurer("Thud!", "Barabarian", 18, 15, 7);
//		thud.introduceSelf();
//		thud.listStats();
//		System.out.println(thud.maxHitPoints);
		Monster goblin = new Monster(7, "Klaarg");
//		thud.attack(goblin);

		SpellCaster ara = new SpellCaster("Ara", "Wizard", 8,13,18, 20);
//		System.out.println(ara.getCurrMP());
//		thud.setCurrHP(2);
//		System.out.println(thud.getCurrHP());
//		ara.heal(thud);
//		System.out.println(thud.getCurrHP());
		
		System.out.println(thud + "\n");
		System.out.println(ara);

		String a = "a";
		String b = new String("a");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		int[] c = {1,2,3};
		int[] d = {1,2,3};
		System.out.println(c.equals(d));
		System.out.println(Arrays.equals(c,d));
		
		
		
	}

}