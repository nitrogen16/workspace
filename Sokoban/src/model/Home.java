package model;

import java.awt.Color;
import java.awt.Graphics;

public class Home extends GameObject{

	public Home(int x, int y) {
		super(x, y);
		setWidth(2);
		setHeight(2);
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		int x0 = getX() - (getWidth()/2);
		int y0 = getY() - (getHeight()/2);
		graphics.drawRect(getX(), getY(), getWidth(), getHeight());
		graphics.setColor(Color.RED);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
