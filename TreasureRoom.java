package dungeon;

import java.util.Map;

public class TreasureRoom extends Room{

	protected Stuff contents;
	
	public TreasureRoom(String name, Map<String, Door> doors,Stuff contents) {
		super(name, doors);
		this.contents = contents;
	}

	public Stuff getContents() {
		return contents;
	}

	@Override
	public String roomDescription() {
		return "there is a treasure\n"+super.roomDescription();
	}
	
	public void openTresure(Hero hero){
		hero.addStuff(contents);
		this.contents = null;
	} 
	
	
}
