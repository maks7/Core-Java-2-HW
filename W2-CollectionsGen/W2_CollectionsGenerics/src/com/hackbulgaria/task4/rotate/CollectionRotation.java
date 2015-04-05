package com.hackbulgaria.task4.rotate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionRotation {

    public void rotate(Collection<Integer> collection, int rotateStep) {

        int limit = 0;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        ArrayList<Integer> arrList = new ArrayList<>(collection);
        collection.clear();

        if (rotateStep > 0) {
            limit = arrList.size() - rotateStep - 1;

            for (int i = (arrList.size() - 1); i > limit; i--) {
                st.add(arrList.get(i));
                arrList.remove(i);
            }

            while (!st.isEmpty()) {
                collection.add(st.pop());
            }
            collection.addAll(arrList);
        } else {
            limit = Math.abs(rotateStep);

            for (int i = 0; i < limit; i++) {
                q.add(arrList.get(i));
            }

            arrList.removeAll(q);
            collection.addAll(arrList);
            
            while (!q.isEmpty()) {
                collection.add(q.poll());
            }
        }
    }
}
