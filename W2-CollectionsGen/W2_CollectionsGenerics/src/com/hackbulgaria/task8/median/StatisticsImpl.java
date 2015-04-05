package com.hackbulgaria.task8.median;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StatisticsImpl implements Statistics, Iterable<Integer> {

    ArrayList<Integer> arr;
    
    public StatisticsImpl() {
        this.arr = new ArrayList<>();
    }
    
    public StatisticsImpl(List<Integer> listInt) {
        this.arr = new ArrayList<>(listInt);
    }
    public void add(int number) {
        arr.add(number);
    }
            
    @Override
    public double getMean() {
        double result = 0.0;
        int i = 0;
        while(i < arr.size()) {
            result += arr.get(i);
            i++;
        }
        return (result / i);
    }

    @Override
    public double getMedian() {
       
       double result = 0.0;
       ArrayList<Integer> arrSorted = new ArrayList<>(arr);
       Collections.sort(arrSorted);
       
       int ind = -1;
       if ((arrSorted.size() % 2) == 0) {
           ind = (arrSorted.size() / 2) - 1;
           result =  ((arrSorted.get(ind) + arrSorted.get(ind + 1)) / 2);
       } else {
           ind = arrSorted.size() / 2;
           result = arrSorted.get(ind);
       }
        
        return result;
    }

    @Override
    public String getMode() {
        String result = "";
        int count = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                if (count < (map.get(i) + 1)) {
                }
            } else {
                map.put(i, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        //System.out.println("Arr list Before sort:" + list);
        Collections.sort(list, new EntryValueComparator());
        //System.out.println("Arr list After sort:" +list);
        
        if ((list.get(list.size() - 1).getValue() == 1)
                || list.get(0).getValue() == list.get(list.size() - 1).getValue()) {
            return "none";
        } else {
            int maxCount = list.get(list.size() - 1).getValue();
            for (int i = list.size() - 1; i > 0; i--) {
                
                if (maxCount == list.get(i).getValue()) {
                    result += list.get(list.size() - 1).getKey();
                } else {
                    break;
                }
            }
        }
       
       return result;
    }

    @Override
    public int getRange() {
        ArrayList<Integer> arrSorted = new ArrayList<>(arr);
        Collections.sort(arrSorted);
        
        return (arrSorted.get(arrSorted.size() - 1) - arrSorted.get(0));
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = arr.iterator();
        
        return it;
    }

    @Override
    public String toString(){
        return arr.toString();
    }
}
