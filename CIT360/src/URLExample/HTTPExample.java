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

    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

public class HTTPExample {
  
  public HTTPExample()
  {
    try
    {
      String myUrl = "http://localhost:8080/MVCServletExample/";

      String results = connectURL(myUrl);
      System.out.println(results);
    }
    catch (Exception e)
    {
      // deal with the exception in your "controller"
    }
  }

  /**
   * Returns the output from the given URL.
   * 
   * I tried to hide some of the ugliness of the exception-handling
   * in this method, and just return a high level Exception from here.
   * Modify this behavior as desired.
   * 
   * @param desiredUrl
   * @return
   * @throws Exception
   */
  private String connectURL(String desiredUrl)
  throws Exception
  {
    URL url = null;
    BufferedReader reader = null;
    StringBuilder stringBuilder;

    try
    {
      // create the HttpURLConnection
      url = new URL(desiredUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      
      // just want to do an HTTP GET here
      connection.setRequestMethod("GET");
      
      // uncomment this if you want to write output to this url
      connection.setDoOutput(true);
      
      JSONReader outToServer = new JSONOutputStream(connection.getOutputStream());
                HashMap<String, Object> request = new HashMap<>();
                request.put("command", "Speak");
                request.put("message", messageForServer);
                outToServer.writeObject(request);
      
      // give it 15 seconds to respond
      connection.setReadTimeout(15*1000);
      connection.connect();

      // read the output from the server
      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      stringBuilder = new StringBuilder();

      String line = null;
      while ((line = reader.readLine()) != null)
      {
        stringBuilder.append(line + "\n");
      }
      return stringBuilder.toString();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    finally
    {
      
      if (reader != null)
      {
        try
        {
          reader.close();
        }
        catch (IOException ioe)
        {
          ioe.printStackTrace();
        }
      }
    }
  }
}
