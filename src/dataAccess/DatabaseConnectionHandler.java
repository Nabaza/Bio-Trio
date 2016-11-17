package dataAccess;

public class DatabaseConnectionHandler {
// declaration of handler instance variables
    private final DatabaseConnection CONNECTION;

    public DatabaseConnectionHandler() {
//      then calls getInstance to access Singleton pattern object
        CONNECTION = DatabaseConnection.getInstance();
    }
}