/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import Controller.ApplicationController;
import Controller.TestHandler;
import Controller.TestPrompt;
import ThreadsExecRun.ExecutablesExample;
import ThreadsExecRun.ThreadsExample;
import cit360.CollectionsExamples.ListExample;
import cit360.CollectionsExamples.MapExample;
import cit360.CollectionsExamples.QueueExample;
import cit360.CollectionsExamples.ViewListExample;
import cit360.CollectionsExamples.ViewMapExample;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tinkerc
 */
public class CIT360 {

    static ListExample listExample = new ListExample();
    static MapExample mapExample = new MapExample();
    static QueueExample queueExample = new QueueExample();
    static TestPrompt controllerExample = new TestPrompt();
    

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
    
    public static void main(String[] args) {        
        ApplicationController appController = new ApplicationController();
        appController.mapCommand("manager", new TestHandler());        
        
        //List collections examples        
        ViewListExample.viewListExamples();
        ViewMapExample.viewMapExamples();
        HashMap manager = controllerExample.promptUser();
        appController.handleRequest("manager", manager);
        
        System.out.println("\nStarting Threads\\Runnables example");
        ThreadsExample threadsExample = new ThreadsExample();
        threadsExample.runThreads();
        
        System.out.println("\nStarting TExecutables\\Callables example");
        ExecutablesExample executablesExample = new ExecutablesExample();
        try {
            executablesExample.runExecutables();
        } catch (InterruptedException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CIT360.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
