import javax.swing.JFrame;

/**
 * Creates the map of the world.
 * 
 * @author TO
 *
 */
public class Map {

	public static void main(String[] args) {
		JFrame map = new JFrame();
		map.setSize(800,800);  // Set size of the world.
		map.setTitle("The World"); // Set title.
		map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when the X is hit.
		
		Starting_Point territories = new Starting_Point(); // Calls the Class that draws to the map.
		map.add(territories); // Add the drawings to the map.
		
		map.setVisible(true); // Turn map to visible.
	}
}
