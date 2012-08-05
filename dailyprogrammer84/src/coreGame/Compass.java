package coreGame;

public class Compass {
	double scalarDist;
	String findWay(Map map){
		String sayWay;
		scalarDist = 0;
		int[][] positions= map.findPositions();
		int hor = positions[0][0] - positions[1][0];
		int ver = positions[0][1] - positions[1][1];
		if(hor > 0) sayWay = " West";
		else sayWay = " East";
		if(ver > 0) sayWay = " South" + sayWay;
		else sayWay = " North" + sayWay;
		scalarDist = Math.pow(hor, 2) + Math.pow(ver, 2);
		scalarDist = Math.sqrt(scalarDist);
		sayWay = scalarDist + " Meters" + sayWay; 
		return sayWay;		
	}

}
