package main;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private static final int FIELD_WIDTH = 4;
	private Tile[][] gameTiles;
	int score;
	int maxTile;

	public Model() {
		super();
		resetGameTiles();
		score = 0;
		maxTile = 2;
	}

	public Tile[][] getGameTiles() {
		return gameTiles;
	}

	public void setGameTiles(Tile[][] gameTiles) {
		this.gameTiles = gameTiles;
	}

	protected void resetGameTiles() {
		gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
		for (int i = 0; i < FIELD_WIDTH; i++) {
			for (int j = 0; j < FIELD_WIDTH; j++) {
				gameTiles[i][j] = new Tile();
			}
		}
		addTile();
		addTile();
	}

	private void addTile() {
		ArrayList<Tile> emptyTiles = (ArrayList<Tile>) getEmptyTiles();
		if (!emptyTiles.isEmpty()) {
			Tile randomEmptyTile = emptyTiles.get((int) (emptyTiles.size() * Math.random()));
			randomEmptyTile.value = Math.random() < 0.9 ? 2 : 4;
		}
	}

	private List<Tile> getEmptyTiles() {
		List<Tile> emptyTiles = new ArrayList<Tile>();
		for (int i = 0; i < FIELD_WIDTH; i++) {
			for (int j = 0; j < FIELD_WIDTH; j++) {
				if (gameTiles[i][j].isEmpty()) {
					emptyTiles.add(gameTiles[i][j]);
				}
			}
		}
		return emptyTiles;
	}

	private boolean compressTiles(Tile[] tiles) {
		boolean change = false;
		for (int k = 0; k < tiles.length - 1; k++) {
			for (int i = 0; i < tiles.length - 1; i++) {
				if (tiles[i].isEmpty() && !tiles[i + 1].isEmpty()) {
					change = true;
					tiles[i] = tiles[i + 1];
					tiles[i + 1] = new Tile();
				}
			}
		}
		return change;
	}

	private boolean mergeTiles(Tile[] tiles) {
		boolean change = false;
		for (int i = 0; i < tiles.length - 1; i++) {
			if (tiles[i].value == tiles[i + 1].value && !tiles[i].isEmpty() && !tiles[i + 1].isEmpty()) {
				change = true;
				tiles[i].value *= 2;
				// compressTiles(tiles);
				tiles[i + 1] = new Tile();
				maxTile = maxTile > tiles[i].value ? maxTile : tiles[i].value;
				score += tiles[i].value;
				compressTiles(tiles);
			}
		}
		return change;
	}

	public void left() {
		boolean isChanged = false;
		for (int i = 0; i < FIELD_WIDTH; i++) {
			if (compressTiles(gameTiles[i]) || mergeTiles(gameTiles[i])) {
				isChanged = true;
			}
		}
		if (isChanged)
			addTile();
	}

	private void rotateToRight() {
		Tile tmp;
		for (int i = 0; i < FIELD_WIDTH / 2; i++) {
			for (int j = i; j < FIELD_WIDTH - 1 - i; j++) {
				tmp = gameTiles[i][j];
				gameTiles[i][j] = gameTiles[FIELD_WIDTH - j - 1][i];
				gameTiles[FIELD_WIDTH - j - 1][i] = gameTiles[FIELD_WIDTH - i - 1][FIELD_WIDTH - j - 1];
				gameTiles[FIELD_WIDTH - i - 1][FIELD_WIDTH - j - 1] = gameTiles[j][FIELD_WIDTH - i - 1];
				gameTiles[j][FIELD_WIDTH - i - 1] = tmp;
			}
		}
	}

	void right() {
		rotateToRight();
		rotateToRight();
		left();
		rotateToRight();
		rotateToRight();
	}

	void up() {
		rotateToRight();
		rotateToRight();
		rotateToRight();
		left();
		rotateToRight();
	}

	void down() {
		rotateToRight();
		left();
		rotateToRight();
		rotateToRight();
		rotateToRight();
	}
	
    public boolean canMove() {
        if(!getEmptyTiles().isEmpty()) return true;

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[i][j].value == gameTiles[i][j-1].value)
                    return true;
            }
        }
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[j][i].value == gameTiles[j-1][i]. value)return true;
            }
        }
        return false;
}
}