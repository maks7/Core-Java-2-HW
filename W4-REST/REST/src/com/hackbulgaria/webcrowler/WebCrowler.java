package com.hackbulgaria.webcrowler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class WebCrowler {

    public String doWebCrowle(String url, String word) {
        
        String result = "";
        
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(new URI(url.toString()));
            CloseableHttpResponse response = httpClient.execute(httpGet);
            InputStream in = null;
            
            ArrayList<String> visited = new ArrayList();
            
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                in = entity.getContent();
            }
            
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(in, "UTF-16"));
            // Get content from url link
            String line = "";
            StringBuilder builder = new StringBuilder();
            while ((line = bufReader.readLine()) != null) {
                builder.append(line);
            }
            
            List<String> linksForVisit = null;
            if (builder.toString().toLowerCase().contentEquals(word)) {
                visited.add(url);
                result = "Word: " + word + url.toString();
            } else {
                linksForVisit = getAllLinks(builder.toString());
                
                System.out.println(linksForVisit);
                
                for (String link : linksForVisit) {
                    
                    if (!visited.contains(link)) {
                        doWebCrowle(link, word);
                    }
                }
            }
            
            
            
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return result;
    }
    
    private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        return resultList;
    }
    
    public static void main(String[] args) {
        String url = "http://ebusiness.free.bg";
        String word = "проект";
        
        WebCrowler webCrowler = new WebCrowler();
        System.out.println(webCrowler.doWebCrowle(url, word));
        
    }
}
