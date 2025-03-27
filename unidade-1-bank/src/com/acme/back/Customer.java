package com.acme.back;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    
    // Attributes
    private String name;
    private String CPF;
    private String birthdate;
    private List<Account> bankAccounts;
    
    // Constructor
    public Customer() {
        bankAccounts = new LinkedList();
    }
    
    // Operations 
    public void addAccount(Account account) {
        bankAccounts.add(account);
    }
    
    public boolean removeAccount(String branchOffice, int number) {
        for (Account c : bankAccounts) {
            if (branchOffice.equalsIgnoreCase(c.getBranchOffice()) && 
                    number == c.getNumber()) {
                bankAccounts.remove(c);
                return true;
            }
        }
        return false;
    }
    
    public int getNumberOfAccounts() {
        return bankAccounts.size();
    }
    
    // Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
}
