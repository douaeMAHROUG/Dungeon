package dungeon;

import java.util.*;

/**
 * @author NEGMI
 *
 */


public class MonsterRoom extends Room  {
	 
	Monster monster;
	
	public MonsterRoom(String name, Map<String, Door> doors, Monster monster) {
		super(name, doors);
		this.monster= monster; 
	}
	
	public Monster getMonster() {
		return monster;
	}

	@Override
	public boolean canPass() {
		 
		return (monster.GetLifePoint() <= 0);
	}

	@Override
	public String RoomDescription() {
	 
		return "there is a monster\n "+ super.RoomDescription();
	}
	
	public String fight (Hero hero, Monster monster){
		while ((hero.getLifePoint() > 0 )&& (monster.GetLifePoint() > 0 )) {
			
			hero.attack(monster);
			monster.attack(hero);	 
			
		}
		if (hero.getLifePoint() <= 0) {
			return "the hero is dead";
		}
		else return "the monter iis dead";
	}
	
	 
		
		

	

}
