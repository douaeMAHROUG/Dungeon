package dungeon;
/**
 * 
 * @author Douae
 *
 */
public class LockedDoor extends Door{

	public LockedDoor(String doorDescription) {
		super(doorDescription);
	}

	public String getDescription(){
		return doorDescription +" if you have a key";
	}
}
