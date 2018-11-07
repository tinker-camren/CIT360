/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRun;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tinkerc
 */
public class ThreadsExample {
    
    public void runThreads() {
        RunnablesExample tasks = new RunnablesExample(); 
        tasks.setTaskData();
        Runnable task1 = tasks.getTask1();   
        Runnable task2 = tasks.getTask2();
        Runnable task3 = tasks.getTask3();
        

        Thread basicThread1 = new Thread(task1);
        basicThread1.start();
        Thread basicThread2 = new Thread(task2);
        basicThread2.start();
        Thread basicThread3 = new Thread(task3);
        basicThread3.start(); 
        
        /*
        This forces the program to wait until basicThread1 has finished it's 
        task before moving on. Without this, it starts the thread and the 
        program continues on and mixes these results with the executor results
        in the console window 
        */
        try {
            basicThread1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadsExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
