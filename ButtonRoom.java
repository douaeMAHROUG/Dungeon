package dungeon;

import java.util.Map;

public class ButtonRoom extends Room {

	public ButtonRoom(String name, Map<String, Door> doors) {
		super(name, doors);
		
	}

	@Override
	public String RoomDescription() {
		
		return "there is a button/n"+ super.RoomDescription();
	}
	 public void pressButton() {
		 for(Map.Entry<String, Door> door : this.doors.entrySet()) {
			 door.getValue().isVisible = true;
		 }
		
	}
	
	

}
