package model;

/**
 * <h1>The Class Moving provides a few method's for the method's of all the daugther's class.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

public class Moving extends ModelFacade{

		/**movement up of the object  **/
	  public char[][] moveUp(int x, int y, char map[][]){ 
		      char block = map[y][x]; 
		      map[y][x] = '4';
		      map[y-32][x] = block; 
		    
		    return map; 
		  } 
		/**movement to the right of the object**/
		  public char[][] moveRight(int x, int y, char map[][]){ 

		      char block = map[y][x]; 
		      map[y][x] = '4'; 
		      map[y][x+32] = block; 
		    
		    return map;
		  } 
		   
		  /**movement down of the object**/
		  public char[][] moveDown(int x, int y, char map[][]){ 

		    char block = map[y][x]; 
		    map[y][x] = '4'; 
		    map[y+32][x] = block; 
		    
		    return map;
		  } 
		   /**movement to the left of the object**/
		  public char[][] moveLeft(int x, int y, char map [][]){ 

		    char block = map[y][x]; 
		    map[y][x] = '4'; 
		    map[y][x-32] = block; 
		    
		    return map;
		  } 

}
