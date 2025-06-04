
package com.acme.base;

import java.util.Date;


public abstract class Task {
    private String name;
    private boolean active;
    private Date dateRun;
    
    public Task(String name){
        name = this.name;
    }
    
    public abstract void doWork();
        
    
}
