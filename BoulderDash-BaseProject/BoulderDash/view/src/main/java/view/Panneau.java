package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{

	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        BufferedImage image0;
		try {
			image0 = ImageIO.read(new File("C:\\Users\\cbdra\\Documents\\EXIA\\Projet\\Projet (Boulder Dash)\\74359.png"));
	        g.drawImage(image0, 0, 0, 32, 32, 0, 0, 16, 16, this);
	        g.drawImage(image0, 32, 0, 64, 32, 0, 0, 16, 16, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
