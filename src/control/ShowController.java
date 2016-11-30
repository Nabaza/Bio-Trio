package control;

import dataAccess.DatabaseHandler;
import java.util.ArrayList;
import model.Show;

/**
 *
 * @author Mads
 */
public class ShowController {
    private final DatabaseHandler CONNECT;
    private ArrayList<Show> showList;
    
    public ShowController(){
        CONNECT = DatabaseHandler.getInstance();
        showList = null;
    }
    
    public ArrayList<Show> getShowList(){
        this.showList = CONNECT.getShowList();
        return showList;
    }
}
