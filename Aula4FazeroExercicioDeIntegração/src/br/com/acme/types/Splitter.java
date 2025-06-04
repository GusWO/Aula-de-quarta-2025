
package br.com.acme.types;

import br.com.acme.base.Task;


public class Splitter extends Task{
    
    private String message;
    
    //Construtores
    public Splitter(String message){
        super("Splitter");
        this.message = message;
    }
    public Splitter(){
        super("");
    }
    
    public void doWork(){
       super.doWork();
       String[] palavras = message.split(" ");
       for(String palavra : palavras){
            if(message != null || !message.isEmpty()){
                System.out.println(palavra);
            }else{
                System.out.println("There is no message to split");
                return;
        }
       }
    }
    
    @Override
    public void finalize(){
        System.out.println("Object being collected");
    }
}
