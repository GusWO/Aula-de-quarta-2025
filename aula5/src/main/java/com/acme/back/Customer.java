
package com.acme.back;

import java.util.LinkedList;
import java.util.List;


public class Customer {
    
    //Atributtes
    private String name;
    private String cpf;
    private String birthDate;
    //Associação com a classe account já que o custumer vai ter 1 ou mais contas
    private List<Account> bankAccounts;
    
    //Constructor
    public Customer() {
        bankAccounts = new LinkedList();
    }
    
    
    //Operations
    public void addAccount(Account account){
        bankAccounts.add(account);
    }
    
    public boolean removeAccount(String branchOffice, int number){
        for(Account acc : bankAccounts){
            if(branchOffice.equalsIgnoreCase(acc.getBranchOffice()) &&
                    number == acc.getNumber()){
                bankAccounts.remove(acc);
                return true;
            }
        }
        return false;
    }
    
    //gett and sett
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
