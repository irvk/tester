package test1;

public class Location {

	public final String EAST = "East";
	private String currentLocation = "Foyer";
	
	
	
	
	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}


	
	public void move(String direction) {
		System.out.println("You're moving from the [" + currentLocation + "] in the following direction: [" + direction + "]");
		
		if(currentLocation.equals("Foyer"))
			handleFoyerMove(direction);
		
		
		//else..  other current locations...
	
		
	}
	
	//if east from foyer..  nowhere
	//if west from foyer..  kitchen
	//if south from foyer..
	
	//state ( location ) has been updated 
	public void handleFoyerMove(String direction) {
		
		if(direction.equals(EAST))
			currentLocation = "kitchen";
		else
			System.out.println(" cant get there from here...  ");
		
		// presumably other options -  ...
		
		
	}
	
	//handle kitchen move,
	//handle other room moves...
	
}
