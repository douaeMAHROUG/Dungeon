package dungeon;

import java.util.ArrayList;
import java.util.List;

/*
 * @author : Regnault Jérémie
 */

public class Hero extends Character {
	protected int keys;
	protected List<Stuff> bag;
	
	public Hero(){
		super();
		this.keys = 0;
		this.bag = new ArrayList<Stuff>();
	}
	
	public Hero(String name, int life, int strength) {
		super(name, life, strength);
		this.keys = 0;
		this.bag = new ArrayList<Stuff>();
	}

	public int getKeys() {
		return keys;
	}
	
	public void setKeys(int keys){
		this.keys = keys;
	}
	
	public void addKey (int numberKey) {
		this.keys += numberKey;
	}
	
	public boolean hasKey(){
		return this.keys > 0;
	}
	
	public void useKey (){
		this.keys--;
	}
	
}
