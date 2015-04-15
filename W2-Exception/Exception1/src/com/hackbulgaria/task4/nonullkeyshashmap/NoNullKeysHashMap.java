package com.hackbulgaria.task4.nonullkeyshashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author markovm
 *
 * @param <K>
 *            Sting
 * @param <V>
 *            Sting
 * 
 *            Constructor NoNullKeysHashMap(Boolean isNoNullAllowed) accept
 *            parameter True - to deny null keys in the map, and false to
 *            accept null keys in the map
 *            Constructor NoNullKeysHashMap(HashMap<K, V> m, Boolean isNoNullAllowed) creates
 *            instance from the class from other HashMap with selected second
 *            parameter for denying or accepting null values for keys
 * 
 */
public class NoNullKeysHashMap<K, V> extends HashMap<K, V> {

    /**
     * 
     */
    private static final long serialVersionUID = -3881313467457511972L;
    boolean noNullAllowed = true;
    
    public NoNullKeysHashMap() {
        //super();
    }
    
    public NoNullKeysHashMap(Boolean isNoNullAllowed) {
        //super();
        this();
        this.noNullAllowed = isNoNullAllowed;
    }
    
    public NoNullKeysHashMap(HashMap<K, V> m, Boolean isNullAllowed) {
        super();
        this.noNullAllowed = isNullAllowed;
        Iterator<Map.Entry<K, V>> it = m.entrySet().iterator();
        
            while(it.hasNext()) {
                Map.Entry<K, V> entrySet = it.next();
                if (noNullAllowed && (entrySet.getKey() == null || entrySet.getKey().equals(""))) { 
                    throw new IllegalArgumentException("Can not create new NoNullKeysHashMap. Argument " + m.getClass() + " has empty key. Empty key is not allowed with second paramether True");
                } else {
                    this.put(entrySet.getKey(), entrySet.getValue());
                }
            }
    }
    
    @Override
    public V put(K key, V value) {
        if (noNullAllowed && key == null) {
            throw new IllegalArgumentException("Null key is not allowed");
        }
        if (noNullAllowed && key.equals("")) {
            throw new IllegalArgumentException("Empty key is not allowed");
        }
        
        return super.put(key, value);
    }
    
    @Override
    public V get(Object key) {
        if (noNullAllowed && key == null) {
            throw new IllegalArgumentException("Null key is not allowed");
        }
        if (noNullAllowed && key.equals("")) {
            throw new IllegalArgumentException("Empty key is not allowed");
        }
        return super.get(key);
    }
}
