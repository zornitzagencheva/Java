package teamGricho;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DifficultyMenu extends JFrame implements ActionListener {

	// Init Buttons
	JButton easyBtn = new JButton("Easy");
	JButton mediumBtn = new JButton("Medium");
	JButton hardBtn = new JButton("Hard");

	public DifficultyMenu() {

		initUI();
	}

	public void initUI() {

		// Init Jpanel and set button locations

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);

		easyBtn.setBounds(50, 25, 80, 30);
		easyBtn.addActionListener(this);

		mediumBtn.setBounds(50, 65, 80, 30);
		mediumBtn.addActionListener(this);

		hardBtn.setBounds(50, 105, 80, 30);
		hardBtn.addActionListener(this);

		panel.add(easyBtn);
		panel.add(mediumBtn);
		panel.add(hardBtn);

		setTitle("Choose");
		setSize(200, 200);
		setLocationRelativeTo(null);

	}

	public static int initDiff(String difficulty) {
		switch (difficulty) {
		case "easy":
			return 16;
		case "medium":
			return 36;
		case "hard":
			return 64;
		}
		return 0;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				DifficultyMenu ex = new DifficultyMenu();
				ex.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = (e.getSource());
		{
			if (src == easyBtn) {
				dispose();
				try {
					Board board = new Board(initDiff("easy"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			if (src == mediumBtn) {
				dispose();
				try {
					Board board = new Board(initDiff("medium"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (src == hardBtn) {
				dispose();
				try {
					Board board = new Board(initDiff("hard"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

	}
}
