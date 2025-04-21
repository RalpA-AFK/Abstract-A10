public abstract class Character {
	
	private String name;
	private String weaponName; 
	
	Character(String name, String weaponName){
		this.name = name;
		this.weaponName = weaponName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setWeapon(String weaponName) {
		this.weaponName = weaponName; 
	}
	
	public String getWeaponName() {
		return weaponName;
	}
	
	abstract void Dialouge1(String name);
	abstract void Dialouge2(String weaponName);

}
