package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for PlayedWord getScore() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestPlayedWordGetScore {
	
	/**
	 * Tests to make sure a blank word with no tiles has a score
	 * of 0.
	 * 
	 */
	@Test
	public void emptyWordShouldHaveScoreOfZero() {
		PlayedWord word = new PlayedWord("");
		assertEquals(0, word.getScore());
	}
	
	/**
	 * Tests the scoring of a 1-tile word.
	 * 
	 */
	@Test
	public void scoreAOneTileWord() {
		PlayedWord word = new PlayedWord("I");
		assertEquals(1, word.getScore());
	}
	
	/**
	 * Tests the scoring of a word with multiple different tiles
	 * 
	 */
	@Test
	public void scoreAWordWithMultipleDifferingTiles() {
		PlayedWord word = new PlayedWord("GRAVE");
		assertEquals(9, word.getScore());
	}
	
	/**
	 * Tests the scoring of a word with multiple tiles that
	 * contains duplicates
	 * 
	 */
	@Test
	public void scoreAWordContainingDuplicateTiles() {
		PlayedWord word = new PlayedWord("BOOM");
		assertEquals(8, word.getScore());
	}
}
