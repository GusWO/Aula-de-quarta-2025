package com.acme.persist;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {

    // Attributes
    private float balance;
    private String branchOffice;
    private int number;
    private boolean active;
    private AccountType type;
    private transient String password;
    private Date creationDate;
    
    //Constructor
    public Account(){
        creationDate = new Date();
    }
    
    // Operations
    public void take(float amount) throws BankAccountException {
        
        if (amount <= 0 || amount > balance) {
            throw new BankAccountException("The amount ("+amount+") cannot be taken!");
        }
        
        balance = balance - amount;
                
    }
    
    public void put(float amount) throws IllegalArgumentException {
        
        if (amount <= 0) {
            String msg = "The amount ("+amount+") cannot be added to the account. It must be greater the zero!";
            IllegalArgumentException ex = new IllegalArgumentException(msg);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

   
    
    
}
