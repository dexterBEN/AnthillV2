package com.anthill.utils;
import static org.junit.Assert.*;
import org.junit.Test;

public class MapManagerTest {
	
	public MapManagerTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void singletonShouldNotNull() {
		
		// Given
		//Inputs du test+ mock(input to provide for the test)
		
		// When
		//test(test to perform)
		MapManager mapManager = MapManager.getInstance();
		
		// Then
		//Assert (what is expected to the result)
		assertNotNull(mapManager);
	}

	@Test
	public void testIsEmpty() {
		//fail("Not yet implemented");
		MapManager mapManager = MapManager.getInstance();
		mapManager.initMap();
		assertEquals(true, mapManager.isEmpty(1, 1));
		
	}
	
	/*@Test
	public void should_dosomething2 () {
		// Given
		//Inputs du test+ mock
		MapManager mapManager = MapManager.getInstance();
		//definition Mock input
		mapManager.setConfigurer
		// When
		//test
		mapManager.initMap();
		// Then
		//Assert
		assertEquals(true, mapManager.isEmpty(1, 1));
		
	}*/
	
	/*@Test
	public void testRandNumber() {
		int max = 18;
		int min = 8;
		MapManager mapManager = MapManager.getInstance();
		int randomNb = mapManager.randNumber(min, max);
		boolean expected = (randomNb > min ? true : false) && (randomNb < max ? true : false);
		assertEquals(expected, mapManager.randNumber(min, max));
	}*/
	
}
