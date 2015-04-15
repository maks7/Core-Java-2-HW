package com.hackbulgaria.task5.reducepath;

import java.nio.file.FileSystems;

public class FilePath {

    public String reduce_file_path(String path) {
        
        return FileSystems.getDefault().getPath(path).normalize().toString();
    }
}
