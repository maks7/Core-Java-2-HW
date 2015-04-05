package com.hackbulgaria.onoffcollection;

import java.util.ArrayList;

public class ArrayListOnOff<E> extends ArrayList<E>{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    

/* (non-Javadoc)
 * 
 * public boolean add(E e)
 * 
 * 
 * Parameters:
 * 
 * e - element to be added to list
 * 
 * Overrides:
 * 
 * add in class ArrayList<E>
 * 
 * Returns;
 * 
 * true - e element is added to list
 * false - e element contains in the list and it is removed
 * 
 */
@Override
    public boolean add(E e) {
        
        if (e == null) {
            return false;
        }
        
        if (this.contains(e)) {
            this.remove(this.indexOf(e));
            return false;
        }
        
        return super.add(e);
    }

}
