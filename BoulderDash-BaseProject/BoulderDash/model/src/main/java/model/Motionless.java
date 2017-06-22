package model;

import java.awt.Color;
import java.awt.Image;

public class Motionless implements IMotionless{
	
	private Position position;
	private Dimension dimension;
	
	private int width;
	private int height;
	
	public Motionless(Position position, Dimension dimension, String image){
		
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
	
	public Position getPosition1(){
		
		return position;
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
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}