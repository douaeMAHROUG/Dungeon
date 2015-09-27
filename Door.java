package dungeon;
/**
 * 
 * @author Douae
 *
 */
public class Door {

	protected String doorDescription="You are in front of a door, you can exit";

	public Door(String doorDescription) {
		this.doorDescription = doorDescription;
	}
	
	public String getDescription(){
		return doorDescription;
		
	}
}
