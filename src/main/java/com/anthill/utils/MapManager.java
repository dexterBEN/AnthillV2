package com.anthill.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import com.anthill.entities.Ant;
import com.anthill.entities.Coordinate;
import com.anthill.entities.Queen;
import com.sun.javafx.collections.MapAdapterChange;

public class MapManager {
	
	private int width;
	private int height;
	private Map<Ant, Coordinate> mapField = new HashMap<>();
	protected boolean isFree = false;
	private String RED =  "\u001b[31m";
	private String GREEN = "\033[32m";
	private String WHITE = "\u001b[0m";
	private String mapArray[][];
	
	private UserManager userManager = new UserManager();	
	private static final MapManager singletonInstance;
	
	static {
		singletonInstance = new MapManager();
	}
	
	public static MapManager getInstance(){
		return singletonInstance;
	}
	
	public String [][] getMap(){
		return mapArray;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Map<Ant, Coordinate> getMapField(){
		return mapField;
	}
	
	public void initMap() 
	{
		userManager.setMapSize();
		width = userManager.getWidth();
		height = userManager.getHeight();
		mapArray = new String [width][height];
		 
		 for(int i = 0; i < width; i++) 
		 {
			for(int j = 0; j < height; j++) 
			{
				if( (i > 0 && i < (width-1)) && (j > 0 && j < (height-1))) 
				{
					mapArray[i][j] = "  ";
				}else {
					mapArray[i][j] = "* ";
				}
			}
		}
	}
	
	public void drawMap(int w, int h) {
		for(int i = 0; i < w; i++) {
			for(int j = 0; j < h; j++){
				System.out.print(mapArray[i][j]);
			}
				System.out.println();
		}
		
	}
	
	public void printAntOnMap(Ant ant) {
		
		switch(ant.getColor()) {
			case "RED":
				mapArray[ant.getX()][ant.getY()] = RED + ant.getBadge() + WHITE;
				break;
			case "GREEN":
				mapArray[ant.getX()][ant.getY()] = GREEN + ant.getBadge() + WHITE;
				break;
		}
	}
	
	public void initQueenChilds(Queen queen, int step) {
		for(Ant child: queen.getChilds()) 
		{
			child.setBadge();
			child.setColor(queen.getColor());
			child.setX(queen.getX());
			child.setY(queen.getY()+step);
			printAntOnMap(child);
			step++;
		}
	}
	
	public boolean isEmpty(int x, int y) {
		isFree = mapArray[x][y] == "  " ? true : false ;
		return isFree;
	}
	
	public static void newLine(int i) {
		for(int j = 0; j < i; j++) {
			System.out.println();
		}
	}
	
	public static int randNumber(int min, int max) 
	{
		Random randInt = new Random();
		return randInt.nextInt((max - min) + 1) + min;
	}
	
}
