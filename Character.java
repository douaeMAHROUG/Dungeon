package dungeon;

/*
 * @author : Regnault Jérémie
 */

public class Character {
	protected String name;
	protected int lifeMax;
	protected int life;
	protected int strength;
	protected StuffWeapon weapon;
	
	public Character (){
		this.name = "Alonso";
		this.lifeMax = 100;
		this.life = 100;
		this.strength = 10;
		this.weapon = new StuffWeapon("hands", 0);
	}
	
	public Character(String name, int life, int strength) {
		this.name = name;
		this.life = life;
		this.lifeMax = life;
		this.strength = strength;
		this.weapon = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLifeMax() {
		return lifeMax;
	}

	public void setLifeMax(int lifeMax) {
		this.lifeMax = lifeMax;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public StuffWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(StuffWeapon weapon) {
		this.weapon = weapon;
	}

	public boolean isDead (){
		return this.life == 0;
	}
	
	public void useHealingPotion(StuffHealingPotion potion){
		this.life += potion.getHpRecover();
		if (this.life > this.lifeMax)
			this.life = this.lifeMax;
	}
	
	public void attackCharacter (Character other){
		other.life -= this.strength + this.weapon.getStrength();
	}
	
	public void fight(Character enemy){
		while (!(this.isDead()) && !(enemy.isDead())) {
			this.attackCharacter(enemy);
			if (!(enemy.isDead()))
				enemy.attackCharacter(this);
		}
		
	}
}
