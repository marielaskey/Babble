package edu.westga.cs.babble.controllers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for WordDictionary
 * 
 * @author lewisb
 * @version 6241
 *
 */
public class TestWordDictionary {

	private WordDictionary dictionary;
	
	/**
	 * Method that sets up a new WordDictionary
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		this.dictionary = new WordDictionary();
	}
	
	/**
	 * Tests the validity of string 'expand'
	 */
	@Test
	public void stringExpandShouldBeValid() {
		assertTrue(this.dictionary.isValidWord("Expand"));
	}
	
	/**
	 * Tests the validity of string 'bugblat'
	 */
	@Test
	public void stringBugblatShouldNotBeValid() {
		assertFalse(this.dictionary.isValidWord("Bugblat"));
	}
	
	/**
	 * Tests the validity of an empty string
	 * 
	 */
	@Test
	public void emptyStringShouldNotBeValid() {
		assertFalse(this.dictionary.isValidWord(""));
	}

	/**
	 * Tests a null value for a word
	 * 
	 */
	@Test
	public void shouldNotAcceptNull() {
		assertFalse(this.dictionary.isValidWord(null));
	}
}
