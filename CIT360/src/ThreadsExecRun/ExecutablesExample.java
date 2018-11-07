/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRun;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author tinkerc
 */
public class ExecutablesExample {
    
    
    public void runExecutables() throws InterruptedException, ExecutionException {
        CallablesExample callablesExample = new CallablesExample(); 
        
        
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
        callablesExample.createTask("task4", 2),
        callablesExample.createTask("task5", 1),
        callablesExample.createTask("task6", 3));
        
        executor.invokeAll(callables)
                .stream()
    .map(future -> {
        try {
            return future.get();
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
    });
        
        }
}
