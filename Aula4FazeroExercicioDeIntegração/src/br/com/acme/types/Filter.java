
package br.com.acme.types;

import br.com.acme.base.Task;


public class Filter extends Task{
    
    private String policy;
    
    //Construtor
    public Filter(String policy){
        super("Filter");
        this.policy = policy;
    }
    
    //Métodos
    public void doWork(){
        super.doWork(); //Chamei o método da classe pai Task
        System.out.println("Applying policy: "+policy);
    }
    
    @Override
    public void finalize(){
        System.out.println("Object is being collected");
    }
}
