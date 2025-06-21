/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidade3filadeimpressao;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author gusta
 */
public class FilaImpressao {
    private final Queue<Documento> fila = new LinkedList<>();

    public synchronized void adicionarDocumento(Documento doc) {
        fila.offer(doc);
        System.out.println("Documento " + doc.getNome().toString() + " adicionado à fila.");
        notify(); // Acorda impressora se estiver dormindo
    }

    public synchronized Documento obterDocumento() {
        while (fila.isEmpty()) {
            try {
                System.out.println("Fila vazia. Impressora aguardando...");
                wait(); // Impressora espera documentos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return fila.poll();
    }
}
