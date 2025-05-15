
package br.com.acme.base;

import java.util.Date;


public class Task {
    //Atributos
    private String name;
    private boolean active;
    private Date dateRun;
    
    //Construtor
    public Task(String name){
        Date daterun = new Date();
        this.name = name;
    }
    
    public void doWork(){
        String resposta = 
        """
        Running task %s
        at: %tT
        """.formatted(name, dateRun);
        System.out.println(resposta);
    }
}
