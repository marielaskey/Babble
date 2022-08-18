package edu.westga.cs.babble.views;

import edu.westga.cs.babble.model.EmptyTileBagException;
import edu.westga.cs.babble.model.PlayedWord;
import edu.westga.cs.babble.model.TileBag;
import edu.westga.cs.babble.model.TileGroup;
import edu.westga.cs.babble.model.TileRack;

/**
 * Class for GUI behavior
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */

public class GuiController {
	
	private TileBag gameBag;
	private PlayedWord word;
	private TileGroup gameTileGroup;
	private TileRack gameTileRack;
	private TileListModel tileList;
	
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
	}

	/**
	 * getter method for the tile group
	 * 
	 * @return the gameBag
	 */
	public TileBag getTileBag() {
		return this.gameBag;
	}

	/**
	 * getter method for the word played
	 * 
	 * @return the word played
	 */
	public PlayedWord getPlayedWord() {
		return this.word;
	}
	
	/**
	 * getter method for TileGroup
	 * 
	 * @return the gameTileGroup
	 */
	public TileGroup getGameTileGroup() {
		return this.gameTileGroup;
	}

	/**
	 * getter method for TileRack
	 * 
	 * @return the gameTileRack
	 */
	public TileRack getGameTileRack() {
		return this.gameTileRack;
	}
	
	/**
	 * getter method for TileList
	 * 
	 * @return the tileList
	 */
	public TileListModel getTileList() {
		return this.tileList;
	}

}
