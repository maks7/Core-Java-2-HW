package com.hackbulgaria.task1.dbexception;

public class UseDB {

    public User getCredentioals() {
        DBQuery dbQuery = new DBQuery();
        User user =null;
        
        try {
            user = dbQuery.getDBQuery();
        } catch (DatabaseCorruptedException e) {
            e.printStackTrace();
        }
        
        return user;
    }
}
