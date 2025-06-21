package com.acme.assync;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class AProducer extends Thread {

    private List<String> lista;

    public AProducer(List<String> list) {
        this.lista = list;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            synchronized (this) {
                 lista.add("A");
            }
            
        }
    }

}
