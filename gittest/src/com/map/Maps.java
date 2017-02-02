package com.map;

public class Maps {

	// length is x
	private int length;
	// width is y
	private int width;
	
	private Cell[][] tiles;	
	private int difficultyLevel;
	
	
	
	
	
	
	
	
	
	// getters and setters
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Cell[][] getTiles() {
		return tiles;
	}
	public void setTiles(Cell[][] tiles) {
		this.tiles = tiles;
	}
	public int getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	} 
	
	
}
