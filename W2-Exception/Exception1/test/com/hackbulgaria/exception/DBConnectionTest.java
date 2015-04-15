package com.hackbulgaria.exception;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.task1.dbexception.UseDB;
import com.hackbulgaria.task1.dbexception.User;


public class DBConnectionTest {

    UseDB useDB;
    
    @Before
    public void before() {
        useDB = new UseDB();
    }
    
    @Test
    public void test_DB_conn() {
        
       User user = useDB.getCredentioals();
       System.out.println(user);
       
//       java.util.HashMap map = new java.util.HashMap();
//       map.put(new Integer(4), new Integer(7)); // OK - HashMap does not care, nor does Java
//
//       java.util.Map safeMap = java.util.Collections.checkedMap(map,String.class,String.class);
//       safeMap.put(new Integer(6), new Integer(9)); // WILL blow up!
    }

}
