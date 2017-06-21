package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel
{

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        BufferedImage spriteSheet;
		try {
			spriteSheet = ImageIO.read(new File("..\\..\\Sprites\\74359.png"));
			buildMap(spriteSheet, g);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void buildMap(BufferedImage spriteSheet, Graphics g)
	{
		String map [] [] = controller.getMap();
		int i, j, Ix, Iy;
		for(j = 0, j < controller.getMapHeight(), j+32)
		{
			for (i = 0, i < controller.getMapWidth(), i+32)
			{
				switch(map[i] [j])
				{
				case "0": //Limit
					Ix = 0;
					Iy = Ix + 16;
					break;
				case "1": //Dirt
					Ix = 16;
					Iy = Ix + 16;
					break;
				case "2": //Rock
					Ix = 48;
					Iy = Ix + 16;
				case "3": //Player
					Ix = 555;
					Iy = Ix + 16;
					break;
				case "4": //Void
					Ix = 32;
					Iy = Ix + 16;
					break;
				case "5": //Diamond
					Ix = 64;
					Iy = Ix + 16;
					break;
				case "6": //Wall
					Ix = 96;
					Iy = Ix + 16;
					break;
				case "7": //Mob go right
					Ix = 160;
					Iy = Ix + 16;
					break;
				case "8": //Mob go left
					Ix = 144;
					Iy = Ix + 16;
					break;
				case "9": //Exit
					Ix = 112;
					Iy = Ix + 16;
					break;
				}
				pane = Fenetre.getPane();
				g.drawImage(spriteSheet, i, j, i+32, j+32, Ix, Iy, Ix+16, Iy+16, Fenetre.getPane());
			}
		}
	}
}
