/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLExample;

/**
 *
 * @author tinkerc
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;

public class HTTPExample {
    
    //This function will return the HTML code for a web page and display
    //it in the console
    public String viewHTML(String url) 
    throws Exception {
        String output = null;
        
        URL urlObj = new URL(url);
        HttpURLConnection urlCon = (HttpURLConnection) urlObj.openConnection();
        InputStream in = urlCon.getInputStream();
        
        int ch;
        while (((ch = in.read()) != -1))
        output += ((char) ch);
        in.close();
        
        return output;
    }
    
    public static void downloadHTML(String url, String saveDir) 
    throws Exception {
            HttpDownloadUtility.downloadFile(url, saveDir);
    }
    
    public boolean isConnectionValid(String url) 
        throws IOException{
        URL urlObj = new URL(url);
        HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();

        int responseCode = httpCon.getResponseCode();

        if (responseCode != HttpURLConnection.HTTP_OK) {
            System.out.println("Server returned response code " + responseCode 
                    + " - Unable to display webpage");
            return false;
        } else {
            return true;
        }
    }
    
    public void displayWebPage(String url) 
    throws Exception {
        WebReader app = new WebReader();
        app.getData(url);
    }
}