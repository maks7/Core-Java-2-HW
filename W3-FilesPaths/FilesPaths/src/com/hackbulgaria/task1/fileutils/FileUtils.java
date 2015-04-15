package com.hackbulgaria.task1.fileutils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    private static volatile FileUtils instance = null;
    
    private FileUtils() { }    
    
    public static FileUtils getInstance() {
        if (instance == null ) {
            instance = new FileUtils();
        }
        return instance;
    }
    
    String readFrom(File file) throws FileNotFoundException, IOException {
        String line;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader buff = new BufferedReader(new FileReader(file))) {
            while (true) {
                line = buff.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        };
        return sb.toString();
    }
   
    String readFrom(Path path) throws IOException {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        list = Files.readAllLines(path);
        for (String s : list) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    void writeTo(File file, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } 
    }
    
    void writeTo(Path path, String text) throws IOException {
        Files.write(path, text.getBytes(), StandardOpenOption.CREATE);
    }

}
