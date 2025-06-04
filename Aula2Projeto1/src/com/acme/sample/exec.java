
package com.acme.sample;

import java.util.ArrayList;
import java.util.List;


public class exec {

   
    public static void main(String[] args) {
        
        
        Aluno aluno = new Aluno();
        aluno.setNome("Frantz Fritz");
        aluno.setRg(8080);
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Frantz Frida");
        aluno2.setRg(5464654);
        
        Aluno aluno3 = new Aluno();
        aluno2.setNome("Mario");
        aluno2.setRg(5464655);
        
        Turma t = new Turma();
        
      
        t.addAluno(aluno, aluno2, aluno3);
        
        
        System.out.println("Number of students: "+t.getNumberOfStudents());
        
        //t.removeAluno(222313);
        
        List<Aluno> listAlunos = t.getAlunos();
        
        for(Aluno a : listAlunos){
            System.out.println(a.getNome());
        }
        
    }
    
}
