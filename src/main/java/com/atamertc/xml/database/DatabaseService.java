package com.atamertc.xml.database;

public class DatabaseService {

    Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }

    public void  logToDatabase(){
        database.log();
    }

}
