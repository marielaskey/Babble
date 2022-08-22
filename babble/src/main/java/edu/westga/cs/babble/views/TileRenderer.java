package edu.westga.cs.babble.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

import edu.westga.cs.babble.model.Tile;

/**
 * Class that renders the tiles for the GUI.
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class TileRenderer implements ListCellRenderer<Tile> {

	/**
	 * Constructor for the tile renderer
	 */
	public TileRenderer() {

	}

	@Override
	public Component getListCellRendererComponent(JList<? extends Tile> list, Tile tile, int index, boolean isSelected,
			boolean cellHasFocus) {
		JLabel tileSquare = new JLabel(" " + String.valueOf(tile.getLetter()) + " ");
		tileSquare.setPreferredSize(new Dimension(20, 20));
		Border blackline = BorderFactory.createLineBorder(Color.black);
		tileSquare.setBorder(blackline);
		return tileSquare;
	}

}
