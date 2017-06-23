package view;

/**
 * <h1>The Class ContPane provides the content for the window to render.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import controller.IController;
import model.IModel;

public class ContPane extends JPanel 
{
	/**
	 * Initialize the model to allow us to use the ContPane method which is asking for a model in arguments
	 */
	public static IModel model;

	/**
	 * method paintComponent building the content to render in the window.
	 */
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        BufferedImage spriteSheet = null;
		try {
			spriteSheet = ImageIO.read(new File("../res/Sprites/74359.png"));
	        char map[][] = new char[992][992];
	        // on récupère le tableau de la map
	        map = model.getMap();
	       
			int Ix = 0;
			for(int j = 0; j <= 928; j+=32)
			{
				for (int i = 0; i <= 928; i+=32)
				{
					switch(map[j][i])
					{
					case '0': //Limit
						Ix = 0;
						break;
					case '1': //Dirt
						Ix = 16;
						break;
					case '2': //Rock
						Ix = 48;
						break;
					case '3': //Player
						Ix = 80;
						break;
					case '4': //Void
						Ix = 32;
						break;
					case '5': //Diamond
						Ix = 64;
						break;
					case '6': //Wall
						Ix = 96;
						break;
					case '7': //Mob go right
						Ix = 160;
						break;
					case '8': //Mob go left
						Ix = 144;
						break;
					case '9': //Exit
						Ix = 112;
						break;
					}
					g.drawImage(spriteSheet, i, j, i+32, j+32, Ix, 0, Ix+16, 16, Window.getPane());
				}
			}
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	ContPane(IModel model){
		this.model = model;
		
	}
}	