package dungeon;
/**
 * 
 * @author Douae
 *
 */
public class Door {
    protected boolean isVisible=true;
	protected String doorDescription="You are in front of a door";
    protected Room nextRoom;

	public Room getNextRoom() {
		return nextRoom;
	}

	public String doorDescription(){
		return doorDescription;	
	}
 }
 