package com.hackbulgaria.task2.propparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Parser {

    public Map<String, String> parseProperties(String fileName) {
        Map<String, String> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        String line;
        
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while((line = reader.readLine()) != null) {
                list.add(new String(line));
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
        
        map = fillOutMap(list);
        
        return map;
    }
    
    public Map<String, String> fillOutMap(List<String> list) {
        Map<String, String> m = new LinkedHashMap<>();
        
        for (String str : list) {
            if (str.charAt(0) == '#') {
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '=') {
                    int pos = str.substring(i+1, str.length()).indexOf('#');
                    if (pos > -1) {
                        m.put(str.substring(0, i).trim(), str.substring(i+1, i+pos+1));
                        break;
                    } else {
                        m.put(str.substring(0, i).trim(), str.substring(i+1, str.length()));
                        break;
                    }
                }
            }
        }
        return m;
    }
    
}
