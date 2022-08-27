package edu.westga.cs.babble.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test for PlayedWord matches() method
 * 
 * @author Lauramarie
 * @version 8/23/22
 *
 */
public class TestPlayedWordMatches {
	
	/**
	 * Tests the matches() method on a multiple letter word
	 * 
	 */
	@Test
	public void hasTilesForAMultipleLetterWord() {
		PlayedWord word = new PlayedWord("each");
		assertTrue(word.matches("EACH"));
	}
	
	/**
	 * Tests the matches() method on a single letter word
	 * 
	 */
	@Test
	public void hasTilesForASingleLetterWord() {
		PlayedWord word = new PlayedWord("I");
		assertTrue(word.matches("I"));
	}
	
	/**
	 * Tests that the word cannot match when tiles are 
	 * scrambled
	 * 
	 */
	@Test
	public void cannotMatchWordWhenTilesAreScrambled() {
		PlayedWord word = new PlayedWord("GRAVE");
		Tile tile = word.tiles().get(2);
		word.tiles().set(2, word.tiles().get(3));
		word.tiles().set(3, tile);
		assertFalse(word.matches("GRAVE"));
		assertTrue(word.matches("GRVAE"));
	}
	
	/**
	 * Tests that the word cannot match when there are
	 * insufficient tiles
	 * 
	 */
	@Test
	public void cannotMatchWordIfInsufficientTiles() {
		PlayedWord word = new PlayedWord("BOOM");
		assertFalse(word.matches("BOOMER"));
	}
	
	/**
	 * Tests that the word matches when there are duplicate
	 * tiles
	 * 
	 */
	@Test
	public void canMatchWordWithDuplicateLetters() {
		PlayedWord word = new PlayedWord("BOOM");
		assertTrue(word.matches("BOOM"));
	}
	
	/**
	 * Tests to make sure a non-empty word does not match
	 * empty text
	 * 
	 */
	@Test
	public void nonEmptyWordShouldNotMatchEmptyText() {
		PlayedWord word = new PlayedWord("BOOM");
		assertFalse(word.matches(""));
	}
	
	/**
	 * Tests to make sure an empty word does not match
	 * empty text (returns false)
	 * 
	 */
	@Test
	public void emptyWordShouldNotMatchEmptyText() {
		PlayedWord word = new PlayedWord("");
		assertFalse(word.matches(""));
	}
	
	/**
	 * Tests to make sure a null word cannot be matched
	 * 
	 */
	@Test
	public void shouldNotAllowNull() {
		try {
			PlayedWord word = new PlayedWord("WORD");
			assertFalse(word.matches(null));
		} catch (IllegalArgumentException exception) {
			assertTrue(true);
		}
	}
}
