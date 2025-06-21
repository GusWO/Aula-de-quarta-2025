/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.produtor_consumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class Pilha {

    private int topo;
    private int[] dados;

    public Pilha(int tamanho) {
        dados = new int[tamanho];
    }

    public synchronized int getValue() {
        while(topo == 0){
            try {
                System.out.println("Pilha vazia, topo "+topo+" wait() para "+Thread.currentThread().getName());
                this.wait();
                System.out.println(Thread.currentThread().getClass()+" saiu do wait()");
            } catch (InterruptedException ex) {}
        }
        topo--;
        System.out.println("Removido: "+dados[topo]+" > "+topo);
        this.notify();
        return dados[topo];
        
    }

    public synchronized void addValue(int d) {
        
        while(topo == dados.length){
            try {
                System.out.println("Pilha cheia, o topo "+topo+" = "+topo+" foi chamado o wait para: "+Thread.currentThread().getName());
                this.wait();
            } catch (InterruptedException ex) {}
            System.out.println("A Thread "+Thread.currentThread().getName()+" saiu do wait");
        }
        System.out.println("Adicionado : " + d + " na posição : " + topo);
        dados[topo] = d;
        topo++;
        this.notify();
    }
}
