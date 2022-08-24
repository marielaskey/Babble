package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Tests for TileBag drawTile() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileBagDrawTile {
	
	/**
	 * Checks that the total number of tiles (98) can be drawn
	 * 
	 */
	@Test
	public void canDrawAllTiles() {
		TileBag newBag = new TileBag();
		for (int in = 0; in < 98; in++) {
			try {
				newBag.drawTile();
			} catch (EmptyTileBagException exception) {
				assertTrue(false);
			}
		}
		assertTrue(newBag.isEmpty());
		
	}
	
	/**
	 * Checks that the more than 98 tiles cannot be drawn
	 * 
	 */
	@Test
	public void canNotDrawTooManyTiles() {
		TileBag newBag = new TileBag();
		for (int in = 0; in < 99; in++) {
			try {
				newBag.drawTile();
			} catch (EmptyTileBagException exception) {
				if (in < 98) {
					assertTrue(false);
				} else {
					assertTrue(true);
				}
			}
		}
	}
	
	/**
	 * Checks that the tiles in the bag are distributed according
	 * to the standard Scrabble distribution.
	 * 
	 */
	@Test
	public void hasProperTileDistribution() {
		TileBag newBag = new TileBag();
		ArrayList<Tile> tiles = this.getScrabbleTiles();
		for (int in = 0; in < 98; in++) {
			try {
				Tile drawnTile = newBag.drawTile();
				Tile foundTile = null;
				for (Tile aTile : tiles) {
					if (aTile.getLetter() == drawnTile.getLetter()) {
						foundTile = aTile;
						break;
					}
				}
				assertTrue(tiles.remove(foundTile));
			} catch (EmptyTileBagException exception) {
				assertTrue(false);
			}
		} 
		assertTrue(newBag.isEmpty());
		assertTrue(tiles.isEmpty());
	}
	
	/**
	 * Method that returns an array list with the proper distribution
	 * of Scrabble tiles.
	 * @return tiles	the tiles in the TileBag
	 */
	private ArrayList<Tile> getScrabbleTiles() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		for (int in = 0; in < 12; in++) {
			tiles.add(new Tile('E')); }
		for (int in = 0; in < 9; in++) {
			tiles.add(new Tile('A')); }
		for (int in = 0; in < 9; in++) {
			tiles.add(new Tile('I')); }
		for (int in = 0; in < 8; in++)  {
			tiles.add(new Tile('O')); }
		for (int in = 0; in < 6; in++) {
			tiles.add(new Tile('N')); }
		for (int in = 0; in < 6; in++) { 
			tiles.add(new Tile('R')); }
		for (int in = 0; in < 6; in++) { 
			tiles.add(new Tile('T')); }
		for (int in = 0; in < 4; in++) { 
			tiles.add(new Tile('L')); }
		for (int in = 0; in < 4; in++) { 
			tiles.add(new Tile('S')); }
		for (int in = 0; in < 4; in++) { 
			tiles.add(new Tile('U')); }
		
		for (int in = 0; in < 4; in++) {
			tiles.add(new Tile('D')); }
		for (int in = 0; in < 3; in++) {
			tiles.add(new Tile('G')); }

		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('B')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('C')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('M')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('P')); }
		
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('F')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('H')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('V')); }
		for (int in = 0; in < 2; in++) {
			tiles.add(new Tile('W')); }
		for (int in = 0; in < 2; in++) { 
			tiles.add(new Tile('Y')); }

		tiles.add(new Tile('K'));
		
		tiles.add(new Tile('J'));
		tiles.add(new Tile('X'));
		
		tiles.add(new Tile('Q'));
		tiles.add(new Tile('Z'));
		
		return tiles;
	}

}
