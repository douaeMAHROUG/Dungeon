package dungeon;
import java.util.*;

/**
 * @author legrand
 *
 */
public class Room {
	
	String name;
	Map<String, Door> doors;
	boolean gameWillFinish;
	boolean gameWillLost;
	
	
	

	public Room(String name, Map<String, Door> doors) {
		this.name = name;
		this.doors = doors;
		this.gameWillFinish = false;
		this.gameWillLost = false;
	}
		
	public Room(String name, Map<String, Door> doors, boolean gamewillFinish,
		boolean gameWillLost) {
		this.name = name;
		this.doors = doors;
		this.gameWillFinish = gamewillFinish;
		this.gameWillLost = gameWillLost;
	}
	
	public void addDoor(String doorName,Door door){
		this.doors.put(doorName, door);
	}



	public String roomDescription() {
		String result = "";
		for(Map.Entry<String, Door> door : this.doors.entrySet()) {
			String doorDescript = door.getValue().doorDescription();
			if (doorDescript != null)
				result += door.getKey()+" : "+doorDescript;
		}
		return result;
	}
	
	public boolean canPass(){
		return true;
	}

}
