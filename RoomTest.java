package dungeon;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import dungeon.Room;
/**
 * @author Douae
 */
public class RoomTest {
    Room room;
    LockedDoor lockedDoor;
    Map<String, Door> doors;
    
	@Before
	public void constructeur(){
		String name = "Trap";
		lockedDoor=new LockedDoor();
		doors = new HashMap<String,Door>();
		doors.put("NORTH",lockedDoor);
		room = new Room(name,doors);	
	}
	
	@Test
	public void testConstructor() {
		assertEquals(room.name,"Trap");
		assertTrue(room.doors.keySet().contains("NORTH"));
		assertEquals(room.doors.get("NORTH"),lockedDoor);
	}
	
	@Test
	public void RoomDescription(){
		String result="NORTH : locked door";
		assertEquals(room.RoomDescription(),result);
	}
	
	@Test
	public void testCanPass(){
		assertTrue(true);
	}	
}

