package dungeon;

/*
 * @author : Regnault Jérémie
 */

public class StuffWeapon extends Stuff {
	protected int strength;

	public StuffWeapon(){
		super();
		this.strength = 0;
	}
	
	public StuffWeapon(String name, int strength) {
		super(name);
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength){
		this.strength = strength;
	}
}
