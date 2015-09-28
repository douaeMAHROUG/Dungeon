package dungeon;

/*
 * @author : Regnault Jérémie
 */

public class Stuff {
	protected String name;

	public Stuff(){
		this.name = "artefact";
	}
	
	public Stuff(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
