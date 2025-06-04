
package com.mycompany.aula4.constructor;

import java.util.Date;


public class Activity {
    
    private Date startTime;
    private String description;
    private long duration;

    //Construtor
    public Activity(String description, long duration){
        startTime = new Date();
        description = this.description;
        duration = this.duration;
    }
    
   
    public Activity(long duration){
        this("", duration);
    }
    
    public Activity(String description){
        this(description, 0);
    }
    
   

    public Date getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    
}
