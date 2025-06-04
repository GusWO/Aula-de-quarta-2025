
package com.acme.sample;

/**
 *
 * @author gusta
 */
public class Printer extends App implements Runnable{
    private int copias;
    private String documento;
    
    public Printer(int copias, String documento){
        this.copias = copias;
        this.documento = documento;
    }
    @Override
    public void run() {
        for (int i = 0; i < copias; i++) {
            System.out.println("Printando o documeto "+documento+" cópia de numero "+i);
        }
    }
    
}
