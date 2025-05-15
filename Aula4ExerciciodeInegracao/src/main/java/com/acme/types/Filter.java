
package com.acme.types;

import com.acme.base.Task;


public class Filter extends Task{
    
    private String policy;
    
    public Filter(String policy){
        super("");
        this.policy = policy;
    }
    
    @Override
    public void doWork(){
        System.out.println("I'm a filter "+policy);
    }
    
    
    @Override
    public void finalize(){
        System.out.println("Objeto sendo removido do Heap da JVM");
    }
}
