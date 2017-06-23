package model;

/**
 * <h1>The Class Mineral provides a few movement's for the Mobile's Minerals.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

public class Mineral extends Moving{

	/**Movement of gravity on rock or diamond **/
	public void MoveMasse(int x, int y, char map[][]){
		if(map[y+32][x] == 4){
			moveDown(y, x, map);
		}
	}
	
	/**Movement of gravity on rock or diamond if an other rock or diamond is under the object**/
	public void moveMasseDrunk(int x, int y, char map[][]){
		if((map[y+32][x] == 2 || map[y+32][x] == 5) && (map[y][x-32] == 4 && map[y-32][x-32] == 4)){
			moveLeft(y, x, map);
			moveDown(y, x, map);
		}
		else 
		if((map[y+32][x] == 2 || map[y+32][x] == 5) && (map[y][x+32] == 4 && map[y-32][x+32] == 4)){
			moveRight(y, x, map);
			moveDown(y, x, map);
		}
	}
}
