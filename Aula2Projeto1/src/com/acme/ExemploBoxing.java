package com.acme;

public class ExemploBoxing {

    
    public static void main(String[] args) {
        
        // int a; => primitivo, portanto não vai possuit métodos Integer a;=> 
        int a = 4;
        a = 10;
        
        String s = "Ijui";
        
        int quantidade = s.length();
        System.out.println(quantidade);
        
        Integer i= a;
        
        String p = Integer.toBinaryString(48);
        
        System.out.println(p);
        
        Float g = 12.25f;
        int j = g.intValue();
        System.out.println(j);
        
        int[] x;
        x = new int[10];
       
        
        
    }
    
}
