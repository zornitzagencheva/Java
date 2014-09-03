package teamGricho;

import java.io.IOException;
import java.net.URL;
import java.nio.Buffer;
import java.util.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Board extends JPanel implements ActionListener {

	private int difficulty;
	private int frameCount;
	private int frameWidth;
	private int spriteWidth;
	private JFrame window;
	private JButton[] gameButtons; // array with the back pics as buttons
	private JButton exitButton;
	private JButton solveButton;
	private JButton replayButton;
	private ArrayList<Integer> gameList; // list to play with numbers instead of
	private ArrayList<ImageIcon> iconList;									// pics
	private ArrayList<Image> spriteList; // list with the actual pics
	private int counter;
	private int[] buttonID;
	private String[] buttonValue;
	private JPanel gamePanel;
	private JPanel buttonPanel;
	ImageIcon buttonIcon;
	ImageIcon pressedIcon;
	Border whiteLine = BorderFactory.createLineBorder(Color.white);

	// Board constructor
	public Board(int diff) throws IOException {
		this.difficulty = diff;
		this.frameCount = (int) Math.sqrt(diff);
		this.frameWidth = (int) (Math.sqrt(diff) * 120);
		this.spriteWidth = 120;
		this.counter = 0;
		gameList = new ArrayList<Integer>();
		spriteList = new ArrayList<Image>(difficulty);
		iconList = new ArrayList<>();
		buttonID = new int[2];
		buttonValue = new String[2];

		buttonIcon = createImageIcon("back.png");
		pressedIcon = createImageIcon("front.png");
		
		createGUI(difficulty);
		createPanel(difficulty, frameCount);
		setImagesList(spriteList);
		//setArrayListText();
		setIconList(spriteList, iconList, frameCount);
		window.setTitle("Team Gricho's MemoGame");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(frameWidth, frameWidth);
		window.setVisible(true);
		gamePanel.setBorder(whiteLine);
	}

	//Method to fill and convert imageIcon list from bufferImage list
	private void setIconList(ArrayList<Image> imageList,
			ArrayList<ImageIcon> iconList, int size) {
		//TODO Fix setting description
		int counter = 0;
		for (int i = 0; i < imageList.size(); i++) {
				ImageIcon icon = new ImageIcon(imageList.get(i));				
				icon.setDescription(""+counter/2);
				iconList.add(icon);
				counter++;
		}
		
		//Collections.shuffle(iconList);
		
	}

	// Methods
	private ImageIcon createImageIcon(String path) {

		URL imgURL = Board.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}

	public void createGUI(int width) {

		gameButtons = new JButton[width];

		for (int i = 0; i < gameButtons.length; i++) {
			gameButtons[i] = new JButton(buttonIcon);
			gameButtons[i].addActionListener(this);
		}

		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);
		solveButton = new JButton("Solve");
		solveButton.addActionListener(this);
		replayButton = new JButton("Replay");
		replayButton.addActionListener(this);
	}

	private void createPanel(int buttonCount, int width) {

		window = new JFrame("Memory Card Game");
		gamePanel = new JPanel();
		buttonPanel = new JPanel();
		gamePanel.setLayout(new GridLayout(width, width));

		for (int i = 0; i < gameButtons.length; i++) {
			gamePanel.add(gameButtons[i]);
		}

		buttonPanel.add(exitButton);
		buttonPanel.add(solveButton);
		buttonPanel.add(replayButton);
		// optional
		// buttonPanel.setLayout(new GridLayout(1, 3));
		window.add(gamePanel, BorderLayout.CENTER);
		window.add(buttonPanel, BorderLayout.SOUTH);
	}
	
	private boolean sameValues() {
		if (buttonValue[0].equals(buttonValue[1])) {
			return true;	
		}else {
			return false;	
		}			
	}

	// Fill array of images taken from a spritesheet
	public void setImagesList(ArrayList<Image> list) throws IOException{
		
		for (int col = 0; col < frameCount; col++) {
			for (int row = 0; row < frameCount; row++) {
				list.add(SpriteSheet.takeSprite(row * 120, col * 120, spriteWidth, spriteWidth));				
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (exitButton == e.getSource()) {

			System.exit(0);
		}
		if (replayButton == e.getSource()) {

			for (int i = 0; i < gameButtons.length; i++) {
				gamePanel.remove(gameButtons[i]);
			}

			for (int i = 0; i < gameButtons.length; i++) {
				gamePanel.add(gameButtons[i]);
			}			
		}

		if (solveButton == e.getSource()) {

			for (int i = 0; i < gameButtons.length; i++) {
				gameButtons[i].setIcon(iconList.get(i));
				gameButtons[i].setEnabled(false);
				gameButtons[i].setEnabled(false);
			}
		}

		for (int i = 0; i < gameButtons.length; i++) {

			if (gameButtons[i] == e.getSource()) {

				gameButtons[i].setIcon(iconList.get(i));
				gameButtons[i].setEnabled(false);
				counter++;

				if (counter == 3) {
					if (sameValues()) {
						gameButtons[buttonID[0]].setEnabled(false);
						gameButtons[buttonID[1]].setEnabled(false);
						gameButtons[buttonID[0]].setIcon(iconList.get(buttonID[1]));
						gameButtons[buttonID[1]].setIcon(iconList.get(buttonID[1]));
					} else {
						gameButtons[buttonID[0]].setEnabled(true);
						gameButtons[buttonID[0]].setIcon(buttonIcon);
						gameButtons[buttonID[1]].setEnabled(true);
						gameButtons[buttonID[1]].setIcon(buttonIcon);
					}
					counter = 1;
				}

				if (counter == 1) {

					buttonID[0] = i;
					buttonValue[0] = iconList.get(i).getDescription();
				}

				if (counter == 2) {

					buttonID[1] = i;
					buttonValue[1] = iconList.get(i).getDescription();
				}
			}
		}
	}


}
