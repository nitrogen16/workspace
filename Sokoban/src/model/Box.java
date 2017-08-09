package model;

import java.awt.Color;
import java.awt.Graphics;

public class Box extends CollisionObject implements Movable{

	public Box(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics graphics) {
		int x0 = getX() - (getWidth()/2);
		int y0 = getY() - (getHeight()/2);
		graphics.drawRect(getX(), getY(), getWidth(), getHeight());
		graphics.setColor(Color.ORANGE);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}

	@Override
	public void move(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
	}

}
