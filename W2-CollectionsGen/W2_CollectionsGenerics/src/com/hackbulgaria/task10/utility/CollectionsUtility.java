package com.hackbulgaria.task10.utility;

import java.util.Iterator;
import java.util.Map;

public class CollectionsUtility {

    public <K, V> String getMapToString(Map<K, V> map) {
        
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        sb.append("{");
        int i = 0;
        while(it.hasNext()){
            Map.Entry<K, V> pair = (Map.Entry<K, V>) it.next();
            sb.append(pair.getKey()+"="+ pair.getValue());
            if(i < map.size() - 1) {
                sb.append(", ");
            }
            i++;
        }
        sb.append("}");
              
        return sb.toString();
    }
}
