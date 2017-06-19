
public interface IMotionless {

	public Point getPosition();
	
	public Dimension getDimension();
	
	public int getWidth();
	
	public int getHeight();
	
	public Image getImage();
	
	public void placeInArea(IArea area);
	public boolean isWall(int wall);
	
	public boolean isDirt(int dirt);
	
	public boolean isSpace(int space);
	
	public boolean isDoor(int door);
	
	public void setModelFacade(IModelFacade modelFacade);
	
	public boolean hit();
	
}
