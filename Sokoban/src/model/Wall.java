package model;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends CollisionObject{

	public Wall(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		int x0 = getX() - (getWidth()/2);
		int y0 = getY() - (getHeight()/2);
		graphics.drawRect(getX(), getY(), getWidth(), getHeight());
		graphics.setColor(Color.DARK_GRAY);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}