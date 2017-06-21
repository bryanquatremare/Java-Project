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

	public static Connection DBConnexion(String url, String user, String password){
		//String url = "jbdc:mysql://10.176.131.110/Java-Project";		/** The login. */
	    //String user = "Ludo";
	    //String password = "lhermine";
	    Connection connection = null;
	    
	    try
	    {	// on se connecte
	    	connection = DriverManager.getConnection(url, user, password);
	    	/**
	    	// on créer la table Test-JBDC avec comme attributs un id en clé primaire et un nom
	    	//Statement statement = connexion.createStatement();
	    	//String sql = "CREATE TABLE Test-JBDC" +
	    	//			 " (id INTEGER not NULL, " +
	    	//			 "nom VARCHAR(30), "+
	    	//			 "PRIMARY KEY (id))";
	    	// on envoie la requête de création
	    	//statement.executeUpdate(sql);
	    	
	    	// on envoie une requête d'insertion de données
	    	//int statut = statement.executeUpdate("INSERT INTO Test-JBDC (id, nom) VALUES (1, 'Ludoroux');");
	    	
	    	 // on fait une requête de lecture
	    	//ResultSet resultat = statement.executeQuery("SELECT id, nom FROM Test-JBDC;");
	    	
	    	// on fait un boucle pour récupérer chaque lignes de résultat (à faire uniquement si il y'a plusieurs lignes)
	    	//while (resultat.next())
	    	//{
	    		// on rentre le premier id dans une variable id et le premier nom dans une variable nom
	    	//	int id = resultat.getInt("id");
	    	//	String nom = resultat.getString("nom");
	    		
	    	//	System.out.println("Salut à toi utilisateur n°" + id + " ! Ton nom est " + nom + " !");
	    	//}
	    	//ResultSet resultat = Statement.executeQuery("SELECT Map FROM Maps WHERE UsedMap = 1;");
	    	
	    	//while (resultat.next()){
	    	//	String Map = resultat.getString("Map");
	    	//}**/
	    } catch (SQLException e)
	    {
	    	
	    } finally 
	    {
	    	/**if (connexion != null)
	    	{
	    		try
	    		{
	    			connexion.close();
	    		} catch (SQLException ignore)
	    		{
	    			
	    		}
	    	}**/
	    }
	    return connection;
	}
	
	public static String getMap(String map) throws SQLException
	{
		Connection con = DBConnexion("jdbc:mysql://10.176.131.110/Java_Project","Ludo","lhermine");
		Statement state = con.createStatement();
		String query = "SELECT Map, Height, Width FROM Maps WHERE UsedMap = 1";
		
		//PreparedStatement stat = con.prepareStatement("SELEC Map FROM Maps WHERE UsedMap = 1;");
		ResultSet resultat = state.executeQuery(query);
    	
    	while (resultat.next()){
    	map = resultat.getString("Map");
    	}
    	return map;	
		
	}
    	
	public int getWidth(){
		
	return getWidth();
	}
	
	public int getHeigth(){
		
	return getHeigth();
	}
}