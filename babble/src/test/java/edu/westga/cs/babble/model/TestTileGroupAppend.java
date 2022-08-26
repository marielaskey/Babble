package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests for TileGroup append() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileGroupAppend {
	
	private class TileGroupConcrete extends TileGroup {
		
	}
	
	/**
	 * Tests to make sure a null tile cannot be appended
	 * 
	 */
	@Test
	public void shouldNotAllowNull() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		try {
			tileGroup.append(null);
		} catch (IllegalArgumentException exception) {
			assertEquals("tile cannot be null", exception.getMessage());
		}
		
	}
	
	/**
	 * Tests to make sure an empty group is empty
	 * 
	 */
	@Test
	public void emptyGroupShouldBeEmpty() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		assertTrue(tileGroup.tiles().isEmpty());

	}
	
	/**
	 * Tests that there is 1 tile in the group after only 1 has been
	 * appended.
	 * 
	 */
	@Test
	public void shouldHaveOneTileInTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile = new Tile('A');
		tileGroup.append(tile);
		assertEquals(1, tileGroup.tiles().size());
		assertTrue(tileGroup.tiles().contains(tile));
	}
	
	/**
	 * Tests that there are many tiles in the group after multiple
	 * tiles have been appended.
	 * 
	 */
	@Test
	public void shouldHaveManyTilesInTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile1 = new Tile('A');
		Tile tile2 = new Tile('B');
		Tile tile3 = new Tile('C');
		Tile tile4 = new Tile('D');
		Tile tile5 = new Tile('E');
		tileGroup.append(tile1);
		tileGroup.append(tile2);
		tileGroup.append(tile3);
		tileGroup.append(tile4);
		tileGroup.append(tile5);
		assertEquals(5, tileGroup.tiles().size());
		assertEquals(tile1, tileGroup.tiles().get(0));
		assertEquals(tile2, tileGroup.tiles().get(1));
		assertEquals(tile3, tileGroup.tiles().get(2));
		assertEquals(tile4, tileGroup.tiles().get(3));
		assertEquals(tile5, tileGroup.tiles().get(4));
	}
	
	/**
	 * Tests that there are many tiles in the group, including 
	 * duplicates after multiple tiles have been appended.
	 * 
	 */
	@Test
	public void shouldHaveManyTilesIncludingDuplicatesInTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile1 = new Tile('A');
		Tile tile2 = new Tile('B');
		Tile tile3 = new Tile('B');
		Tile tile4 = new Tile('B');
		Tile tile5 = new Tile('C');
		Tile tile6 = new Tile('D');
		Tile tile7 = new Tile('E');
		tileGroup.append(tile1);
		tileGroup.append(tile2);
		tileGroup.append(tile3);
		tileGroup.append(tile4);
		tileGroup.append(tile5);
		tileGroup.append(tile6);
		tileGroup.append(tile7);
		assertEquals(7, tileGroup.tiles().size());
		assertEquals(tile1, tileGroup.tiles().get(0));
		assertEquals(tile2, tileGroup.tiles().get(1));
		assertEquals(tile3, tileGroup.tiles().get(2));
		assertEquals(tile4, tileGroup.tiles().get(3));
		assertEquals(tile5, tileGroup.tiles().get(4));
		assertEquals(tile6, tileGroup.tiles().get(5));
		assertEquals(tile7, tileGroup.tiles().get(6));
	}
	
}
