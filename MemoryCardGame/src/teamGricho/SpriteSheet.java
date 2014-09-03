package teamGricho;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	public static BufferedImage spriteSheet;

	// public SpriteSheet(BufferedImage ss) throws IOException {
	//
	// Image sprite = ImageIO.read(new File("SpriteSheet.png"));
	//
	// }

	// Method for taking a single sprite from a sprite sheet
	public static Image takeSprite(int xCoord, int yCoord, int width, int height)
			throws IOException {
		spriteSheet = ImageIO.read(new File("SpriteSheet.jpg"));
		BufferedImage sprite;

		sprite = spriteSheet.getSubimage(xCoord, yCoord, width, height);
		return sprite;

	}
}
