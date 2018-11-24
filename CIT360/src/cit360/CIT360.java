/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import Controller.ApplicationController;
import Controller.TestHandler;
import Model.JsonImport;
import View.TestPrompt;
import ThreadsExecRun.ExecutablesExample;
import ThreadsExecRun.ThreadsExample;
import Model.ListExample;
import Model.MapExample;
import Model.QueueExample;
import URLExample.HTTPExample;
import URLExample.JSONEchoClient;
import View.JsonExample;
import View.ViewListExample;
import View.ViewMapExample;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

/**
 *
 * @author tinkerc
 */
public class CIT360 {

    static ListExample listExample = new ListExample();
    static MapExample mapExample = new MapExample();
    static QueueExample queueExample = new QueueExample();
    static TestPrompt controllerExample = new TestPrompt();
    static JsonImport jsonImport = new JsonImport();
    

    public static ListExample getListExample() {
        return listExample;
    }

    public void setListExample(ListExample listExample) {
        this.listExample = listExample;
    }

    public static MapExample getMapExample() {
        return mapExample;
    }

    public void setMapExample(MapExample mapExample) {
        this.mapExample = mapExample;
    }

    public static QueueExample getQueueExample() {
        return queueExample;
    }

    public void setQueueExample(QueueExample queueExample) {
        this.queueExample = queueExample;
    }

    public static JsonImport getJsonImport() {
        return jsonImport;
    }

    public static void setJsonImport(JsonImport jsonImport) {
        CIT360.jsonImport = jsonImport;
    }

   
    
    
    
    public static void main(String[] args) {        
        ApplicationController appController = new ApplicationController();
        appController.mapCommand("manager", new TestHandler());
        
        //List collections examples        
        ViewListExample.viewListExamples();
        ViewMapExample.viewMapExamples();
        
        System.out.println("\nStarting Application Controller example");
        HashMap manager = controllerExample.promptUser();
        appController.handleRequest("manager", manager);
        
        System.out.println("\nStarting Threads\\Runnables example");
        ThreadsExample threadsExample = new ThreadsExample();
        threadsExample.runThreads();
        
        System.out.println("\nStarting Executables\\Callables example");
        ExecutablesExample executablesExample = new ExecutablesExample();
        try {
            executablesExample.runExecutables();
        } catch (InterruptedException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\nStarting JSON example");
        JsonExample jsonExample = new JsonExample();
        jsonExample.JsonSimpleView();
        try {
            jsonExample.JsonExportToFile();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("\nImporting JSON example");
        try {
            jsonExample.JsonImportFromFile();
            System.out.println("Import was successful!");
        } catch (ParseException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Imported JSON example:\n");
        jsonExample.ViewImportedJsonToClass();
        
        System.out.println("\nStarting HTTP/URL example");
        HTTPExample httpExample = new HTTPExample();
        
        JSONEchoClient theClient = new JSONEchoClient();
        theClient.go();
        
    }
    
}
