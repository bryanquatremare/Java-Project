package view;

/**
 * <h1>The Class Keyboard allow the program to receive instructions from the user.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

import javax.swing.JFrame;
import controller.IController;
import model.IModel;

import java.awt.event.KeyEvent;

public class Window extends JFrame
{
	public static IController controller;
	/**
	 * Initialization of a Panel.
	 */
	private static ContPane pane;
	KeyEvent keyEvent;
	int keyCode;
	
	/**
	 * Window's constructor which is setting all parameters of the window
	 * @param model
	 */
	public Window(IModel model)
	{
		this.pane = new ContPane(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(965, 988);
		this.setResizable(false);
		this.setTitle("Boulder Da$h");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		while(true)
		{
			this.setContentPane(pane);
			keyCode = keyEvent.getKeyCode();
			Keyboard.keyCode(keyCode);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * A getter returning the panel for the drawimage function in the ContPane class.
	 * @return
	 */
	public static ContPane getPane()
	{
		return pane;
	}
}