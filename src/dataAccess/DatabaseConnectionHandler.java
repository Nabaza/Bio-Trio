package dataAccess;

import java.util.ArrayList;
import model.Booking;
import model.Show;

public class DatabaseConnectionHandler {
// declaration of handler instance variables
    private final DatabaseConnection CONNECTION;

    public DatabaseConnectionHandler() {
//      then calls getInstance to access Singleton pattern object
        CONNECTION = DatabaseConnection.getInstance();
    }
    
    public ArrayList<Show> getShowList(){
        ArrayList<Show> showList = new ArrayList();
        // DATEBASE SELECT LOGIC HERE
        return showList;
    }
    
    public void updateShow(Show show){
        // DATABASE SELECT LOGIC HERE
    }
    
    public void insertBooking(Booking booking){
        // DATA BASE INSERT LOGIC HERE
    }
    
    
}