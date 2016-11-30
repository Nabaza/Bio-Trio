package dataAccess;

import java.util.ArrayList;
import model.Booking;
import model.Show;

public class DatabaseHandler {
// declaration of handler instance variables
    private final DatabaseConnection CONNECTION;
    private static DatabaseHandler instance;

    private DatabaseHandler() {
//      then calls getInstance to access Singleton pattern object
        CONNECTION = DatabaseConnection.getInstance();
    }
    
    public static DatabaseHandler getInstance(){
        //      static method call to get Singleton pattern instance - if it does not exist yet it will be created        
        if (instance != null) {
            instance = new DatabaseHandler();
        }
        return instance;
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