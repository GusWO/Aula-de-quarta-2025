package com.acme.back;

public class Account {

    // Attributes
    private float balance;
    private String branchOffice;
    private int number;
    private boolean active;
    private AccountType type;
    
    // Operations
    public boolean take(float amount){
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            return true;
        }else {
            return false;
        }        
    }
    
    public void put(float amount) throws IllegalArgumentException{
        if (amount <=0){
            String msg = "The amount %f cannot be added to the account. It is must be greater than zero".formatted(amount);
            IllegalArgumentException ex  = new IllegalArgumentException(msg);
            throw ex;
        }
    
        balance = balance + amount;
  
         
    }
    
    // Getter and Setter

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    
    

    public float getBalance() {
        return balance;
    }   
    
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
    
    
}
