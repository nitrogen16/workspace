package main;

import java.util.ArrayList;

public class Space extends BaseObject{
	private int width;
	private int height;
	private SpaceShip ship;
	private ArrayList<Ufo> ufos = new ArrayList<Ufo>();
	private ArrayList<Rocket> rockets = new ArrayList<Rocket>();
	private ArrayList<Bomb> bombs = new ArrayList<Bomb>();
	
	public static Space game;
	
	public Space(double x, double y, double radius, int width, int height) {
		super(x, y, radius);
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public SpaceShip getShip() {
		return ship;
	}
	
	public void setShip(SpaceShip ship) {
		this.ship = ship;
	}

	public ArrayList<Ufo> getUfos() {
		return ufos;
	}

	public ArrayList<Rocket> getRockets() {
		return rockets;
	}

	public ArrayList<Bomb> getBombs() {
		return bombs;
	}
	
	public void run(){
		
	}
	
	public void draw(){
		
	}

	public void sleep(int ms){
		
	}
}
