package coreGame;

public class Map {
	public int[][] mapArray;

	public Map() {
		mapArray = new int[100][100];
		double pos = Math.random() * 100;
		double pos2 = Math.random() * 100;
		mapArray[(int) pos][(int) pos2] = 1;

	}

	public int[][] findPositions() {
		int[][] ret = new int[2][2];
		int count3 = 0;
		while(count3 != 2) {
			for (int count = 0; count <= 99; count++) {
				for (int count2 = 0; count2 <= 99; count2++) {
					if (mapArray[count][count2] == 1) {

						ret[0][0] = count;
						ret[0][1] = count2;

						count3++;

					}
					if (mapArray[count][count2] == 2) {

						ret[1][0] = count;
						ret[1][1] = count2;
						count3++;
					}
				}

			}
		}
		return ret;

	}

}
