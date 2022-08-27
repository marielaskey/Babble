package edu.westga.cs.babble.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Container for Tiles, allows drawing random Tiles.  When created, it self-populates with a Scrabble-like set of tiles.
 * @author lewisb
 * @version 6241
 *
 */
public class TileBag {

	private ArrayList<Tile> tiles;
	private Random rand;
	
	/**
	 * Creates a new, populated TileBag
	 */
	public TileBag() {
		this.rand = new Random();
		this.tiles = new ArrayList<Tile>();
		this.populateWithScrabbleTiles();
	}
	
	/**
	 * Brute-force fills the bag with a set of tiles with the Scrabble points and letter distribution (ignoring the blank tiles)
	 */
	private void populateWithScrabbleTiles() {
		// 1-pt tiles: E, A, I, O, N, R, T, L, S, U
		for (int in = 0; in < 12; in++) {
				this.tiles.add(new Tile('E')); }
		for (int in = 0; in < 9; in++) {
			this.tiles.add(new Tile('A')); }
		for (int in = 0; in < 9; in++) {
			this.tiles.add(new Tile('I')); }
		for (int in = 0; in < 8; in++)  {
			this.tiles.add(new Tile('O')); }
		for (int in = 0; in < 6; in++) {
			this.tiles.add(new Tile('N')); }
		for (int in = 0; in < 6; in++) { 
			this.tiles.add(new Tile('R')); }
		for (int in = 0; in < 6; in++) { 
			this.tiles.add(new Tile('T')); }
		for (int in = 0; in < 4; in++) { 
			this.tiles.add(new Tile('L')); }
		for (int in = 0; in < 4; in++) { 
			this.tiles.add(new Tile('S')); }
		for (int in = 0; in < 4; in++) { 
			this.tiles.add(new Tile('U')); }
		
		// 2-pt tiles: D, G
		for (int in = 0; in < 4; in++) {
			this.tiles.add(new Tile('D')); }
		for (int in = 0; in < 3; in++) {
			this.tiles.add(new Tile('G')); }
		
		// 3 pt tiles: B, C, M, P
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('B')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('C')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('M')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('P')); }
		
		// 4 pt tiles: F, H, V, W, Y
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('F')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('H')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('V')); }
		for (int in = 0; in < 2; in++) {
			this.tiles.add(new Tile('W')); }
		for (int in = 0; in < 2; in++) { 
			this.tiles.add(new Tile('Y')); }
		// 5-pt tiles: K
		this.tiles.add(new Tile('K'));
		
		// 8-pt tiles: J, X
		this.tiles.add(new Tile('J'));
		this.tiles.add(new Tile('X'));
		
		// 10-pt tiles: Q, Z
		this.tiles.add(new Tile('Q'));
		this.tiles.add(new Tile('Z'));
	}
	
	/**
	 * Answers the existential question of "is this bag empty?"
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		return this.tiles.isEmpty();
	}
	
	/**
	 * Draws and removes a random tile from the bag
	 * @return the removed tile
	 * @throws EmptyTileBagException if the bag is empty
	 */
	public Tile drawTile() throws EmptyTileBagException	{
		if (this.isEmpty()) {
			throw new EmptyTileBagException();
		}
		
		int size = this.tiles.size();
		int index = this.rand.nextInt(size);
		Tile patsy = this.tiles.remove(index);
		return patsy;
	}
}
