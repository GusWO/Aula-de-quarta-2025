/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1recordclasses;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Executa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       Scanner scan = new Scanner(System.in);
       String nome="";
       String cpf="";
       String op = "";
       Pessoa2 p = new Pessoa2("Gustavo", "222222");
       Pessoa2 p2 = new Pessoa2("OOopa", "321321321");
       /** Não é possivel adicionar valores em um objeto de uma record class, já que os dados desse objeto são imutaveis
        while(!op.equals("sair")){
            
            System.out.println("Digite add para adicionar ou show para mostrar");
            op = scan.nextLine();
            
            if(op.equals("add")){
                
                System.out.println("Digite o novo nome");
                nome = scan.nextLine();
                
                System.out.println("Digite o novo Cpf");
                cpf = scan.nextLine();
                
                Pessoa2 p2 = new Pessoa2(nome, cpf);
            
                
            }else if(op.equals("show")){
                System.out.println("Nome "+ p.nome());
                System.out.println("CPF "+ p.cpf());
                System.out.println("Nome2: "+ p2.);
            }
        }
        
       scan.close();
        System.out.println("Acabou");*/
        Object[] objetos = new Object[2];
        objetos[0] = p;
        objetos[1] = p2;
        
        for(Object obj : objetos){
            System.out.println(obj);
        }
    }
    
}
