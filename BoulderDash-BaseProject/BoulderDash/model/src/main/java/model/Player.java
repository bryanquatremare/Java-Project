package model;

/**
 * <h1>The Class Player provides a few methods for the Player's movements.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

public class Player extends Moving{
	/**Initialization of the variable counting the number of recovered's diamonds **/
	int i;
	
	/**player movement toward up**/
	public void movePlayUp(int x, int y, char map[][]){
	    if(map[y-32][x] == 2 || map[y-32][x] == 4 || map[y-32][x] == 5){ 
	    	if(map[y-32][x] == 5){
	    		i = i+1;
	    	}
	    	moveUp(y, x, map);
	    }
	}
	
	/**player movement toward left**/
	public void movePlayLeft(int x, int y, char map[][]){
	    if(map[y][x-32] == 2 || map[y][x-32] == 4 || map[y][x-32] == 5){
	    	if(map[y][x-32] == 5){
	    		i = i+1;
	    	}
	    	moveLeft(y, x, map);
	    }
	}
	
	/**player movement toward right**/
	public void movePlayRight(int x, int y, char map[][]){
	    if(map[y][x+32] == 2 || map[y][x+32] == 4 || map[y][x+32] == 5){
	    	if(map[y][x+32] == 5){
	    		i = i+1;
	    	}
	    	moveLeft(y, x, map);
	    }
	}
	
	/**player movement toward down**/
	public void movePlayDown(int x, int y, char map[][]){
	    if(map[y+32][x] == 2 || map[y+32][x] == 4 || map[y+32][x] == 5){ 
	    	if(map[y+32][x] == 5){
	    		i = i+1;
	    	}
	    	moveDown(y, x, map);
	    }
	}
}