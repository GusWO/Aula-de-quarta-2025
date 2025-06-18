/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.acme.sample;

/**
 *
 * @author gusta
 */
public class ThreadPrio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        long[] executions = new long[3];
        
        Task t0 = new Task(0, executions);
        t0.setPriority(Thread.MAX_PRIORITY);
        Task t1 = new Task(1, executions);
        
        Task t2 = new Task(2, executions);
        
        t0.start();
        t1.start();
        t2.start();
        
        Thread.sleep(10*1000);
        
        System.out.println(" -- Resultado -- ");
        System.out.println(" #0 -> "+executions[0]);
        System.out.println(" #1 -> "+executions[1]);
        System.out.println(" #2 -> "+executions[2]);
    }
    
}
