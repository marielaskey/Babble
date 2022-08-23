package edu.westga.cs.babble.views;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/** Class that provides Document configurations for the information field.
* 
* @author Lauramarie
* @version 8/14/22
*/

public class InformationDocument extends PlainDocument {

	private static final long serialVersionUID = 1494760228890411913L;

	/**
	 * Constructor for InformationDocument
	 * 
	 */
	public InformationDocument() {
		
	}
	
	/**
	 * Setter for the info field in the GUI
	 * 
	 * @param str the string in the info text field
	 * 
	 */
	public void setInfoText(String str) {
		try {
			this.remove(0, this.getLength());
			this.insertString(0, str, null);
		} catch (BadLocationException exception) {
			System.out.println(exception.getMessage());
		}
	}

}
