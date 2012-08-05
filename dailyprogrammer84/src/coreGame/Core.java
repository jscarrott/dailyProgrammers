package coreGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Core {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("You awaken.");
		System.out.println("You slowly regain vision, you are naked except for your trusty compass - leading you ever onwards.");
		Map map = new Map();
		Player player1 = new Player();
		Compass compass = new Compass();
		map = player1.setPlayer(map);
		System.out.println(compass.findWay(map));
		while(compass.scalarDist != 0){
			System.out.println("Which way should you go?");
			try{
			    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			    String s = bufferRead.readLine();
			    map = player1.movePlayer(s, map);
			    
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			System.out.println(compass.findWay(map));
		}
		System.out.println("You find your bed! Horray!");
	}

}
