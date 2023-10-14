package org.example.db;

public class DBconnection {
    private static DBconnection dbConnection;

    private DBconnection(){

    }

    public static DBconnection getInstance(){
        return dbConnection != null ? dbConnection : (dbConnection=new DBconnection());
    }

}
