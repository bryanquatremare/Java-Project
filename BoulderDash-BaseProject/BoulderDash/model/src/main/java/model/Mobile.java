package model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;


public class Mobile implements IMobile{

	private static final String Motionless = null;
	private static final String Dirt = null;
	private static final String Space = null;
	private Direction direction;
	private Position position;
	private Dimension dimension;

	
	public int speed;
	private int width;
	private int height;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	
	public Direction getDirection(){
		
	return direction;
	}
	
	public void setDirection(Direction direction){
		
	}
	
	public Position getPosition1(){
	
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
	
	public int getHeight(){
		return height;
		
	}
	
	public void move(){
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public void moveUp(){
		if(Motionless == Dirt || Motionless == Space){
			int y = 1;
		}
	}
	
	public void moveRight(){
		if(Motionless == Dirt || Motionless == Space){
			
		}
	}
	
	public void moveDown(){
		if(Motionless == Dirt || Motionless == Space){
			
		}
	}
	
	public void moveLeft(){
		if(Motionless == Dirt || Motionless == Space){
			
		}
	}
	
	public Color getColor(){
		return null;
		
	}
	
	public IModelFacade getModelFacade(){
		return null;
		
	}
	
	public void setModelFacade(IModelFacade modelFacade){
		
	}
	
	public boolean hit(){
		return false;
		
	}
	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	public boolean isRock(int rock){
		return false;
		
	}
	
	public boolean isEnemy(int enemy){
		return false;
		
	}
	
	public boolean isDiamond(int diamond){
		return false;
		
	}
	
	public Image getImage(){
		return null;
		
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHeigth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Image getImage1() {
		// TODO Auto-generated method stub
		return null;
	}
}

