package main;


import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Marand Virgile, Lhermine Ludovic, Quatremare Bryan and Blin Clément.
 * @version HeartGold-SoulSilver
 */
public abstract class Main {

    /**
     * The main method.
     * Instantiation of the ControllerFacade, ModelFacade and ViewFacade(And a other ModelFacade for the view)
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     */
    public static void main(final String[] args) throws SQLException {
        final ControllerFacade controller = new ControllerFacade(new ModelFacade(), new ViewFacade(new ModelFacade()));
    }

}
