package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests for Tile class's constructor
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestTileConstructor {
	
	/**
	 * Test method for Tile constructor for non-letters
	 * 
	 */
	@Test
	public void shouldNotAllowNonLetters() {
		try {
			Tile newTile = new Tile('$');
			newTile.getLetter();
			assertTrue(false);
		} catch (IllegalArgumentException exception) {
			assertTrue(true);
		}
		
		try {
			Tile numTile = new Tile('3');
			numTile.getLetter();
			assertTrue(false);
		} catch (IllegalArgumentException exception) {
			assertTrue(true);
		}
		
	}
	
	/**
	 * Checks that all 1-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateOnePointTiles() {
		Tile lowETile = new Tile('e');
		assertEquals(1, lowETile.getPointValue());
		Tile upperETile = new Tile('E');
		assertEquals(1, upperETile.getPointValue());
		Tile lowATile = new Tile('a');
		assertEquals(1, lowATile.getPointValue());
		Tile upperATile = new Tile('A');
		assertEquals(1, upperATile.getPointValue());
		Tile lowITile = new Tile('i');
		assertEquals(1, lowITile.getPointValue());
		Tile upperITile = new Tile('I');
		assertEquals(1, upperITile.getPointValue());
		Tile lowOTile = new Tile('o');
		assertEquals(1, lowOTile.getPointValue());
		Tile upperOTile = new Tile('O');
		assertEquals(1, upperOTile.getPointValue());
		Tile lowNTile = new Tile('n');
		assertEquals(1, lowNTile.getPointValue());
		Tile upperNTile = new Tile('N');
		assertEquals(1, upperNTile.getPointValue());
		Tile lowRTile = new Tile('r');
		assertEquals(1, lowRTile.getPointValue());
		Tile upperRTile = new Tile('R');
		assertEquals(1, upperRTile.getPointValue());
		Tile lowTTile = new Tile('t');
		assertEquals(1, lowTTile.getPointValue());
		Tile upperTTile = new Tile('T');
		assertEquals(1, upperTTile.getPointValue());
		Tile lowLTile = new Tile('l');
		assertEquals(1, lowLTile.getPointValue());
		Tile upperLTile = new Tile('L');
		assertEquals(1, upperLTile.getPointValue());
		Tile lowSTile = new Tile('s');
		assertEquals(1, lowSTile.getPointValue());
		Tile upperSTile = new Tile('S');
		assertEquals(1, upperSTile.getPointValue());
		Tile lowUTile = new Tile('u');
		assertEquals(1, lowUTile.getPointValue());
		Tile upperUTile = new Tile('U');
		assertEquals(1, upperUTile.getPointValue());
	}
	
	/**
	 * Checks that all 2-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateTwoPointTiles() {
		Tile lowDTile = new Tile('d');
		assertEquals(2, lowDTile.getPointValue());
		Tile upperDTile = new Tile('D');
		assertEquals(2, upperDTile.getPointValue());
		Tile lowGTile = new Tile('g');
		assertEquals(2, lowGTile.getPointValue());
		Tile upperGTile = new Tile('G');
		assertEquals(2, upperGTile.getPointValue());
	}
	
	/**
	 * Checks that all 3-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateThreePointTiles() {
		Tile lowBTile = new Tile('b');
		assertEquals(3, lowBTile.getPointValue());
		Tile upperBTile = new Tile('B');
		assertEquals(3, upperBTile.getPointValue());
		Tile lowCTile = new Tile('c');
		assertEquals(3, lowCTile.getPointValue());
		Tile upperCTile = new Tile('C');
		assertEquals(3, upperCTile.getPointValue());
		Tile lowMTile = new Tile('m');
		assertEquals(3, lowMTile.getPointValue());
		Tile upperMTile = new Tile('M');
		assertEquals(3, upperMTile.getPointValue());
		Tile lowPTile = new Tile('P');
		assertEquals(3, lowPTile.getPointValue());
		Tile upperPTile = new Tile('P');
		assertEquals(3, upperPTile.getPointValue());
	}
	
	/**
	 * Checks that all 4-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateFourPointTiles() {
		Tile lowFTile = new Tile('f');
		assertEquals(4, lowFTile.getPointValue());
		Tile upperFTile = new Tile('F');
		assertEquals(4, upperFTile.getPointValue());
		Tile lowHTile = new Tile('h');
		assertEquals(4, lowHTile.getPointValue());
		Tile upperHTile = new Tile('H');
		assertEquals(4, upperHTile.getPointValue());
		Tile lowVTile = new Tile('v');
		assertEquals(4, lowVTile.getPointValue());
		Tile upperVTile = new Tile('V');
		assertEquals(4, upperVTile.getPointValue());
		Tile lowWTile = new Tile('w');
		assertEquals(4, lowWTile.getPointValue());
		Tile upperWTile = new Tile('W');
		assertEquals(4, upperWTile.getPointValue());
		Tile lowYTile = new Tile('y');
		assertEquals(4, lowYTile.getPointValue());
		Tile upperYTile = new Tile('Y');
		assertEquals(4, upperYTile.getPointValue());
	}
	
	/**
	 * Checks that all 5-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateFivePointTiles() {
		Tile lowKTile = new Tile('k');
		assertEquals(5, lowKTile.getPointValue());
		Tile upperKTile = new Tile('K');
		assertEquals(5, upperKTile.getPointValue());
	}
	
	/**
	 * Checks that all 8-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateEightPointTiles() {
		Tile lowJTile = new Tile('j');
		assertEquals(8, lowJTile.getPointValue());
		Tile upperJTile = new Tile('J');
		assertEquals(8, upperJTile.getPointValue());
		Tile lowXTile = new Tile('x');
		assertEquals(8, lowXTile.getPointValue());
		Tile upperXTile = new Tile('X');
		assertEquals(8, upperXTile.getPointValue());
	}
	
	/**
	 * Checks that all 10-point tiles can be made and have appropriate point
	 * value assigned.
	 */
	@Test
	public void shouldCreateTenPointTiles() {
		Tile lowQTile = new Tile('q');
		assertEquals(10, lowQTile.getPointValue());
		Tile upperQTile = new Tile('Q');
		assertEquals(10, upperQTile.getPointValue());
		Tile lowZTile = new Tile('z');
		assertEquals(10, lowZTile.getPointValue());
		Tile upperZTile = new Tile('Z');
		assertEquals(10, upperZTile.getPointValue());
	}

}
