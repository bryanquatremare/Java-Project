package model;

import java.sql.*;

public class main 
{

	public static void main(String[] args) 
	{
			String url = "jbdc:mysql://10.176.131.110/Java-Project";		/** The login. */
		    String user = "Ludo";
		    String password = "lhermine";
		    Connection connexion = null;
		    
		    try
		    {	// on se connecte
		    	connexion = DriverManager.getConnection(url, user, password);
		    	// on cr�er la table Test-JBDC avec comme attributs un id en cl� primaire et un nom
		    	//Statement statement = connexion.createStatement();
		    	//String sql = "CREATE TABLE Test-JBDC" +
		    	//			 " (id INTEGER not NULL, " +
		    	//			 "nom VARCHAR(30), "+
		    	//			 "PRIMARY KEY (id))";
		    	// on envoie la requ�te de cr�ation
		    	//statement.executeUpdate(sql);
		    	
		    	// on envoie une requ�te d'insertion de donn�es
		    	//int statut = statement.executeUpdate("INSERT INTO Test-JBDC (id, nom) VALUES (1, 'Ludoroux');");
		    	
		    	 // on fait une requ�te de lecture
		    	//ResultSet resultat = statement.executeQuery("SELECT id, nom FROM Test-JBDC;");
		    	
		    	// on fait un boucle pour r�cup�rer chaque lignes de r�sultat (� faire uniquement si il y'a plusieurs lignes)
		    	//while (resultat.next())
		    	//{
		    		// on rentre le premier id dans une variable id et le premier nom dans une variable nom
		    	//	int id = resultat.getInt("id");
		    	//	String nom = resultat.getString("nom");
		    		
		    	//	System.out.println("Salut � toi utilisateur n�" + id + " ! Ton nom est " + nom + " !");
		    	//}
		    	ResultSet resultat = Statement.executeQuery("SELECT Map FROM Maps WHERE UsedMap = 1;");
		    	
		    	ResultSet result;
				while (result.next()){
		    		String Map = resultat.getString("Map");
		    	}
		    } catch (SQLException e)
		    {
		    	
		    } finally 
		    {
		    	if (connexion != null)
		    	{
		    		try
		    		{
		    			connexion.close();
		    		} catch (SQLException ignore)
		    		{
		    			
		    		}
		    	}
		    }
	}
}