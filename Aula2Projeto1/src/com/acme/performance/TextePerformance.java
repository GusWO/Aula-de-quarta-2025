
package com.acme.performance;

import java.util.ArrayList;
import java.util.List;

import com.acme.sample.Aluno;
import java.util.Random;

public class TextePerformance {

    public static void main(String[] args) {
        
        List<Aluno> lista = new ArrayList();
        
        long inicio = System.currentTimeMillis();
        
        for(int i = 0; i<1_000_000; i++){
            Aluno a = new Aluno();
            Random r = new Random();
            a.setRg(r.nextInt());
            
            lista.add(a);
            
        }
        Aluno a1 = new Aluno();
        a1.setRg(999999);
        lista.add(a1);
        
        long fim = System.currentTimeMillis();
                
        
        System.out.println("Tempo para colocar: "+(fim-inicio));
    }
    
}
