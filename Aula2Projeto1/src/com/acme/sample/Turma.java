/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.sample;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gustavo.obadowski
 */
public class Turma {
    //Atributos
    private String cod;
    private String local;
    private List<Aluno> alunos;

    
    //Construtor
    public Turma(){
        alunos = new LinkedList();
    }

    //Operações
    
    public int getNumberOfStudents(){
        return alunos.size();
        
    }
    public void addAluno(Aluno... a) {
        for(Aluno aluno : a){
                if(a != null){
                alunos.add(aluno);
            }
        }
    }
    
    
    public List<Aluno> getAlunos(){
        return alunos;
    }
            
    public void removeAluno(int rg){
        for(Aluno aluno : alunos){
            if(aluno.getRg() == rg){
                alunos.remove(aluno);
                return;
            }
        }
    }
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    
    
}
