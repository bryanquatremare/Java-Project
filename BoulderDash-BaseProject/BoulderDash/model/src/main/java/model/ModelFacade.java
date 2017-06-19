package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModelFacade {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }
    
    public IArea getArea(){

    return null;
    }
    
    public void buildArea(Dimension dimension){
    	
    }
    
    public void addMobile(IMobile mobile){
    	
    }
    
    public void removeMobile(IMobile mobile){
    	
    }
    
    public ArrayList<IMobile> getMobile(){
		return null;
    	
    }
    
    public IMobile getMobileByPlayer(int player){
		return null;
    	
    }
    
    public void setMobilesHavesMoved(){
    	
    }
    
    public void addMotionless(IMotionless motionless){
    	
    }

    public void removeMotionless(IMotionless motionless){
    	
    }
    

	@Override
	public ArrayList<IMotionless> getMotionless() {
		// TODO Auto-generated method stub
		return null;
	}
}
    