package dungeon;
/**
 * 
 * @author Douae
 *
 */

public class HiddenDoor extends Door{

	protected boolean isVisible;
	
	public HiddenDoor() {
		super();
		this.isVisible=false;
	}

	public String doorDescription(){
		if(isVisible){
			doorDescription=super.doorDescription();
		}
		else {
			doorDescription=null;
		}
		return doorDescription;
	}
}
