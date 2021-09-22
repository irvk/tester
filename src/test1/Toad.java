package test1;

public class Toad {
	
	private String sound;
	private String name;
	private Location location;
	
	public Toad() {
		sound = "ribbit";
		name = "hoppy";
		location = new Location();
	}
	
	public Toad(String name, String sound) {
		this.sound = sound;
		this.name = name;
		location = new Location();
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String whatDoIDo() {
		
		return "I am a toad, my name is " + this.name + " and i make the following sound: " + this.sound;
		
	}
	
	public void move(String direction) {
		
		location.move(direction);
		
	}
	
	public String whereAmI() {
		return location.getCurrentLocation();
	}
	
	
	//private...   check if froggy can make it - if not sub behind the scenes..
	

}
