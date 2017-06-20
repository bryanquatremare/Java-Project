package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	
	public IArea getArea();
	
	public void buildArea(Dimension dimension);
	
	public void addMobile(IMobile mobile);
	
	public void removeMobile(IMobile mobile);

	public ArrayList<IMobile> getMobile();
	
	public IMobile getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();
	
	public void addMotionless(IMotionless motionless);
	
	public void removeMotionless(IMotionless motionless);
	
	public ArrayList<IMotionless> getMotionless();
    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleById(int id) throws SQLException;

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    Example getExampleByName(String name) throws SQLException;

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     */
    List<Example> getAllExamples() throws SQLException;
}
