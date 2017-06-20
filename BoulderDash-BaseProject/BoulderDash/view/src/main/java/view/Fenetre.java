package view;

import javax.swing.JFrame;

public class Fenetre extends JFrame
{
	
	private Panneau pane = new Panneau();
	
	public Fenetre()
	{
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1600, 1200);
	this.setVisible(true);
	this.setContentPane(pane);
	}
}
