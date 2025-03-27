
package com.a;

import com.acme.back.Account;
import com.acme.back.AccountType;
import javax.swing.JOptionPane;

public class Start {

    
    public static void main(String[] args) {
        
        Account a = new Account();
        a.setType(AccountType.BUSINESS);
        
        try {
            a.put(-5000);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println("Saldo "+a.getBalance());
        
        Account b = new Account();
        b.setType(AccountType.PERSONAL);
        
        printData(a);
        
        
    }
    
    private static void printData(Account x){
        AccountType t = x.getType();
        System.out.println(t.name());
        System.out.println(t.ordinal());
        
    }
}
