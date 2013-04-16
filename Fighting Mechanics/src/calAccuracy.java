import java.util.Random;

/** 
 * Determines the outcome of an attack.
 * @param accuracy, dodge
 * @return outcome, "Hit!" or "Swing and a miss!"
 * 
 * @author TO
 */

public class calAccuracy {
	/** public static void main(String[] args){    Test code
		double accuracy = 100.0;
		double dodge = 10.0;
		
		double outcome = Accuracy(accuracy, dodge);
		System.out.println(outcome);
  	} */
	
	public static double Accuracy(double accuracy, double dodge)
	{
		int outcome = 0; // Initialize outcome
		Random generator = new Random(); // Generate a random seed.
		double probability = generator.nextDouble(); // Assign probability to the next double between 0 and 1.
		if(probability*100 <= (accuracy - dodge)){ // Check if there is a hit.
			outcome = 1;  // Assign outcome to 1 to indicate there was a hit.
			System.out.println("Hit!"); // Prints Hit! in the command window.
		}
		else{ // If there was not a hit, execute this code.
			System.out.println("Swing and a miss!"); // Prints Swing and a miss! to the command window.
		}
		return outcome; // Returns a 1 or 0 to the caller to indicate a hit or miss.
	}
}

