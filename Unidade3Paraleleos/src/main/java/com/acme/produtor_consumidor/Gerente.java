/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.acme.produtor_consumidor;

/**
 *
 * @author gusta
 */
public class Gerente {

    
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        
        Produtor prod1 = new Produtor(p);
        prod1.setName("Produtor 1");
        
        Produtor prod2 = new Produtor(p);
        prod2.setName("Produtor 2");
        
        Consumidor consumidor = new Consumidor(p);
        consumidor.setName("Consumidor 1");
        
        prod1.start();
        prod2.start();
        consumidor.start();
    }
    
}
