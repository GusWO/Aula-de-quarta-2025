/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidade3paraleleos;

import com.sun.jdi.event.ThreadStartEvent;

/**
 *
 * @author gusta
 */
public class Unidade3Paraleleos {
    
    

    public static void main(String[] args) {
       long nucleos = Runtime.getRuntime().availableProcessors();
        System.out.println(nucleos);
        
        MyThread mt = new MyThread("01");
        Thread t = new Thread(mt);
        
        t.start();
        MyThread mt2 = new MyThread("002");
        
        Thread t2 = new Thread(mt2);
        t2.start();
        
    }
}
