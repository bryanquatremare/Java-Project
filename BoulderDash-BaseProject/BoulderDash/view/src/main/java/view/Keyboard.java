package view;

/**
 * <h1>The Class Keyboard allow the program to receive instructions from the user.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

import java.awt.event.KeyEvent;

import model.IModel;

public class Keyboard extends ViewFacade{

	static KeyEvent keyEvent;	
	
	/**
	 * Utilization of keycode and keyevent to receive the user's orders.
	 * @param keyCode
	 */
	static void keyCode(int keyCode)
	{

		switch (keyCode) {
			case KeyEvent.VK_Z:
				System.out.println("Up");
				userOrder('u');
				break;
			case KeyEvent.VK_Q:
				System.out.println("Left");
				userOrder('l');
				break;
			case KeyEvent.VK_S:
				System.out.println("Down");
				userOrder('d');
				break;
			case KeyEvent.VK_D:
				System.out.println("Right");
				userOrder('r');
				break;
		}
	}
	
	/**
	 * Simple constructor reusing the model from ViewFacade.
	 * @param model
	 */
	public Keyboard(IModel model) {
		super(model);
		// TODO Auto-generated constructor stub
	}
}
