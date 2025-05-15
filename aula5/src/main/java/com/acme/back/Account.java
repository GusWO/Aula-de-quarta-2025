
package com.acme.back;


public class Account {
    
    private float balance;
    private String branchOffice;
    private int number;
    private boolean active;
    
    //Operations
    public boolean take(float amout){
       if(amout > 0 && balance >= amout){
            balance = balance - amout;
            return true;
       }else{
           return false;
       }
    }
    
    public boolean put(float amout){
        if(amout > 0){
            balance = balance + amout;
            return true;   
        }else{
            return false;
        }
        
        
    }
    
    //Gett and sett
    public String getBranchOffice() {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice) {
        this.branchOffice = branchOffice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public float getBalance(){
        return balance;
    }
    //
    
}
