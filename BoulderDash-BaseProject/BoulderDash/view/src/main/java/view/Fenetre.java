package view;

import javax.swing.JFrame;

public class Fenetre extends JFrame
{
	
	private static Panneau pane = new Panneau();
	
	public Fenetre()
	{
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(976, 999);
	//this.setSize(1080, 1200);
	//this.
	this.setVisible(true);
	this.setContentPane(pane);
	}
	
	public static Panneau getPane()
	{
		return pane;
	}
}
