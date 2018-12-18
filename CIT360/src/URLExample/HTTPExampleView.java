/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLExample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author CNTin
 */
public class HTTPExampleView {
    HTTPExample httpExample = new HTTPExample();
    
    public void displayHTMLCode() 
    throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter the URL you would like to check and view"
                + " the HTML code for"
                + "\n Example: http://google.com\n");
        String url = input.readLine();
        
        System.out.println("Please enter the URL you would like to download a "
                + "file from"
                + "\nExample: https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/json-simple/json-simple-1.1.1.jar\n");
        String url2 = input.readLine();
        
        System.out.println("Please enter the file path to save the file to: ");
        String saveDir = input.readLine();
         
        boolean isValidConn = httpExample.isConnectionValid(url);
        boolean isValidConn2 = httpExample.isConnectionValid(url2);
        
        if (isValidConn){
            try {
                System.out.println("\nWebpage html code from " + url + ": ");
                String html = httpExample.viewHTML(url);
                System.out.println(html);
                
                System.out.println("Displaying webpage html code in popup window"
                        + "for " + url + "...");
                httpExample.displayWebPage(url);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        if (isValidConn2) {
            try {
                System.out.println("\nDownloading file from " + url + "... ");
                httpExample.downloadHTML(url2, saveDir);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
            
        }
    }
}
