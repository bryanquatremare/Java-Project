package model;

import java.awt.Image;
import java.awt.Point;

public interface IMotionless {

	public Point getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public Image getImage();
	
	public void placeInArea(IArea area);
	
	public boolean isWall(boolean wall);
	
	public boolean isDirt(boolean dirt);
	
	public boolean isSpace(boolean space);
	
	public boolean isDoor(boolean door);
	
	public void setModelFacade(IModel modelFacade);
	
	public IModel getModelFacade();
	
	public boolean hit();
	
}
