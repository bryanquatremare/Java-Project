package model;

/**
 * <h1>The Class Enemy provides a few methods for the enemy's movements.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

public class Enemy extends Moving{

	
	/** Movement of enemy witch only turn left**/
	public void moveMobLeft(int x, int y, char map[][]){
		if(map[y][x-32] == 4){
			moveLeft(y, x, map);
		}
		else if (map[y-32][x] == 4){
			moveUp(y, x, map);
		}
		else if (map[y][x+32] == 4){
			moveRight(y, x, map);
		}
		else if (map[y+32][x] == 4){
			moveDown(y, x, map);
		}
	}
	/** Movement of enemy witch only turn right**/
	public void moveMobRight(int x, int y, char map[][]){
		if(map[y][x+32] == 4){
			moveRight(y, x, map);
		}
		else if(map[y-32][x] == 4){
			moveUp(y, x, map);
		}
		else if(map[y][x-32] == 4){
			moveLeft(y, x, map);
		}
		else if(map[y+32][x] == 4){
			moveDown(y, x, map);
		}
	}

	/**enemy's explosion**/
	public void kaBoom(int x, int y, char map[][]){
		if(map[y-32][x] == 2 || map[y-32][x] == 5){
			map[y-32][x] = 5;
			map[y-32][x+32] = 5;
			map[y][x-32] = 5;
			map[y+32][x+32] = 5;
			map[y+32][x] = 5;
			map[y+32][x-32] = 5;
			map[y][x+32] = 5;
			map[y-32][x-32] = 5;
			map[y][x] = 5;
		}
	}

}
