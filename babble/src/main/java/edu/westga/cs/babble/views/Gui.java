package edu.westga.cs.babble.views;

/**
 * Class for additional GUI configuration
 * 
 * @author Lauramarie
 * @version 8/14/22
 *
 */
public class Gui extends GuiWindowBuilderLayout {

	private static final long serialVersionUID = 1L;
	private GuiController guiController;
	
	/**
	 * Constructor for additional configurations in Gui class
	 */
	public Gui() {
		this.guiController = new GuiController();
		super.letters.setModel(this.guiController.getTileList());
		TileRenderer renderer = new TileRenderer();
		super.letters.setCellRenderer(renderer);
	}
	
}
