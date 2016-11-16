package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
//      declaring instance variables and constant
    private final String DRIVER;
    private Connection connect;
    private static DatabaseConnection instance;

    private DatabaseConnection() {
//      initialization of connection reference and driver variable
        connect = null;
        DRIVER = "org.postgresql.Driver";
    }

    public static DatabaseConnection getInstance() {
//      static method call to get Singleton pattern instance - if it does not exist yet it will be created        
        if (instance != null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection connect(String url, String username, String password) {
        System.out.println("--STARTING DATABASE CONNECTION--");

        try {
//      locates JDBC driver
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("\n--JDBC DRIVER ERROR: NOT FOUND--");
        }
//      connecting to database by URL and login
        try {
            connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("\n--CONNECTION LOGIN ERROR: NOT FOUND--");
        }

        if (connect != null) {
            System.out.println("\n--CONNECTION ACHIEVED--");
        } else {
            System.out.println("\n--CONNECTION FAILED--");
        }
        
        return connect;
    }
    
    public void closeConnection(){
//      closes connection by calling connection object method to close
        if (connect != null){
            try {
                connect.close();
            } catch (SQLException ex){
                System.out.println("\n--CLOSE CONNECTION FAILED--");
            }
            System.out.println("\n--CONNECTION CLOSED--");
        }
    }
}