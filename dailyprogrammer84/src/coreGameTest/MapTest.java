package coreGameTest;

import static org.junit.Assert.*;

import org.junit.Test;

import coreGame.Map;
import coreGame.Player;

public class MapTest {

	@Test
	public void test() {
		Map arrayTest = new Map();
		int count3 = 0;
		assertEquals(0, arrayTest.mapArray[0][0]);
		for(int count = 0; count <= 99; count++){
			for(int count2 = 0; count2 <= 99; count2++){
				if(arrayTest.mapArray[count][count2] == 1){
					
					count3++;
				}
				
			}
			
		}
		assertEquals(1, count3);
				
		
	}
	
	@Test
	public void testPosition(){
		Map arrayTest = new Map();
		Player player1 = new Player();
		arrayTest = player1.setPlayer(arrayTest);
		int[][] positions = arrayTest.findPositions();
		assertEquals(1, arrayTest.mapArray[positions[0][0]][positions[0][1]]);
		assertEquals(2, arrayTest.mapArray[positions[1][0]][positions[1][1]]);
	}

}
