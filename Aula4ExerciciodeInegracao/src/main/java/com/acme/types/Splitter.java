
package com.acme.types;

import com.acme.base.Task;


public class Splitter extends Task{

    private String message;
    
    public Splitter(){
        super("");
    }
    
    public Splitter(String message){
        super("");
        this.message = message;
    }
    @Override
    public void doWork() {
        System.out.println("I'm a splitter "+message);
    }
    
    @Override
    public void finalize(){
        System.out.println("Objeto sendo removido do Heap da JVM");
    }
    
    
}
