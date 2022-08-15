package edu.westga.cs.babble;

import edu.westga.cs.babble.views.Gui;

/**
 * Main class for the Babble project
 * 
 * @author lewisb
 * @version cs6241
 */
public class Babble {
	
    /**
     * Start point for the application.
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Gui theGui = new Gui();
        
        theGui.setVisible(true);
    }

}
