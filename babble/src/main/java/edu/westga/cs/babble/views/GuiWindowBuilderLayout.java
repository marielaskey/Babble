package edu.westga.cs.babble.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import edu.westga.cs.babble.model.Tile;

import javax.swing.JList;
import javax.swing.JButton;

/**
 * 
 * GUI layout for Babble game
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class GuiWindowBuilderLayout extends JFrame {
	private static final long serialVersionUID = 8404049378028182418L;
	protected JTextField textFieldWord;
	protected JTextField textFieldScore;
	protected JTextField textFieldInformation;
	
	/**
	 * Constructor for GuiWindowBuilderLayout
	 */
	public GuiWindowBuilderLayout() {
		getContentPane().setLayout(null);
		
		JLabel lblTileLabel = new JLabel("Tiles");
		lblTileLabel.setBounds(30, 5, 434, 14);
		getContentPane().add(lblTileLabel);
		
		JList<Tile> letters = new JList<Tile>();
		letters.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		letters.setToolTipText("letters");
		letters.setBounds(30, 30, 300, 22);
		getContentPane().add(letters);
		
		JLabel lblWordLabel = new JLabel("Your Word");
		lblWordLabel.setBounds(30, 70, 83, 14);
		getContentPane().add(lblWordLabel);
		
		this.textFieldWord = new JTextField();
		this.textFieldWord.setToolTipText("your word");
		this.textFieldWord.setBounds(30, 90, 300, 20);
		getContentPane().add(this.textFieldWord);
		this.textFieldWord.setColumns(10);
		
		JButton btnResetButton = new JButton("Reset");
		btnResetButton.setToolTipText("reset letters");
		btnResetButton.setBounds(116, 130, 89, 23);
		getContentPane().add(btnResetButton);
		
		JButton btnPlayButton = new JButton("Play Word");
		btnPlayButton.setToolTipText("play word");
		btnPlayButton.setBounds(241, 130, 89, 23);
		getContentPane().add(btnPlayButton);
		
		JLabel lblScoreLabel = new JLabel("Score:");
		lblScoreLabel.setToolTipText("");
		lblScoreLabel.setBounds(178, 164, 46, 14);
		getContentPane().add(lblScoreLabel);
		
		this.textFieldScore = new JTextField();
		this.textFieldScore.setToolTipText("score");
		this.textFieldScore.setBounds(212, 164, 118, 20);
		getContentPane().add(this.textFieldScore);
		this.textFieldScore.setColumns(10);
		
		this.textFieldInformation = new JTextField();
		this.textFieldInformation.setToolTipText("information");
		this.textFieldInformation.setBounds(30, 230, 350, 20);
		getContentPane().add(this.textFieldInformation);
		this.textFieldInformation.setColumns(10);
		
	}
}
