/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExecRun;

/**
 *
 * @author tinkerc
 */
public class RunnablesExample {
        
    private Runnable task1;
    private Runnable task2;
    private Runnable task3;

    public void setTaskData() {
        this.task1 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("This is task1 running on " + threadName);
        };
        
        this.task2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("This is task2 running on " + threadName);
        };  
        
        this.task3 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("This is task3 running on " + threadName);
        };  
    }

    public Runnable getTask1() {
        return task1;
    }

    public Runnable getTask2() {
        return task2;
    }

    public Runnable getTask3() {
        return task3;
    }

    public void setTask1(Runnable task1) {
        this.task1 = task1;
    }

    public void setTask2(Runnable task2) {
        this.task2 = task2;
    }

    public void setTask3(Runnable task3) {
        this.task3 = task3;
    }
    
    public Runnable createTask(String name, long waitTime ) {
        Runnable task;
        task = () -> {            
            String threadName = Thread.currentThread().getName();
            System.out.println("This is " + name + " running on " + threadName
                    + " with a wait time of " + waitTime);
        };
        return task;
    }


}
