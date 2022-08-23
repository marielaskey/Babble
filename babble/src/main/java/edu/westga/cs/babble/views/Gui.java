package edu.westga.cs.babble.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import edu.westga.cs.babble.controllers.WordDictionary;
import edu.westga.cs.babble.model.PlayedWord;

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
		ScoreDocument scoreDoc = new ScoreDocument();
		super.textFieldScore.setDocument(scoreDoc);
		InformationDocument infoDoc = new InformationDocument();
		super.textFieldInformation.setDocument(infoDoc);
		super.btnResetButton.addActionListener(new ResetListener());
		super.btnPlayButton.addActionListener(new PlayedWordListener());
	}

	/**
	 * Getter method for the document for PlayedWordDocument
	 * 
	 * @return the playedWordDoc
	 */
	public Document getPlayedWordDoc() {
		return super.textFieldWord.getDocument();
	}

	private class ResetListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			Gui.this.guiController.getTileList().resetTiles();
			Gui.this.letters.setSelectedIndex(0);
			Document playedWordDoc = Gui.this.getPlayedWordDoc();
			try {
				playedWordDoc.remove(0, playedWordDoc.getLength());
			} catch (BadLocationException exception) {
				System.out.println(exception.getMessage());
			}
			Gui.this.repaint();
		}

	}
	
	private class PlayedWordListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			Document playedWordDoc = Gui.this.getPlayedWordDoc();
			ScoreDocument scoreDoc = (ScoreDocument) Gui.this.textFieldScore.getDocument();
			InformationDocument infoDoc = (InformationDocument) Gui.this.textFieldInformation.getDocument();
			String playedWordText;
			try {
				playedWordText = playedWordDoc.getText(0, playedWordDoc.getLength());
				WordDictionary gameDictionary = Gui.this.guiController.getGameDictionary();
				if (gameDictionary.isValidWord(playedWordText)) {
					PlayedWord validWord = new PlayedWord(playedWordText);
					Gui.this.guiController.addScore(validWord.getScore());
					infoDoc
						.setInfoText("Played \"" + playedWordText + "\" for " + validWord.getScore() + " points");
					scoreDoc.setScoreText(Gui.this.guiController.getScore());
					playedWordDoc.remove(0, playedWordDoc.getLength());
					Gui.this.guiController.getTileList().removeTiles();
					Gui.this.guiController.addTiles();
				} else {
					infoDoc.setInfoText("Not a valid word: " + playedWordText);
				}
			} catch (BadLocationException exception) {
				System.out.println(exception.getLocalizedMessage());
			}

			Gui.this.repaint();
		}
		
	}

}
