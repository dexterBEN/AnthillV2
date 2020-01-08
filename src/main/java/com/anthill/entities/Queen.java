package com.anthill.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Queen extends Ant{
	
	List <Ant> child = new ArrayList<Ant>();
	
	public Queen() {
		this.setId(UUID.randomUUID());
	}
	
	public List<Ant> getChilds(){
		return child;
	}
	
	public List<Ant> giveBirth(){
		
		int n = 0;
		Random randInt = new Random();
		
		child.add(createAnt(1));
		child.add(createAnt(2));
		
		n = randInt.nextInt((2 - 1) + 1) + 1;
		child.add(createAnt(n));
		
		return child;
	}
	
	public void setBadge() {
		this.badge = "Q ";
	}

}
