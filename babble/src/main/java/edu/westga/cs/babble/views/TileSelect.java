package edu.westga.cs.babble.views;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import edu.westga.cs.babble.model.Tile;

/**
 * Class that uses MouseListener to allow tile selection in GUI
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class TileSelect implements MouseListener {
	
	private Gui theGui;

	/**
	 * Constructor for the TileSelect class
	 * 
	 * @param gui the instance of the Gui object
	 */
	public TileSelect(Gui gui) {
		this.theGui = gui;
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		@SuppressWarnings("unchecked")
		JList<Tile> letters = (JList<Tile>) event.getComponent();
		Document playedWordDoc = this.theGui.getPlayedWordDoc();
		Tile tile = letters.getSelectedValue();
		try {
			playedWordDoc.insertString(playedWordDoc.getLength(), String.valueOf(tile.getLetter()), null);
		} catch (BadLocationException exception) {
			System.out.println(exception.getMessage());
		}
		Tile selectedTile = letters.getSelectedValue();
		TileListModel listModel = (TileListModel) letters.getModel();
		listModel.removeTile(selectedTile);
	}

	@Override
	public void mousePressed(MouseEvent event) {

	}

	@Override
	public void mouseReleased(MouseEvent event) {

	}

	@Override
	public void mouseEntered(MouseEvent event) {

	}

	@Override
	public void mouseExited(MouseEvent event) {

	}

}
