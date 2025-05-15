/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.acme;

import java.util.*;


public class exemploCollection {

   
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        
        
        
        list.add("Ma q ba");
        list.add(50);
        list.add(list);
        
        for(var s : list){
            System.out.println(s);
        }
        ArrayList<String> nomes = new ArrayList();
        nomes.add("Pedre");
        nomes.add("Rafael");
        
        //foo(nomes);
    }
    
    public static void foo(ArrayList<String> l){
        
        for(String n : l){
            
            System.out.println(n.length());
        
        } 
    } 
}
