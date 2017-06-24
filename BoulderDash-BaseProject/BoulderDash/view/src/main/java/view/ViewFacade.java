package view;


import javax.swing.JFrame;

import controller.IController;
import model.IModel;

/**
 * <h1>The Class ViewFacade Implements IView and instantiate a new Frame for the render.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

public class ViewFacade implements IView
{
	static JFrame frame;
	public static IController controller;
	public Keyboard keyboard;
		
    /**
     * ViewFacade's constructor used to instantiate a new frame and a new window.
     * @param model
     */
    public ViewFacade(IModel model)
    {
    	frame = new JFrame();  
		new Window(model);
    }
    
    /**
     * method userOrder is receiving instructions from the keyboard's class and sending it to the controller.
     * @param dir
     */
    public static void userOrder(char dir)
    {
    	controller.userOrder(dir);
    }

}