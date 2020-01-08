package com.anthill;

import java.util.List;
import java.util.Scanner;

import com.anthill.entities.Ant;
import com.anthill.entities.Queen;
import com.anthill.utils.MapManager;

public class Application {
	
	private static MapManager mapManager = MapManager.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wStr, hStr;
		int w, h;
		
		//initMap
		mapManager.initMap();
		mapManager.newLine(2);
		w = mapManager.getWidth();
		h = mapManager.getHeight();
		
		mapManager.drawMap(w, h);
		
		//create quaens and set properties
		Queen q1 = (Queen) Ant.createAnt(0);
		q1.setColor("RED");
		q1.setBadge();
		q1.setX(1);
		q1.setY(1);
		
		Queen q2 = (Queen) Ant.createAnt(0);
		q2.setColor("GREEN");
		q2.setBadge();
		q2.setX(w-2);
		q2.setY(h-2);
		
		mapManager.printAntOnMap(q1);
		mapManager.printAntOnMap(q2);
		
		mapManager.newLine(2);
		mapManager.drawMap(w, h);
		
		mapManager.newLine(2);
		
		mapManager.getMapField().put(q1, q1.getCoordinate());
		mapManager.getMapField().put(q2, q2.getCoordinate());
		//System.out.print(mapManager.getMapField().get(q2).getX()+" "+mapManager.getMapField().get(q2).getX());
		
		//create queen child:
		q1.giveBirth();
		mapManager.initQueenChilds(q1, 1);
		
		q2.giveBirth();
		mapManager.initQueenChilds(q2, -3);
		
		mapManager.newLine(2);
		mapManager.drawMap(w, h);
		
		mapManager.newLine(2);
		
		//simulation loop:
		/*
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("tour nb: "+i);
			
			for(Ant child: q1.getChilds()) {
				
				//generate random X,Y and check if this position is free:
				int randX = mapManager.randNumber(1, w-1);
				int randY = mapManager.randNumber(1, h-1);
				
				if(mapManager.isEmpty(randX, randY)) {
					System.out.println("The space: ["+randX+"] "+"["+randY+"] is empty");
					//set the new position and print on map
					child.setX(randX);
					child.setY(randY);
					mapManager.printAntOnMap(child);
				}else {
					System.out.println("not empty this space contain: "+mapManager.getMap()[randX][randY]);
					
					//set the previous position and print on map:
					child.setX(child.getX());
					child.setY(child.getY());
					mapManager.printAntOnMap(child);	
				}
				
			}
			
			mapManager.drawMap(w, h);
		}*/
	}

}
