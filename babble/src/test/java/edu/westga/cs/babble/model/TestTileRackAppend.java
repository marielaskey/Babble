package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test for TileRack append() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileRackAppend {
	
	/**
	 * Tests to make sure a tile cannot be added to a full
	 * (with already 7 tiles) tile rack
	 * 
	 */
	@Test
	public void shouldNotAppendToFullRack() {
		TileRack rack = new TileRack();
		try {
			for (int count = 1; count <= 8; count++) {
				Tile tile = new Tile('A');
				rack.append(tile);
			}
		} catch (TileRackFullException exception) {
			assertTrue(true);
		}
		
		assertEquals(7, rack.tiles().size());
	}
	
}
