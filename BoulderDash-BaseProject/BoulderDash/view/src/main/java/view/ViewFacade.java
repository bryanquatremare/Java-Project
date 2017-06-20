package view;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView 
{

	
	public static void main(String[] args) throws IOException 
	{
		JFrame frame = new JFrame();  
		Fenetre win = new Fenetre();
	}
	
	
    
    public ViewFacade()
    {
    	
    }


    @Override
    public final void displayMessage(final String message) 
    {
        JOptionPane.showMessageDialog(null, message);
    }

}
