public class Archer extends Character {
	
	Archer(String name, String weaponName){
		super(name, weaponName);
	}
	
	@Override
	void Dialouge1(String name) {
		System.out.println(name + " is a Archer with high dps capabilities");
	}

	@Override
	void Dialouge2(String weaponName) {
		System.out.println("The " + weaponName + " is a Archer weapon dealing 30 dmg a hit while also applying bleed to the target.");
	}

}
