
package br.com.acme.main;

import br.com.acme.types.Filter;
import br.com.acme.types.Splitter;


public class TestaTask {

    
    public static void main(String[] args) {
        
           Filter filter = new Filter("Agora sem utilizar o valor null aqui na policy");
           Splitter splitter = new Splitter("Agora utilizando algum valor aqui");
           filter.doWork();
           splitter.doWork();
           
           
    }
    
}
