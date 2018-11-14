/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.JsonExport;
import Model.JsonImport;
import cit360.CIT360;
import Model.MapExample;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author tinkerc
 */
public class JsonExample {
    
    public void JsonSimpleView() {       
        JsonExport jsonExport = new JsonExport();
        JSONObject obj = jsonExport.getObj();
        System.out.print(obj);
    }
    
    public void JsonExportToFile() throws IOException {       
        JsonExport jsonExport = new JsonExport();
        JSONObject obj = jsonExport.getObj();
        try (FileWriter file = new FileWriter("JSONExample.txt")) {
        file.write(obj.toJSONString());
        System.out.println("\nSuccessfully Copied JSON Object to File...");
        System.out.println("\nJSON Object: " + obj);
        }
    }
    
    public void JsonImportFromFile() throws ParseException, FileNotFoundException, IOException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(
                    "JSONExample.txt"));
        // this creates a variable to store the imported object in
        JSONObject jsonObject = (JSONObject) obj;
        double checkingBalance = (double) jsonObject.get("Checking Balance");
        double savingsBalance = (double) jsonObject.get("Savings Balance");
        String accountHolder = (String) jsonObject.get("Account Holder");
        boolean is_goldmember = (boolean) jsonObject.get("is_goldmember");
        
        //Store information from this JSON document into a java instance
        JsonImport jsonImport = cit360.CIT360.getJsonImport();
        jsonImport.setAccountHolder(accountHolder);
        jsonImport.setCheckingBalance(checkingBalance);
        jsonImport.setIs_goldmember(is_goldmember);
        jsonImport.setSavingsBalance(savingsBalance);
    }
    public void ViewImportedJsonToClass() {
        JsonImport jsonImport = cit360.CIT360.getJsonImport();
        System.out.println("Account Holder: " + jsonImport.getAccountHolder());
        System.out.println("Checking Balance: " + jsonImport.getCheckingBalance());
        System.out.println("Savings Balance: " + jsonImport.getSavingsBalance());
        System.out.println("is_goldmember: " + jsonImport.getIs_goldmember());
    }
}
