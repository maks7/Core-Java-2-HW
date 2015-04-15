package com.hackbulgaria.task3.wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class WC {

    WordCountResult wordCount(Path path) {
        int counterLines = 0;
        WordCountResult wc = new WordCountResult();
        
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                countWordsChars(line, wc);
                counterLines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        wc.setLinesCount(counterLines);
        return wc;
    }
    
    WordCountResult wordCount(File file) {
        int counterLines = 0;
        WordCountResult wc = new WordCountResult();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = "";
            while((line = reader.readLine()) != null) {
                countWordsChars(line, wc);
                counterLines++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e ) {
            e.printStackTrace();
        }
        
        wc.setLinesCount(counterLines);
        return wc;
    }
    
    void countWordsChars(String line, WordCountResult wc) {
        int numWords = 0;
        int numChars = 0;
        String[] words = line.replaceAll("\\p{Punct}", " ").split("[\\s]{1,}");
        numWords = words.length;
        
        for (String s : words) {
            numChars += s.length();
        }
        
        wc.setWordsCount(wc.getWordsCount() + numWords);
        wc.setCharsCount(wc.getCharsCount() + numChars);
    }
}
