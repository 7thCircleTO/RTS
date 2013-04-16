/**
 * Contains the statistics of troops in array form.
 * @param troopStat[Hit_Points, Attack, Defense, Power, Resistances, Speed, Accuracy, Dodge]
 * 
 * @author TO
 *
 */
public class Stats {
	 public static void main(String[] args){
		int[] demon = new int[8];
		demon = statsDemon();
		System.out.println(demon[0]);    // Testing code
	} 
	
	
	public static int[] statsDemon(){
		int[] Demon = new int[8];
		Demon[0] = 10;  // Assigns Hit Points
		Demon[1] = 10;  // Assigns Attack
		Demon[2] = 10;	// Assigns Defense
		Demon[3] = 10;  // Assigns Power
		Demon[4] = 10;  // Assigns Resistances
		Demon[5] = 10;  // Assigns Speed
		Demon[6] = 10;  // Assigns Accuracy
		Demon[7] = 10;  // Assigns Dodge
		return Demon;
	}
	public static int[] statsCentaur(){
		int[] Centaur = new int[8];
		Centaur[0] = 100; // Assigns Hit Points
		Centaur[1] = 75;  // Assigns Attack
		Centaur[2] = 40;  // Assigns Defense
		Centaur[3] = 10;  // Assigns Power
		Centaur[4] = 30;  // Assigns Resistances
		Centaur[5] = 50;  // Assigns Speed
		Centaur[6] = 90;  // Assigns Accuracy
		Centaur[7] = 20;  // Assigns Dodge
		return Centaur;
	}
}
