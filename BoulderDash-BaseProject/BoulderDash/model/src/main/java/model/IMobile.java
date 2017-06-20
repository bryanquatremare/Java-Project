package model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	
	public Direction getDirection();
	
	public void setDirection(Direction direction);
	
	public Point getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeigth();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);
	
	public boolean isPlayer(boolean player);

	public void setModelFacade(IModel modelFacade);
	
	public IModel getModelFacade();

	public boolean hit();
	
	public boolean isRock(boolean rock);
	
	public boolean isDiamond(boolean diamond);
	
	public boolean isEnemy(boolean enemy);

}