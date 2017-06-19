package model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Motionless implements IMotionless{
	
	protected static Point position;
	protected static Dimension dimension;
	
	private int width;
	private int height;
	
	public Motionless(Point position, Dimension dimension, String image){
		
	}
	
	public int getWidth(){
		return width;
		
	}
	
	public int getHeight(){
		return height;
		
	}
	
	public boolean hit(){
		return false;
		
	}
	
	public void placeInArea(IArea area){
		
	}
	
	public Dimension getDimension(){
		
		return dimension;
	}
	
	public IModelFacade getModelFacade(){
		return null;
		
	}
	
	public void setModelFacade(IModelFacade modelFacade){
		
	}
	
	public Color getColor(){
		return null;
		
	}
	
	public boolean isWall(int Wall){
		return false;
		
	}
	
	public boolean isDirt(int Dirt){
		return false;
		
	}
	
	public boolean isSpace(int Space){
		return false;
		
	}
	
	public boolean isDoor(int Door){
		return false;
		
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}