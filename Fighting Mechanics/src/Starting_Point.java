import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/** 
 * Fills in the starting positions of each race at random.
 * 
 * @author TO, Brandon Bartee
 */


public class Starting_Point extends JComponent{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){ // Setup the Graphics
		Graphics2D g2 = (Graphics2D) g;
		
		// Create the 6 starting point rectangles
		Rectangle Starting1 = new Rectangle(40, 200, 50, 50);
		Rectangle Starting2 = new Rectangle(375, 50, 50, 50);
		Rectangle Starting3 = new Rectangle(710, 200, 50, 50);
		Rectangle Starting4 = new Rectangle(710, 550, 50, 50);
		Rectangle Starting5 = new Rectangle(375, 700, 50, 50);
		Rectangle Starting6 = new Rectangle(50, 550, 50, 50);
		
		// Draw the starting points on the map.
		g2.draw(Starting1);
		g2.draw(Starting2);
		g2.draw(Starting3);
		g2.draw(Starting4);
		g2.draw(Starting5);
		g2.draw(Starting6);
		
		// Initialize the randomized race starting points.
		Races raceStart = new Races(); //Invokes Races which constructs the race list.
		String[] raceList = raceStart.get(); //Use the get command to store the race list for use.
		
		// Conditionals to determine color based on index of race list.
		if (raceList[0] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(40, 200, 50, 50);
		}
		if (raceList[0] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(40, 200, 50, 50);
		}
		if (raceList[0] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(40, 200, 50, 50);
		}
		if (raceList[0] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(40, 200, 50, 50);
		}
		if (raceList[0] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(40, 200, 50, 50);
		}
		if (raceList[0] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(40, 200, 50, 50);
		}
		//
		
		if (raceList[1] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(375, 50, 50, 50);
		}
		if (raceList[1] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(375, 50, 50, 50);
		}
		if (raceList[1] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(375, 50, 50, 50);
		}
		if (raceList[1] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(375, 50, 50, 50);
		}
		if (raceList[1] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(375, 50, 50, 50);
		}
		if (raceList[1] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(375, 50, 50, 50);
		}
		//
		
		if (raceList[2] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(710, 200, 50, 50);
		}
		if (raceList[2] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(710, 200, 50, 50);
		}
		if (raceList[2] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(710, 200, 50, 50);
		}
		if (raceList[2] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(710, 200, 50, 50);
		}
		if (raceList[2] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(710, 200, 50, 50);
		}
		if (raceList[2] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(710, 200, 50, 50);
		}
		//
		
		if (raceList[3] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(710, 550, 50, 50);
		}
		if (raceList[3] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(710, 550, 50, 50);
		}
		if (raceList[3] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(710, 550, 50, 50);
		}
		if (raceList[3] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(710, 550, 50, 50);
		}
		if (raceList[3] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(710, 550, 50, 50);
		}
		if (raceList[3] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(710, 550, 50, 50);
		}
		//
		
		if (raceList[4] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(375, 700, 50, 50);
		}
		if (raceList[4] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(375, 700, 50, 50);
		}
		if (raceList[4] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(375, 700, 50, 50);
		}
		if (raceList[4] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(375, 700, 50, 50);
		}
		if (raceList[4] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(375, 700, 50, 50);
		}
		if (raceList[4] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(375, 700, 50, 50);
		}
		//
		
		if (raceList[5] == "Dwarves"){
			g2.setColor(Color.orange);
			g2.fillRect(50, 550, 50, 50);
		}
		if (raceList[5] == "Vampires"){
			g2.setColor(Color.red);
			g2.fillRect(50, 550, 50, 50);
		}
		if (raceList[5] == "Elves"){
			g2.setColor(Color.blue);
			g2.fillRect(50, 550, 50, 50);
		}
		if (raceList[5] == "Goblins"){
			g2.setColor(Color.gray);
			g2.fillRect(50, 550, 50, 50);
		}
		if (raceList[5] == "Werewolves"){
			g2.setColor(Color.green);
			g2.fillRect(50, 550, 50, 50);
		}
		if (raceList[5] == "Humans"){
			g2.setColor(Color.pink);
			g2.fillRect(50, 550, 50, 50);
		}
		
	}
}