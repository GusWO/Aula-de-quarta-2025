
package atividade1recordclasses;

import java.util.Scanner;


public class Executa {

    
    public static void main(String[] args) {
        
       Pessoa1 p = new Pessoa1();
       Scanner scan = new Scanner(System.in);
       String nome="";
       String cpf="";
       String op = "";
       
        while(!op.equals("sair")){
            
            System.out.println("Digite add para adicionar ou show para mostrar");
            op = scan.nextLine();
            
            if(op.equals("add")){
                
                System.out.println("Digite o nome que vc quer colocar: ");
                nome = scan.nextLine();
                
                System.out.println("Digite o cpf que vc quer colocar: ");
                cpf = scan.nextLine();
                
                p.setNome(nome);
                p.setCpf(cpf);
                
            }else if(op.equals("show")){
                System.out.println("Nome "+ p.getNome());
                System.out.println("CPF "+ p.getCpf());
            }
        }
        
       scan.close();
        System.out.println("Acabou");
    }
    
}
