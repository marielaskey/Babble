package edu.westga.cs.babble.views;

import javax.swing.text.Document;

/**
 * Class for additional GUI configuration
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class Gui extends GuiWindowBuilderLayout {

	private static final long serialVersionUID = 1L;
	private GuiController guiController;
	
	/**
	 * Constructor for additional configurations in Gui class
	 */
	public Gui() {
		this.guiController = new GuiController();
		super.letters.setModel(this.guiController.getTileList());
		TileRenderer renderer = new TileRenderer();
		super.letters.setCellRenderer(renderer);
		TileSelect tileSelect = new TileSelect(this);
		super.letters.addMouseListener(tileSelect);
		PlayedWordDocument playedWordDoc = new PlayedWordDocument();
		super.textFieldWord.setDocument(playedWordDoc);
	}
	
	/**
	 * Getter method for the document for PlayedWordDocument
	 * 
	 * @return the playedWordDoc
	 */
	public Document getPlayedWordDoc() {
		return super.textFieldWord.getDocument();
	}
	
}
