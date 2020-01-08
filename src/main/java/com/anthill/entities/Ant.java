package com.anthill.entities;

import java.util.UUID;

public abstract class Ant {
	
	private Coordinate coordinate = new Coordinate();
	private UUID id;
	protected String badge;
	private String color;
	private boolean isAlive;
	private enum ANT_TYPE{
		QUEEN,
		WORKER,
		FIGHTER
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setX(int x) {
		coordinate.setX(x);
	}
	
	public int getX() {
		return coordinate.getX();
	}
	
	public void setY(int y) {
		coordinate.setY(y);
	}
	
	public int getY() {
		return coordinate.getY();
	}
	
	public String getBadge() {
		return badge;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public static Ant createAnt(int index)
	{
		Ant ant = null;
		switch(index) 
		{
			case 0:
				ant = new Queen();
				break;
				
			case 1:
				ant = new Fighter();
				break;
				
			case 2:
				ant = new Worker();
				break;
		}
		return ant;
	}
	
	public abstract void setBadge();
	
}
