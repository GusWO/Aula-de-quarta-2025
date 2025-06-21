/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.produtor_consumidor;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class Produtor extends Thread{
    private Pilha pilha;
    
    public Produtor(Pilha p) {
        pilha = p;
    }
    
    
    
    @Override
    public void run() {
        Random r = new Random(100);
        
        while(true){
            pilha.addValue(r.nextInt(9));
            try {
                Thread.sleep(Math.round(Math.random()*10_000));
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    
}
