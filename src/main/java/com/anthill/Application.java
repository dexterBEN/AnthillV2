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
		//mapManager.getMapField().put(q2, q2.getCoordinate());
		//System.out.print(mapManager.getMapField().get(q2).getX()+" "+mapManager.getMapField().get(q2).getX());
		
		//create queen child:
		List <Ant> q1Childs = q1.giveBirth();
		int n = 1;
		for(Ant child: q1Childs) 
		{
			child.setBadge();
			child.setColor(q1.getColor());
			child.setX(q1.getX());
			child.setY(q1.getY()+n);
			mapManager.printAntOnMap(child);
			n++;
		}
		
		List <Ant> q2Childs = q2.giveBirth();
		n = 1;
		for(Ant child: q1Childs) 
		{
			child.setBadge();
			child.setColor(q2.getColor());
			child.setX(q2.getX());
			child.setY(q2.getY()-n);
			mapManager.printAntOnMap(child);
			n++;
		}
		
		mapManager.newLine(2);
		mapManager.drawMap(w, h);
		
		mapManager.newLine(2);
		//simulation loop:
		int randX = mapManager.randNumber(1, w-1);
		int randY = mapManager.randNumber(1, h-1);
		
		//System.out.println("Contenue de la case"+mapManager.getMap()[1][1]);
		
		if(mapManager.isEmpty(1, 1)) 
		{
			System.out.println("This space is empty");
		}else {
			System.out.println("not empty this space contain: "+mapManager.getMap()[1][1]);
		}
	}

}
