package dungeon;
/**
 * 
 * @author Douae
 *
 */

public class HiddenDoor extends Door{

	protected boolean visible;
	protected int numberOfActions;
	
	public HiddenDoor(String doorDescription, boolean visible) {
		super(doorDescription);
		this.visible=false;
		this.numberOfActions=0;
	}

	boolean isVisible(){
		return numberOfActions!=0;
	}
	public String getDescription(){
		if(isVisible()){
			doorDescription=super.getDescription();
		}
		else {
			doorDescription="";
		}
		return doorDescription;
	}
}
