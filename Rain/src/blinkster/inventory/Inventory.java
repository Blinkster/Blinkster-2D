package blinkster.inventory;

import java.awt.*;

import blinkster.level.tile.Tile;

public class Inventory {
	public Cell[] invBar = new Cell[Tile.invLength];
	
	public Inventory() {
		for (int i =0;i<invBar.length;i++) {
			invBar[i] = new Cell(new Rectangle(i * Tile.invCellSize,0,Tile.invCellSize,Tile.invCellSize), Tile.air);
		}
	}
	
	public void render(Graphics g) {
		for (int i =0;i<invBar.length;i++) {
			invBar[i].render(g);
		}
	}
}
