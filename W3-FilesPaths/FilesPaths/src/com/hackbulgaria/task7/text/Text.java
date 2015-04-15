package com.hackbulgaria.task7.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Text {

    int dictSize;

    public void compress(Path filePath) {
        String str = filePath.toString();
        String outStr = str.substring(0, str.lastIndexOf(".")) + ".compr";
        Path outPath = Paths.get(outStr);
        List<String> listWords = new ArrayList<>();

        dictSize = 256;
        Map<String, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < 256; i++) {
            dictionary.put("" + (char) i, i);
        }

        try (BufferedReader reader = Files.newBufferedReader(filePath);
                BufferedWriter writer = Files.newBufferedWriter(outPath, StandardOpenOption.CREATE);) {

            // read uncompressed words from file
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String s : words) {
                    listWords.add(s);
                }
            }

            // compress words and save in file
            StringBuffer result = new StringBuffer();
            for (String s : listWords) {
                if (dictionary.containsKey(s)) {
                    result.append("~").append(dictionary.get(s));
                } else {
                    StringBuffer sb = new StringBuffer();
                    for (Integer in : compressString(s, dictionary)) {
                        sb.append(in).append(" ");
                    }
                    result.append("~").append(sb.toString());
                    dictionary.put(s, dictSize++);
                }
            }
            writer.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void decompress(Path filePath) {

        String str = filePath.toString();
        String outStr = str.substring(0, str.lastIndexOf(".")) + ".decompr";
        Path outPath = Paths.get(outStr);

        dictSize = 256;
        Map<Integer, String> dictionary = new HashMap<>();
        List<String> listCompr = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            dictionary.put(i, "" + (char) i);
        }

        try (BufferedReader reader = Files.newBufferedReader(filePath);
                BufferedWriter writer = Files.newBufferedWriter(outPath, StandardOpenOption.CREATE);) {
            // read compressed words from file
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] comprWords = line.split("~");
                for (String s : comprWords) {
                    if (!s.equals("")) {
                        listCompr.add(s);
                    }
                }
            }
            
            // decompress words and save in file
            StringBuffer result = new StringBuffer();
            for (String s : listCompr) {
                List<Integer> listInt = new ArrayList<>();

                String[] letters = s.split("\\s");
                StringBuffer sbWord = new StringBuffer();

                String w = "";
                for (String el : letters) {

                    String decomWord = "";
                    if (letters.length == 1 && dictionary.containsKey(Integer.parseInt(letters[0]))) {
                        decomWord = dictionary.get(Integer.parseInt(letters[0]));
                    } else {
                        listInt.add(Integer.parseInt(el));
                        decomWord = decompressString(listInt, dictionary);
                        sbWord.append(decomWord);
                    }

                    String wc = w + decomWord;
                    if (containsValue(dictionary, wc)) {
                        w = wc;
                    } else {
                        dictionary.put(dictSize++, wc);
                        w = "" + decomWord;
                    }
                    result.append(decomWord);
                }

                if (!dictionary.containsKey(sbWord.toString()) && !sbWord.toString().equals("")) {
                    dictionary.put(dictSize++, sbWord.toString());
                }
                result.append(" ");
            }
            writer.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <K, V> boolean containsValue(Map<K, V> map, V value) {
        for (V v : map.values()) {
            if (v.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> compressString(String strUncompressed, Map<String, Integer> dictionary) {

        String w = "";
        List<Integer> result = new ArrayList<Integer>();
        for (char c : strUncompressed.toCharArray()) {
            String wc = w + c;
            if (dictionary.containsKey(wc)) {
                w = wc;
            } else {
                result.add(dictionary.get(w));
                dictionary.put(wc, dictSize++);
                w = "" + c;
            }
        }

        if (!w.equals("")) {
            result.add(dictionary.get(w));
        }
        return result;
    }

    public String decompressString(List<Integer> compressed, Map<Integer, String> dictionary) {

        String w = "";
        String entry = "";

        if (dictSize < 256) {
            w = "" + (char) (int) compressed.remove(0);
        } else {
            w = dictionary.get(compressed.remove(0));
        }

        StringBuffer result = new StringBuffer(w);

        for (int k : compressed) {
            if (dictionary.containsKey(k)) {
                entry = dictionary.get(k);
            } else if (k == dictSize) {
                entry = w + w.charAt(0);
            } else {
                new IllegalArgumentException("Bad compressed k: " + k);
            }
            result.append(entry);
            dictionary.put(dictSize++, w + entry.charAt(0));
            w = entry;
        }
        return result.toString();
    }

}
