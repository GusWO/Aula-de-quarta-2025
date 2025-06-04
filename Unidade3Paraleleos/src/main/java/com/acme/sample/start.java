/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.acme.sample;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class start {

    
    public static void main(String[] args) {
        
        System.out.println("Starting appltion");
        
        Printer p1 = new Printer(20, "MyExam.pdf");
        Printer p2 = new Printer(5, "book.pdf");
        
        Thread t = new Thread(p1);
        Thread t2 = new Thread(p2);
        t.start();
        t2.start();
        
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Ending appltion");
        
        
        
        
        
    }
    
}
