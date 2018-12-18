/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLExample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author CNTin
 * Info taken from 
 * http://www.java2s.com/Tutorial/Java/0320__Network/ReaddatafromaURL.htm
 */
public class WebReader extends JFrame {

    JTextArea box = new JTextArea("Getting data ...");

    public WebReader() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        JScrollPane pane = new JScrollPane(box);
        add(pane);
        setVisible(true);
    }

    void getData(String url) throws Exception {
        setTitle(url);
        URL page = new URL(url);
        StringBuffer text = new StringBuffer();
        HttpURLConnection conn = (HttpURLConnection) page.openConnection();
        conn.connect();
        InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
        BufferedReader buff = new BufferedReader(in);
        box.setText("Getting data ...");
        String line;
        do {
            line = buff.readLine();
            text.append(line + "\n");
        } while (line != null);
        box.setText(text.toString());
    }
}
