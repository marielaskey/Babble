package edu.westga.cs.babble.views;

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

	/**
	 * Constructor for the Tile List model
	 */
	public TileListModel() {
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListDataListener(ListDataListener li) {
		// TODO Auto-generated method stub
		
	}

}
