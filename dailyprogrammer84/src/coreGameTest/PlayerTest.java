package coreGameTest;

import static org.junit.Assert.*;

import org.junit.Test;

import coreGame.Map;
import coreGame.Player;

public class PlayerTest {

	@Test
	public void testSetPlayer() {
		Map arrayTest = new Map();
		Player player1 = new Player();
		arrayTest = player1.setPlayer(arrayTest);
		int count3 = 0;
		for(int count = 0; count <= 99; count++){
			for(int count2 = 0; count2 <= 99; count2++){
				if(arrayTest.mapArray[count][count2] == 1){
					
					count3++;
				}
				
			}
			
		}
		assertEquals(2, count3);
	}

}
