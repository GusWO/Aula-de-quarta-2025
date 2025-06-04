

package com.acme.main;

import com.acme.base.Task;
import com.acme.types.Filter;
import com.acme.types.Splitter;


public class App {

    public static void main(String[] args) {
        
        Filter f1 = new Filter("Elimine contratos com valor acima de 10000");
        execute(f1);
        
        Splitter s1 = new Splitter("ma que bah");
        execute(s1);
    }
    
    public static void execute(Task t){
        t.doWork();
    }
}
