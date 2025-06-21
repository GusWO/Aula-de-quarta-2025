
package com.acme.assync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gusta
 */
public class AssyncApp {
    
    //private static List<String> list = new ArrayList();
    
    private static List<String> list = Collections.synchronizedList(new ArrayList<>());
    
    public static void main(String[] args) {
        
        AProducer threadA = new AProducer(list);
        
        BProducer threadB = new BProducer(list);
        
        CProducer threadC = new CProducer(list);
        
        threadA.start();
        threadB.start();
        threadC.start();
        
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException interruptedException) {
        }
        
        for (String s : list) {
            System.out.println(s);
        }
        
        list.remove(list);
    }
    
}
