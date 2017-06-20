package model;


import java.awt.Color;
import java.awt.Image;
import java.awt.Point;


public class Mobile implements IMobile{

	protected static Direction direction;
	protected static Point position;
	protected static Dimension dimension;

	
	public int speed;
	private int width;
	private int height;
	
	public Mobile(Direction direction, Point position, Dimension dimension, String image){
		
	}
	
	public Direction getDirection(){
		
	return direction;
	}
	
	public void setDirection(Direction direction){
		
	}
	
	public Point getPosition(){
	
		return position;
	}
	
	public Dimension getDimension(){
		
		return dimension;
	}
	
	public int getSpeed(){
		return speed;
		
	}
	
	public int getWidth(){
		return width;
		
	}

	
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public void moveUp(){
		
	}
	
	public void moveRight(){
		
	}
	
	public void moveDown(){
		
	}
	
	public void moveLeft(){
		
	}
	
	public Color getColor(){
		return null;
		
	}
	
	public IModel getModelFacade(){
		return null;
		
	}
	@Override
	public void setModelFacade(IModel modelFacade){
		
	}
	@Override
	public boolean hit(){
		return false;
		
	}
	@Override
	public boolean isPlayer(boolean player){
		return player;
		
	}
	@Override
	public boolean isRock(boolean rock){
		return rock;
		
	}
	@Override
	public boolean isEnemy(boolean enemy){
		return enemy;
		
	}
	@Override
	public boolean isDiamond(boolean diamond){
		return diamond;
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeigth() {
		// TODO Auto-generated method stub
		return height;
	}

}

