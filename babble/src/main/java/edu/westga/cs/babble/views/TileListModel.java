package edu.westga.cs.babble.views;

import java.util.ArrayList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import edu.westga.cs.babble.model.Tile;
import edu.westga.cs.babble.model.TileRack;

/**
 * Class for Tile List model for GUI
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class TileListModel extends TileRack implements ListModel<Tile> {
	
	private ArrayList<Tile> removedTiles;

	/**
	 * Constructor for the Tile List model
	 */
	public TileListModel() {
		this.removedTiles = new ArrayList<Tile>();
	}

	@Override
	public int getSize() {
		return super.tiles().size();
	}

	@Override
	public Tile getElementAt(int index) {
		return super.tiles().get(index);
	}

	@Override
	public void addListDataListener(ListDataListener li) {
		
	}

	@Override
	public void removeListDataListener(ListDataListener li) {
		
	}
	
	/**
	 * Removes a specified tile (letter) from the tile rack
	 * 
	 * @param tile the tile to be removed
	 */
	public void removeTile(Tile tile) {
		super.tiles().remove(tile);
		this.removedTiles.add(tile);
	}
	
	/**
	 * Resets tiles, returning removed tiles to the tile rack
	 * 
	 */
	public void resetTiles() {
		super.tiles().addAll(this.removedTiles);
		this.removedTiles.clear();
	}
	
	/**
	 * Removes tiles from play once they've been played in a valid word.
	 * 
	 */
	public void removeTiles() {
		this.removedTiles.clear();
	}

}
