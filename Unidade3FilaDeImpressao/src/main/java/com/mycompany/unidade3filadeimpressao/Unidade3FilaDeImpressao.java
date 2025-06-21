/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidade3filadeimpressao;

/**
 *
 * @author gusta
 */
public class Unidade3FilaDeImpressao {

    public static void main(String[] args) {
        FilaImpressao fila = new FilaImpressao();
        
        Impressora imp = new Impressora(fila);
        
        imp.start();
        
        Cliente c1 = new Cliente("MArco", fila);
        Cliente c2 = new Cliente("Gustavo", fila);
        Cliente c3 = new Cliente("Arthur", fila);
        
        c1.start();
        c2.start();
        c3.start();
    }
}
