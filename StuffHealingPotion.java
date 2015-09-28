package dungeon;

public class StuffHealingPotion extends Stuff {

	protected int hpRecover;

	public StuffHealingPotion(){
		super();
		this.hpRecover = 0;
	}
	
	public StuffHealingPotion(String name, int hpRecover) {
		super(name);
		this.hpRecover = hpRecover;
	}

	public int getHpRecover() {
		return hpRecover;
	}

	public void setHpRecover(int hpRecover) {
		this.hpRecover = hpRecover;
	}
	
	
}
