package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */
public class ModelFacade implements IModel 
{
	/**
	 * Initialization of mapString, a String which is going to contain the entire map (as a String). 
	 */
	private static String mapString = null;
	
	/**
	 * Initialization of map which is going to contain the entire map as a 2D array and with a constant size of 992 by 992.
	 */
	private static char map[][] = new char[992][992];
		
	/**
	 * The method buildTab which have to fill the 2D array map with the content of the mapString String.
	 * That String is previously filled with a String from the database recordings.
	 */
	public static void buildTab()
	{
		Connection con = null;
	    Statement state = null;
	    try
	    {	// on se connecte
	    	con = DriverManager.getConnection("jdbc:mysql://10.176.131.110/Java_Project", "Ludo", "lhermine");
			state = con.createStatement();
			String query = "CALL getMap();";
			ResultSet resultat = state.executeQuery(query);
			while (resultat.next()){
			mapString = resultat.getString("Map");
			int n = 0;
		    char block = mapString.charAt(n);
		    int x = 0, y = 0;
		    for(y=0; y <= 928; y+=32)
		    {
		        for(x=0; x <= 928; x+=32)
		        {
		                map[y][x] = block;
		            if(n==899)
		            n=0;

		            else
		                n++;
		            block = mapString.charAt(n);
		    }
	    }
		}

	    } catch (SQLException e)
	    {
	    	
	    }
	}
	
	/**
	 * That getter is here to allow other classes to recover the new 2D array previously filled.
	 */
	public char[][] getMap()
	{
	    return this.map;
	}
	    
	

    /**
     * Instantiates a new model facade.
     * is calling buildTab.
     */
    public ModelFacade() {
    	
        
        buildTab();
    }

}
