package main;

import java.awt.Color;

public class Tile {
	
	int value;

	public Tile(int value) {
		super();
		this.value = value;
	}

	public Tile() {
		super();
		this.value = 0;
	}
	
	public boolean isEmpty() {
		if(value == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public Color getFontColor() {
		if(value < 16) {
			return Color.decode("0x776e65");
		}else {
			return Color.decode("0xf9f6f2");
		}
	}
	
	public Color getTileColor() {
		switch(value) {
		case 0:
			return Color.decode("0xcdc1b4");
		case 2:
			return Color.decode("0xeee4da");
		case 4:
			return Color.decode("0xede0c8");
		case 8:
			return Color.decode("0xf2b179");
		case 16:
			return Color.decode("0xf59563");
		case 32:
			return Color.decode("0xf67c5f");
		case 64:
			return Color.decode("0xf65e3b");
		case 128:
			return Color.decode("0xedcf72");
		case 256:
			return Color.decode("0xedcc61");
		case 512:
			return Color.decode("0xedc850");
		case 1024:
			return Color.decode("0xedc53f");
		case 2048:
			return Color.decode("0xedc22e");
		default:
			return Color.decode("0xff0000");
		}
	}
}
