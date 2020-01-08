package com.anthill.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapManagerTest {
	
	@Test
	public void testGetInstance() {
		MapManager mapManager = MapManager.getInstance();
		assertNotNull(mapManager);
	}

	@Test
	public void testIsEmpty() {
		//fail("Not yet implemented");
		MapManager mapManager = MapManager.getInstance();
		mapManager.initMap();
		assertEquals(true, mapManager.isEmpty(1, 1));
		
	}
	
	
	@Test
	public void testRandNumber() {
		int max = 18;
		int min = 8;
		MapManager mapManager = MapManager.getInstance();
		int randomNb = mapManager.randNumber(min, max);
		boolean expected = (randomNb > min ? true : false) && (randomNb < max ? true : false);
		assertEquals(expected, mapManager.randNumber(min, max));
	}
	
}
