package com.hackbulgaria.task1.dbexception;

public class User {

    private String userName;
    private String password;
    
    public User(String uName, String pass) {
        userName = uName;
        password = pass;
    }
    
    public void setUserName(String uName) {
        userName = uName;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setPassword(String pass) {
        password = pass;
    }
    
    public String getPassword() {
        return password;
    }
    
    @Override
    public String toString() {
        return "User name: " + userName + ", password: " + password;
    }
}
