/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidade3filadeimpressao;

/**
 *
 * @author gusta
 */
public class Impressora extends Thread{
    private final FilaImpressao fila;

    public Impressora(FilaImpressao fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (true) {
            Documento doc = fila.obterDocumento();
            doc.print();
        }
    }
}
