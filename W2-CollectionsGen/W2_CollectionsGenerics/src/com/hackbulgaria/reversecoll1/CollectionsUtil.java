package com.hackbulgaria.reversecoll1;

import java.util.Collection;

public class CollectionsUtil {

    @SuppressWarnings("unchecked")
    public static <T> Collection<T> reverse (Collection<T> collection) {
        
        Object[] arrObj = new Object[collection.size()];
        
        int n = 0;
        for (T coll : collection) {
            arrObj[n] = (Object) coll;
            n++;
        }
                
        Object temp;
        for(int i = 0; i < (arrObj.length / 2); i++) {
           temp = arrObj[i];
           arrObj[i] = arrObj[arrObj.length - 1 - i];
           arrObj[arrObj.length - 1 - i] = temp;
        }
        
        collection.clear();
        for (int i = 0; i < arrObj.length; i++) {
            collection.add((T) arrObj[i]);
        }
        
        return collection;
    }
}
