/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidade3filadeimpressao;

import java.util.Random;

/**
 *
 * @author gusta
 */
public class Cliente extends Thread{
    private final FilaImpressao fila;
    private final String nomeCliente;

    public Cliente(String nomeCliente, FilaImpressao fila) {
        this.nomeCliente = nomeCliente;
        this.fila = fila;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int paginas = random.nextInt(10) + 1; // 1 a 10 páginas
            Documento doc = new Documento(nomeCliente + "-Doc" + i, paginas);
            fila.adicionarDocumento(doc);

            try {
                int intervalo = random.nextInt(6) + 5; // 5 a 10 segundos
                Thread.sleep(intervalo * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(nomeCliente + " terminou de enviar documentos.");
    }
}
