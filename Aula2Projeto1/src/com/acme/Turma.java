/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme;

import java.util.ArrayList;

/**
 *
 * @author gustavo.obadowski
 */
public class Turma {
    //Atributos
    private String cod;
    private String local;
    private ArrayList<Aluno> alunos;

    
    
    //Construtor
    public Turma(){
        alunos = new ArrayList();
    }

    //Operações
    public void add(Aluno a) {
        alunos.add(a);
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
