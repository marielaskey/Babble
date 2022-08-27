package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test for PlayedWord clear() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestPlayedWordClear {
	
	/**
	 * Tests clear() method on an empty word
	 * 
	 */
	@Test
	public void shouldClearEmptyWord() {
		PlayedWord word = new PlayedWord();
		word.clear();
		assertEquals("", word.getHand());
	}
	
	/**
	 * Tests clear() method for a 1-tile word.
	 * 
	 */
	@Test
	public void shouldClearWordWithOneTile() {
		PlayedWord word = new PlayedWord("A");
		word.clear();
		assertEquals("", word.getHand());
	}
	
	/**
	 * Tests clear() method for a word with multiple tiles
	 * 
	 */
	@Test
	public void shouldClearWordWithManyTiles() {
		PlayedWord word = new PlayedWord("STARRY");
		word.clear();
		assertEquals("", word.getHand());
	}
	
}
