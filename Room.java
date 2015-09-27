import java.util.*;

/**
 * @author legrand & douae
 *
 */
public class Room {
	
	String name;
	Map<String, Door> doors;
	boolean GameIsFinish;
	boolean GameIsLost; 
	
	

	public Room(String name, Map<String, Door> doors) {
		super();
		this.name = name;
		this.doors = doors;
		this.GameIsFinish = false;
		this.GameIsLost = false;
	}
		
	public Room(String name, Map<String, Door> doors, boolean gameIsFinish,
		boolean gameIsLost) {
		super();
		this.name = name;
		this.doors = doors;
		this.GameIsFinish = gameIsFinish;
		this.GameIsLost = gameIsLost;
	}



	public String RoomDescription() {
		String result = "";
		for(Map.Entry<String, Door> door : this.doors.entrySet()) {
			String doorDescript = door.getValue().doorDescription;
			if (doorDescript != null)
				result += door.getKey()+" : "+doorDescript;
		}	
	}
	
	public boolean canPass(){
		return true;
	}

}
