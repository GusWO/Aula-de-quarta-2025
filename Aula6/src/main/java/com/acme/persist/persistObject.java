
package com.acme.persist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class persistObject {

    
    public static void main(String[] args) {
        
        Account c1 = new Account();
        c1.setNumber(2532);
        c1.setBranchOffice("9945-1");
        c1.setActive(true);
        c1.setType(AccountType.STUDENT);
        c1.setPassword("75901266");
        
        
        saveToFile(c1, "C:\\Users\\GUSTAV~1.OBA\\AppData\\Local\\Temp/accounts.ser");
        
        Account loadedAccount = readFromFile("C:\\Users\\GUSTAV~1.OBA\\AppData\\Local\\Temp/accounts.ser");
        System.out.println("Number -> "+ loadedAccount.getNumber());
        System.out.println("B Office -> "+ loadedAccount.getBranchOffice());
        System.out.println("Is active -> "+ loadedAccount.isActive());
        System.out.println("Type -> "+ loadedAccount.getType());
        System.out.println("Password -> "+ loadedAccount.getPassword());
        System.out.println("Creation Dt -> "+ loadedAccount.getCreationDate());
        
        Customer cust = new Customer();
        saveToFile(cust, "caminho");
    }
    
    public static void saveToFile(Object c, String fileName){
        try {
            File f = new File(fileName);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
       
            oos.writeObject(c);
            oos.flush();
            fos.flush();
            /* o ideal é fazer o close
            oos.close();
            fos.close(); */
            System.out.println("Objeto salvo com sucesso");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static Account readFromFile(String fileName){
        
        
        try {
            File f = new File(fileName);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Account c = (Account)ois.readObject();
            
            ois.close();
            fis.close();
            return c;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
        
    }
}
