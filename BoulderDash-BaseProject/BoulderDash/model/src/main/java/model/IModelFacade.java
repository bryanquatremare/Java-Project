package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IModelFacade {

	public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(IMobile mobile);
	
	public void removeMobile(IMobile mobile);

	public ArrayList<IMobile>();
	
	public IMobile getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	
	public void addMotionless(IMotionless motionless);
	
	public void removeMotionless(IMotionless motionless);
	
	public ArrayList<IMotionless> getMotionless();

	Example getExampleById(int id) throws SQLException;

	Example getExampleByName(String name) throws SQLException;

	List<Example> getAllExamples() throws SQLException;
	
	
}
