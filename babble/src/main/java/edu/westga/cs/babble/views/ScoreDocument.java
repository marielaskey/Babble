package edu.westga.cs.babble.views;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/** Class that provides Document configurations for the score field.
* 
* @author Lauramarie
* @version 8/14/22
*/

public class ScoreDocument extends PlainDocument {

	private static final long serialVersionUID = 3283594770040946664L;

	/**
	 * Constructor for ScoreDocument
	 * 
	 */
	public ScoreDocument() {
		
	}
	
	/**
	 * Setter for the score field in the GUI
	 * 
	 * @param score the game score
	 * 
	 */
	public void setScoreText(int score) {
		try {
			this.remove(0, this.getLength());
			this.insertString(0, score + " points", null);
		} catch (BadLocationException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
