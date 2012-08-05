package coreGame;

public class Player {
	public Map setPlayer(Map map){
		double pos = Math.random() * 100;
		double pos2 = Math.random() * 100;
		if(map.mapArray[(int) pos][(int) pos2] == 1){
			map.mapArray[(int) pos][(int) pos2] = 2;
		}
		else{
			pos = pos + 5;
			map.mapArray[(int) pos][(int) pos2] = 2;
		}
		return map;
	}
	
	Map movePlayer(String direction, Map map){
		int[][] buff;
		buff = map.findPositions();
		map.mapArray[buff[1][0]][buff[1][1]] = 0;
		switch (direction) {
		case "north":
			buff[1][1] = buff[1][1] + 1;
			break;
		case "south":
			buff[1][1] = buff[1][1] - 1;
			break;
		case "west":
			buff[1][0] = buff[1][0] - 1;
			break;
		case "east":
			buff[1][1] = buff[1][1] + 1;
			break;

		default:
			System.out.println("Invalid direction.");
			break;
		}
		map.mapArray[buff[1][0]][buff[1][1]] = 2;
		return map;
	}

}
