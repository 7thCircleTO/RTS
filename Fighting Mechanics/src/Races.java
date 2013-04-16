import java.util.ArrayList;
import java.util.Random;

/**
 * Creates the race list in a random order.
 * Includes a get() command to retrieve the constructed String[].
 * 
 * @author TO
 *
 */

public class Races{

	public Races(){
		// List of races.
		ArrayList<String> races = new ArrayList<String>();
		races.add("Dwarves");
		races.add("Elves");
		races.add("Goblins");
		races.add("Werewolves");
		races.add("Vampires");
		races.add("Humans");
		
		Random generator = new Random(); // Generate a random seed.
	
		String[] raceOrder = new String[6];	// Initialize String[]

		// Iterate through size of string array and populate array with races at random.
		for (int i = 0; i < 6; i++){
			int numberRaces = races.size(); // Use current size of array to define random number generation boundary.
			int race = generator.nextInt(numberRaces); // Assign probability to the next int between 0 and 5.
			raceOrder[i] = races.get(race); // Populate String[].
			races.remove(race); // Remove race from list so there are no repeats.
		}
		raceList = raceOrder; // Create Instance Variable to be used outside of Class.
	}
	
	// get() method allows for retrieval of String[] with races defined.
	public String[] get(){
		return raceList;
	}
	private String[] raceList; // Allows raceList to be shared between methods.
}
