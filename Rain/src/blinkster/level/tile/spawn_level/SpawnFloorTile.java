package blinkster.level.tile.spawn_level;

import blinkster.graphics.Screen;
import blinkster.graphics.Sprite;
import blinkster.level.tile.Tile;

public class SpawnFloorTile extends Tile {

	public SpawnFloorTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
}
