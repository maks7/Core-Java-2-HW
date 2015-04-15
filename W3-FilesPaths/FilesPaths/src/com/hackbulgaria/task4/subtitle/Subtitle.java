package com.hackbulgaria.task4.subtitle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Subtitle {

    public void fixEncoding(Path path) {
        
        String fileName = path.toString();
        int extentionIndex = fileName.lastIndexOf(".");
        Path pathOutput = Paths.get(fileName.substring(0, extentionIndex) + "_decoded." + fileName.substring(extentionIndex + 1));
        
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("Windows-1251"));
                BufferedWriter writer = Files.newBufferedWriter(pathOutput, Charset.forName("UTF-8"));) {
            String line = "";
            while((line = reader.readLine()) != null){
                if (!line.equals("")) {
                    writer.write(line);
                }
                writer.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
