package edu.westga.cs.babble.views;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import edu.westga.cs.babble.model.Tile;

/**
 * Class that provides Document configurations for the played word field.
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class PlayedWordDocument extends PlainDocument {

	private static final long serialVersionUID = -4113247279438890337L;
	
	/**
	 * Constructor for PlayedWordDocument
	 */
	public PlayedWordDocument() {
		
	}
	
	/**
	 * Method that adds a tile into the played word field
	 * 
	 * @param tile the tile played
	 */
	public void insertTile(Tile tile) {
		try {
			this.insertString(this.getLength(), String.valueOf(tile.getLetter()), null);
		} catch (BadLocationException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
