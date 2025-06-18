/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidade3paraleleos;

/**
 *
 * @author gusta
 */
public class MyThread implements Runnable{

    private  String id;
    
    public MyThread(String id){
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Iniciando a thread "+id);
        int a = 10;
        System.out.println(a);
        
        String s = "ijui";
        System.out.println(s);
    }
    
}
