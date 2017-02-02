package com.map;

public class Cell {
	
	private int row;
	private int col;
	private TileType tileType;

	// methods
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear();
	}
	
	
	public void clear() {
		tileType = TileType.EMPTY;
	}
	
	public void paint() {
		switch (tileType) {
		case CHEST:
			break;
		case EMPTY:
			break;
		case ENTRANCE:
			break;
		case EXIT:
			break;
		case MONSTER:
			break;
		case PATH:
			break;
		case WALL:
			break;
		default:
			break;
		}
		
	}
	
}
