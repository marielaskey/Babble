package edu.westga.cs.babble.views;

import edu.westga.cs.babble.controllers.WordDictionary;
import edu.westga.cs.babble.model.EmptyTileBagException;
import edu.westga.cs.babble.model.TileBag;

/**
 * Class for GUI behavior
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */

public class GuiController {
	
	private TileBag gameBag;
	private TileListModel tileList;
	private WordDictionary gameDictionary;
	private int score;
	
	/**
	 * Constructor for GuiController
	 */
	public GuiController() {
		this.gameBag = new TileBag();
		this.tileList = new TileListModel();
		while (this.tileList.getNumberOfTilesNeeded() > 0) {
			try {
				this.tileList.append(this.gameBag.drawTile());
			} catch (EmptyTileBagException exception) {
				
			}
		}
		this.gameDictionary = new WordDictionary();
	}
	
	/**
	 * getter method for TileList
	 * 
	 * @return the tileList
	 */
	public TileListModel getTileList() {
		return this.tileList;
	}

	/**
	 * getter for the dictionary used in the game
	 * 
	 * @return the gameDictionary
	 */
	public WordDictionary getGameDictionary() {
		return this.gameDictionary;
	}

	/**
	 * getter for the amount of points scored
	 * 
	 * @return the score
	 */
	public int getScore() {
		return this.score;
	}

	/**
	 * setter for the game score
	 * 
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * increments the game's total score
	 * 
	 * @param score the score to set
	 */
	public void addScore(int score) {
		this.score += score;
	}
	
	/**
	 * Method to replenish the GUI's tile rack after a word is played
	 * 
	 */
	public void addTiles() {
		while (this.tileList.getNumberOfTilesNeeded() > 0) {
			try {
				this.tileList.append(this.gameBag.drawTile());
			} catch (EmptyTileBagException exception) {
				
			}
		}
	}

}
