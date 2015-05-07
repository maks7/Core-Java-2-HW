package com.hackbulgaria.task4.downloadfile;

import org.apache.commons.io.FilenameUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download {
    
    public void fileFromTo(String urlString, String targetPath) {
        InputStream in = null;
        OutputStream out = null;
        String name = FilenameUtils.getName(urlString);
        
        try {
            URL url = new URL(urlString);
            in = new BufferedInputStream(url.openStream());
            
            out = new BufferedOutputStream(new FileOutputStream(targetPath + "\\" + name));
            
            byte[] buffer = new byte[1024];
            
            int numRead;
            
            while ((numRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            
        }        
        
    }

    public static void main(String[] args) {
          Download down = new Download();
          down.fileFromTo(args[0], args[1]);
    }
}
