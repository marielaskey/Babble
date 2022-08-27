package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests for TileGroup remove() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileGroupRemove {
	
	private class TileGroupConcrete extends TileGroup {
		
	}
	
	/**
	 * Tests to make sure a null value cannot be removed from the group
	 * 
	 */
	@Test
	public void shouldNotAllowNull() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		try {
			tileGroup.remove(null);
		} catch (IllegalArgumentException exception) {
			assertEquals(null, exception.getMessage());
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		
	}
	
	/**
	 * Tests to make sure a tile cannot be removed from an empty
	 * tile group
	 * 
	 */
	@Test
	public void canNotRemoveFromEmptyTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile = new Tile('A');
		try {
			tileGroup.remove(tile);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(true);
		}
		assertTrue(tileGroup.tiles().isEmpty());

	}
	
	/**
	 * Tests to make sure a tile that is not in the group cannot
	 * be removed
	 * 
	 */
	@Test
	public void canNotRemoveTileNotInTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile1 = new Tile('A');
		Tile tile2 = new Tile('Z');
		tileGroup.append(tile1);
		try {
			tileGroup.remove(tile2);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(true);
		}
	}
	
	/**
	 * Tests that a tile can be removed when it is the only tile
	 * in the group
	 * 
	 */
	@Test
	public void canRemoveOnlyTileInTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile1 = new Tile('A');
		tileGroup.append(tile1);
		try {
			tileGroup.remove(tile1);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		assertTrue(tileGroup.tiles().isEmpty());

	}
	
	/**
	 * Tests removing the first of many tiles in a group
	 * 
	 */
	@Test
	public void canRemoveFirstOfManyTilesFromTileGroup() {
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
		try {
			tileGroup.remove(tile1);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		assertEquals(6, tileGroup.tiles().size());
		assertEquals(tile2, tileGroup.tiles().get(0));
		assertEquals(tile3, tileGroup.tiles().get(1));
		assertEquals(tile4, tileGroup.tiles().get(2));
		assertEquals(tile5, tileGroup.tiles().get(3));
		assertEquals(tile6, tileGroup.tiles().get(4));
		assertEquals(tile7, tileGroup.tiles().get(5));
	}
	
	/**
	 * Tests removing the last of many tiles in a group
	 * 
	 */
	@Test
	public void canRemoveLastOfManyTilesFromTileGroup() {
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
		try {
			tileGroup.remove(tile7);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		assertEquals(6, tileGroup.tiles().size());
		assertEquals(tile1, tileGroup.tiles().get(0));
		assertEquals(tile2, tileGroup.tiles().get(1));
		assertEquals(tile3, tileGroup.tiles().get(2));
		assertEquals(tile4, tileGroup.tiles().get(3));
		assertEquals(tile5, tileGroup.tiles().get(4));
		assertEquals(tile6, tileGroup.tiles().get(5));
	}
	
	/**
	 * Tests removing the middle tile of many tiles in a group
	 * 
	 */
	@Test
	public void canRemoveMiddleOfManyTilesFromTileGroup() {
		TileGroupConcrete tileGroup = new TileGroupConcrete();
		Tile tile1 = new Tile('A');
		Tile tile2 = new Tile('B');
		Tile tile3 = new Tile('B');
		Tile tile4 = new Tile('F');
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
		try {
			tileGroup.remove(tile4);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		assertEquals(6, tileGroup.tiles().size());
		assertEquals(tile1, tileGroup.tiles().get(0));
		assertEquals(tile2, tileGroup.tiles().get(1));
		assertEquals(tile3, tileGroup.tiles().get(2));
		assertEquals(tile5, tileGroup.tiles().get(3));
		assertEquals(tile6, tileGroup.tiles().get(4));
		assertEquals(tile7, tileGroup.tiles().get(5));
	}
	
	/**
	 * Tests that there are many tiles in the group, including 
	 * duplicates after multiple tiles have been appended.
	 * 
	 */
	@Test
	public void canRemoveMultipleTilesFromTileGroup() {
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
		try {
			tileGroup.remove(tile1);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		try {
			tileGroup.remove(tile5);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		try {
			tileGroup.remove(tile7);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}		
		assertEquals(4, tileGroup.tiles().size());
		assertEquals(tile2, tileGroup.tiles().get(0));
		assertEquals(tile3, tileGroup.tiles().get(1));
		assertEquals(tile4, tileGroup.tiles().get(2));
		assertEquals(tile6, tileGroup.tiles().get(3));
	}
	
	/**
	 * Tests that duplicate tiles are not removed when a tile
	 * with duplicates is removed from the group
	 * 
	 */
	@Test
	public void doesNotRemoveDuplicateTilesFromTileGroup() {
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
		try {
			tileGroup.remove(tile4);
		} catch (TileNotInGroupException exceptionT) {
			assertTrue(false);
		}
		assertEquals(6, tileGroup.tiles().size());
		assertEquals(tile1, tileGroup.tiles().get(0));
		assertEquals(tile2, tileGroup.tiles().get(1));
		assertEquals(tile3, tileGroup.tiles().get(2));
		assertEquals(tile5, tileGroup.tiles().get(3));
		assertEquals(tile6, tileGroup.tiles().get(4));
		assertEquals(tile7, tileGroup.tiles().get(5));
	}
	
}
