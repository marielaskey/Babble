package edu.westga.cs.babble.controllers;

import java.io.IOException;
import java.util.List;

import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.markup.AnnotatedText;
import org.languagetool.markup.AnnotatedTextBuilder;
import org.languagetool.rules.RuleMatch;

/**
 * Spell checker for words we attempt to make with Babble
 * @author lewisb
 * @version cs6241
 *
 */
public class WordDictionary {

	private JLanguageTool langTool;
	
	/**
	 * Creates a new WordDictionary
	 */
	public WordDictionary() {
		langTool = new JLanguageTool(new AmericanEnglish());
	}
	
	/**
	 * Determines if a word is a real word or not.
	 * 
	 * @param word the word to check
	 * @return true if a valid word, false if gibberish
	 */
	public boolean isValidWord(String word) {
		if (word == null) {
			return false;
		}
		if (word.isBlank()) {
			return false;
		}
		
		AnnotatedText text = new AnnotatedTextBuilder().addText(word).build();
		try {
			List<RuleMatch> matches = langTool.check(text);
			return matches.isEmpty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
