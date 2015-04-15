package com.hackbulgaria.task1.dbexception;


public class DatabaseCorruptedException extends RuntimeException {

    DatabaseCorruptedException() {
        super("DB query result: user name is empty, your object, table or database might be corrupted.");
    }
    
    DatabaseCorruptedException(String message) {
        super(message);
    }
    
}
