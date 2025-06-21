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
public class Documento {
    private final int paginas;
    private final String nome;

    public Documento(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public void print() {
        try {
            int tempo = new Random().nextInt(30) + 1; // 1 a 30 segundos
            System.out.println("Imprimindo " + nome + " com " + paginas + " páginas (Tempo: " + tempo + "s)");
            Thread.sleep(tempo * 1000L);
            System.out.println(nome + " impresso.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String getNome() {
        return nome;
    }
}
