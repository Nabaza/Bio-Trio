package control;

import java.sql.Connection;
import model.DatabaseConnection;

/**
* NOTE:
* this object will store the initial connection for later uses, so that it can be closed and reopened in program operations without
* having to recall the inputted URL/username/password every time.
*/

public class DatabaseConnectionHandler {
// declaration of handler instance variables
    private final DatabaseConnection CONNECTION;
    private final String URL;
    private final String USERNAME;
    private final String PASSWORD;

    public DatabaseConnectionHandler(String host, String port, String databaseName, String username, String password) {
//      initializes the handler and creates an URL from host, port and DB name
//      then calls getInstance to access Singleton pattern object
        this.URL = "jdbc:postgresql://" + host + ":" + port + "/" + databaseName;
        this.USERNAME = username;
        this.PASSWORD = password;
        CONNECTION = DatabaseConnection.getInstance();
    }

    public Connection connect() {
//      calls DatabaseConnection connect method and returns this through the handler
        Connection connect = CONNECTION.connect(URL, USERNAME, PASSWORD);
        return connect;
    }

    public void closeConnect() {
//      calls DatabaseConnection close connection method
        CONNECTION.closeConnection();
    }
}