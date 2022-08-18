package edu.westga.cs.babble.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import edu.westga.cs.babble.model.Tile;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Dimension;

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
	protected JList<Tile> letters;
	protected JButton btnResetButton;
	protected JButton btnPlayButton;
	
	/**
	 * Constructor for GuiWindowBuilderLayout
	 */
	public GuiWindowBuilderLayout() {
		setSize(new Dimension(450, 300));
		getContentPane().setLayout(null);
		
		JLabel lblTileLabel = new JLabel("Tiles");
		lblTileLabel.setBounds(30, 5, 434, 14);
		getContentPane().add(lblTileLabel);
		
		this.letters = new JList<Tile>();
		this.letters.setVisibleRowCount(1);
		this.letters.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		this.letters.setToolTipText("letters");
		this.letters.setBounds(30, 30, 300, 22);
		getContentPane().add(this.letters);
		
		JLabel lblWordLabel = new JLabel("Your Word");
		lblWordLabel.setBounds(30, 70, 83, 14);
		getContentPane().add(lblWordLabel);
		
		this.textFieldWord = new JTextField();
		this.textFieldWord.setEditable(false);
		this.textFieldWord.setToolTipText("your word");
		this.textFieldWord.setBounds(30, 90, 300, 20);
		getContentPane().add(this.textFieldWord);
		this.textFieldWord.setColumns(10);
		
		this.btnResetButton = new JButton("Reset");
		this.btnResetButton.setToolTipText("reset letters");
		this.btnResetButton.setBounds(105, 130, 100, 23);
		getContentPane().add(this.btnResetButton);
		
		this.btnPlayButton = new JButton("Play Word");
		this.btnPlayButton.setToolTipText("play word");
		this.btnPlayButton.setBounds(230, 130, 100, 23);
		getContentPane().add(this.btnPlayButton);
		
		JLabel lblScoreLabel = new JLabel("Score:");
		lblScoreLabel.setToolTipText("");
		lblScoreLabel.setBounds(165, 164, 46, 14);
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
