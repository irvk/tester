package test1;

import java.util.Scanner;

public class ToadTester {

	public static void main(String[] args) {
		
		//default toad
/*		Toad toad1 = new Toad();
		String result = toad1.whatDoIDo();
		System.out.println(result);
*/		
		//ur very own toad:
		
		Toad toad2 = new Toad("jumpy", "croak");
		//String another_result = toad2.whatDoIDo();
		//System.out.println(another_result);
 
		
		System.out.println(" welcome to the toad tester ");
	//	System.out.println(" u can do toad kinda stuff here ");
	
		System.out.println(" u can hop around toad kinda stuff here ");
		
		
		//let's put this outside the loop ( only need it 1x )
		Scanner s = new Scanner(System.in);
 		
		
		//user dialogue loop
		while(true) {
			
			System.out.println(""); 
			 
			
			System.out.println(" Hello " + toad2.getName());
			System.out.println(" Your current location is:  " + toad2.whereAmI());
			System.out.println(" Where would you like to hop (East/West/South/North)?  " );
 			System.out.println("");
			
			
 			String userChoice = s.nextLine();
 		
			toad2.move(userChoice);
			
			/*
 			System.out.println(" 1 for create ");
 			System.out.println(" 2 for display ");
 			
  			// what kinda things can we do...?   
 			// dont necesarily care, but get input and process it..
 			
 			Scanner s = new Scanner(System.in);
 			
 			String userChoice = s.nextLine();
 			
			//process the userChoice
 			//best practice would have this in it's own method
 		
 		
 			
 			if(userChoice.equals("1")) {
 				
 				System.out.println("what's your toad's name: ");
 				String toadName = s.nextLine();
 				
 				System.out.println("what's your toad's sound: ");
 				String toadSound = s.nextLine();
 				
 				
 				//creating an instance of a toad & using it...
 				Toad currentToad = new Toad(toadName, toadSound);
 				System.out.println(" your toad: " + currentToad.whatDoIDo());
 				
 			}	 
 				 
 			else if(userChoice.equals("2"))
 				System.out.println("i'm a generic toad, here's my sound: " + toad2.getSound());
 	
 			*/
			
			
		}
	

	}

}
