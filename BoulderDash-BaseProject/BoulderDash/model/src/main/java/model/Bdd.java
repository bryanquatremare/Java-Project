package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bdd extends Dimension{
		
	
	public Bdd(Dimension dimension) {
		super(dimension);
		// TODO Auto-generated constructor stub
	}

	public static Connection DBConnexion(String user, String password){
		String url = "jdbc:mysql://10.176.131.110/Java_Project";		/** The login. */
	    //String user = "Ludo";
	    //String password = "lhermine";
	    Connection connection = null;
	    
	    try
	    {	// on se connecte
	    	connection = DriverManager.getConnection(url, user, password);
	    } catch (SQLException e)
	    {
	    	
	    } finally 
	    {
	    	//if (connexion != null)
	    	//{
	    	//	try
	    	//	{
	    	//		connexion.close();
	    	//	} catch (SQLException ignore)
	    	//	{
	    			
	    		}
	    	
	  return connection;
	}
	
	public static char[][] getMap() throws SQLException
	{
		Connection con = DBConnexion("Ludo","lhermine");
		Statement state = con.createStatement();
		String query = "CALL getMap();";
		
		//PreparedStatement stat = con.prepareStatement("SELEC Map FROM Maps WHERE UsedMap = 1;");
		ResultSet resultat = state.executeQuery(query);
    	String mapString = null;
    	while (resultat.next()){
    	mapString = resultat.getString("Map");
    	}
    	int n = 0;
        char map[][] = new char[992][992];
        // on récupère la string de la map
        // Map 1

        // on initialise la variable contenant le bloc actuel on lui attribant le caractère numéro 1 de la chaîne
        char block = mapString.charAt(n);
        int x = 0, y = 0;
        // pour y=0 qu'on incrémente de 32 à chaque passage (on avance d'un bloc)
        for(y=0; y <= 928; y+=32)
        {
            for(x=0; x <= 928; x+=32)

                    map[y][x] = block;

                // on passe au caractère d'après de la string si on est pas à la fin
                if(n==899)
                    n=0;
                else
                    n++;
                block = mapString.charAt(n);

        }
        if (state != null)
        {
        	try
        	{
        		state.close();
        	} catch (SQLException ignore)
        	{
        		
        	}
        }
        if (con != null)
	    	{
	    		try
	    		{
	    			con.close();
	    		} catch (SQLException ignore)
	    		{
	    			
	    		}

	    	}
        return map;	
	}
}