package com.hackbulgaria.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.FilenameUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class FileUtils {

    public void download(String fromPath, String toPath) {
        
        try {
            CloseableHttpClient httpclient =  HttpClients.createDefault();
            HttpGet httpget = new HttpGet(fromPath);
            CloseableHttpResponse response = httpclient.execute(httpget);
            InputStream in = null;
            
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                in = entity.getContent();
            }
            
            File path = new File("C:\\Fil\\Down");
            path.mkdir();
            String name = FilenameUtils.getName(fromPath);
            File file = new File(path, name);
            
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int numRead = 0;
            while((numRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, numRead);
            }
            
            fos.close();
            response.close();
            
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
