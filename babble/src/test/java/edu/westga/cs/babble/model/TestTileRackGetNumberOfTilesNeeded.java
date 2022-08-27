package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for TileRack getNumberofTilesNeeded() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileRackGetNumberOfTilesNeeded {
	
	/**
	 * Tests to determine that an empty tile rack should
	 * need the max number of tiles (7)
	 * 
	 */
	@Test
	public void emptyTileRackShouldNeedMaxSizeNumberOfTiles() {
		TileRack rack = new TileRack();
		assertEquals(7, rack.getNumberOfTilesNeeded());
	}
	
	/**
	 * Tests to determine that an tile rack with 1 tile should
	 * need 6 tiles
	 * 
	 */
	@Test
	public void tileRackWithOneTileShouldNeedMaxSizeMinusOneTiles() {
		TileRack rack = new TileRack();
		Tile tile1 = new Tile('L');
		rack.append(tile1);
		assertEquals(6, rack.getNumberOfTilesNeeded());
	}
	
	/**
	 * Tests to determine that an tile rack with several (4) tiles should
	 * need some (3) tiles
	 * 
	 */
	@Test
	public void tileRackWithSeveralTilesShouldNeedSomeTiles() {
		TileRack rack = new TileRack();
		for (int count = 1; count <= 4; count++) {
			Tile tile = new Tile('L');
			rack.append(tile);
			}
		assertEquals(3, rack.getNumberOfTilesNeeded());
	}
	
	/**
	 * Tests to determine that an full tile rack with 7 tiles 
	 * does not need any tiles
	 * 
	 */
	@Test
	public void fullRackNeedsZeroTiles() {
		TileRack rack = new TileRack();
		for (int count = 1; count <= 7; count++) {
			Tile tile = new Tile('L');
			rack.append(tile);
			}
		assertEquals(0, rack.getNumberOfTilesNeeded());
	}
}
