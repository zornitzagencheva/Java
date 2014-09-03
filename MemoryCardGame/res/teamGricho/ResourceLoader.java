package teamGricho;

import java.awt.Image;
import java.awt.Toolkit;

//A class for loading the sprite sheet from file
public class ResourceLoader {

	static ResourceLoader rl = new ResourceLoader();

	//The method just needs the filename of the as it is stored on your HDD example: back.png
	public static Image getImage(String filename){
		
		return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("images/" + filename));
	}
}
