package model;

import java.awt.Image;

public interface IMobile {

	
	public Direction getDirection();
	
	public void setDirection(Direction direction);
	
	public Position getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeigth();
	
	public int getSpeed();
	
	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);
	
	public boolean isPlayer(int player);

	public void setModelFacade(IModelFacade modelFacade);

	public boolean hit();
	
	public boolean isRock(int rock);
	
	public boolean isDiamond(int diamond);
	
	public boolean isEnemy(int enemy);

	Image getImage1();

}