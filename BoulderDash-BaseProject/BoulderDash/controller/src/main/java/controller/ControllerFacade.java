package controller;

import java.sql.SQLException;
import java.util.List;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */
public class ControllerFacade implements IController {

    /** The view is initialized here to be used in the instantiation of the controller facade
     * 
     */
    private final IView view;

    /** The model is also initialized here for the same reasons
     * 
     */
    private final IModel model;
    
    /**
     * Instantiates a new controller facade to initialize the dependencies with the Model package and View package
     * The throws SQLException is there for Make sure none of those SQLExceptions are going to kill our execution.
     * @param view
     *            the view
     * @param model
     *            the model
     * @throws SQLException 
     */
    public ControllerFacade( final IModel model, final IView view) throws SQLException {
    	this.view = view;
        this.model = model;
        
    }


    /**
     * Gets the view.
     * A simple method which can be called by an other class to get the view used by the controller facade
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     * A simple method with the same functionalities as the getView method but for the model.
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }


	@Override
	public void userOrder(char dir) {
		
		
	}
}
