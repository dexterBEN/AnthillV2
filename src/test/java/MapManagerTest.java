import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.anthill.utils.MapManager;

class MapManagerTest {
	
	@Test
	void testGetInstance() {
		MapManager mapManager = MapManager.getInstance();
		
		assertNotNull(mapManager, "Error: Object is null");
	}

	@Test
	void testIsEmpty() {
		//fail("Not yet implemented");
		MapManager mapManager = MapManager.getInstance();
		mapManager.initMap();
		assertEquals(true, mapManager.isEmpty(1, 1));
		
	}
	
	
	@Test
	void testRandNumber() {
		int max = 18;
		int min = 8;
		MapManager mapManager = MapManager.getInstance();
		int randomNb = mapManager.randNumber(min, max);
		boolean expected = (randomNb > min ? true : false) && (randomNb < max ? true : false);
		assertEquals(expected, mapManager.randNumber(min, max));
	}
	
}
