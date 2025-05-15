
package com.acme;

//import com.acme.sample.Aluno;
//import java.util.HashMap;


public class exemplohash {

   
    public static void main(String[] args) {
        
        //HashMap<String, Aluno> dados = new HashMap();
        
        //Aluno a1 = new Aluno();
        //a1.setNome("João");
        
        //dados.put("0001", a1);
        
        long start = System.nanoTime();
       // boolean res = dados.containsKey("0001");
        long end = System.nanoTime();
        
        //System.out.println(res);
        System.out.println("Time-> "+ (end-start));
        
        
      
        
    }
    
}
