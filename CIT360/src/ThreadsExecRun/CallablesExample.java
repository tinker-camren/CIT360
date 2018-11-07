/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRun;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tinkerc
 */
public class CallablesExample {
    public Callable createTask(String name, long waitTime ) {           
            return () -> {
                TimeUnit.SECONDS.sleep(waitTime);
                String threadName = Thread.currentThread().getName();
                System.out.println("This is " + name + " running on " + threadName
                        + " with a wait time of " + waitTime + " second(s)");
                return name;
            };
    }
}
