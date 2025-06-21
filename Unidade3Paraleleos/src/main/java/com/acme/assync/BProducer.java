/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.assync;

import java.util.List;

/**
 *
 * @author gusta
 */
public class BProducer extends Thread {

    private List<String> lista;

    public BProducer(List<String> list) {
        this.lista = list;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            synchronized (this) {
                lista.add("B");
            }
            
            
        }
    }

}
