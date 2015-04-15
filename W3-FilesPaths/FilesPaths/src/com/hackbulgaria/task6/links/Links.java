package com.hackbulgaria.task6.links;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NotLinkException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Links {

    public void printBrokenLinks(Path path) {
        List<Path> list = new ArrayList<>();
        
        addBrokenLinks(list, path);
        
        System.out.println(list);
    }
    
    private void addBrokenLinks(List<Path> list, Path path) {
        
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path p : directoryStream) {
                if (Files.isDirectory(p)) {
                    addBrokenLinks(list, p);
                } else {
                    if (Files.isSymbolicLink(p)) {
                        Path symLink = Files.readSymbolicLink(p);
                        if (!Files.exists(symLink)) {
                            list.add(p);
                        }
                    }
                }
            }
        } catch (NotLinkException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
