package com.hackbulgaria.task1.dbexception;

public class DBQuery {

    public User getDBQuery() throws DatabaseCorruptedException {
   
        //
        // From the DB is received data with values assigned to sqlRes object
        // user name = "";
        // password = "ShWnEk2"
        
        SQLResult sqlRes = new SQLResult("", "ShWnEk2");
        User user = null;
        
        if(sqlRes.getUserName().equals("")) {
            throw new DatabaseCorruptedException();
        } else {
            user = new User(sqlRes.getUserName(), sqlRes.getPassword());
        }
        
        return user;
    }
}
