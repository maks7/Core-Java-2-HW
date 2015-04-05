package com.hackbulgaria.task11.count;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CollectionsUtility {

    
    public Map<String, Integer> countWordsInText(String text) {
        
        String[] str = text.split("\\s");
     
        Map<String, Integer> m = new LinkedHashMap<String, Integer>() {
            /**
             * 
             */
            private static final long serialVersionUID = -8538579188104534130L;

            @Override
            public String toString() {

                StringBuilder sb = new StringBuilder();
                Iterator<Map.Entry<String, Integer>> it = this.entrySet().iterator();
                int count = 0;

                sb.append("{ ");
                while (it.hasNext()) {
                    Map.Entry<String, Integer> entrySet = it.next();
                    if (count < this.size() - 1) {
                        sb.append(entrySet.getKey() + ":" + entrySet.getValue()).append(", ");
                    } else {
                        sb.append(entrySet.getKey() + ":" + entrySet.getValue());
                    }
                    count++;
                }
                sb.append(" }");
                return sb.toString();
            }
        };
        
        for (String s : str) {
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }

        return m;
    }
}
