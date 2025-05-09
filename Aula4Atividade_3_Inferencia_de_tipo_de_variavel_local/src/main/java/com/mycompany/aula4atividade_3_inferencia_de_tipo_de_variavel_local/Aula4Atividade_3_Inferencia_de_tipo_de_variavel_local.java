

package com.mycompany.aula4atividade_3_inferencia_de_tipo_de_variavel_local;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class Aula4Atividade_3_Inferencia_de_tipo_de_variavel_local {

    public static void main(String[] args) {
        
        String p1 = "Alguma string";
        int n2 = 21211;
        
        var p2 = "Alguma string tbm";
        
        var n = 100;
        
        var nf = 12.20;
        
        var algo = p2;
        
        var a = 0;
        
        String b = " ";
        
        System.out.println(nf);
        System.out.println();
        
        Teste t = new Teste();
        
        t.setNome("aaaa");
        t.setNumero(123);
        t.listaTestes.add(t);
        
        t.printaTudo();
        
    }
    
    
    public static class Teste{
        
       private String nome;
       private int numero;
       private Date dataInicio;
       //private var nome2;
       private List<Teste> listaTestes;
       
       public Teste(){
           this.dataInicio = new Date();
           this.listaTestes = new ArrayList<>();
       }
       
     

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public Date getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(Date dataInicio) {
            this.dataInicio = dataInicio;
        }

        /*public <any> getNome2() {
            return nome2;
        }

        public void setNome2(<any> nome2) {
            this.nome2 = nome2;
        } */

        public List getListaTestes() {
            return listaTestes;
        }

        public void setListaTestes(List listaTestes) {
            this.listaTestes = listaTestes;
        }
       
       public List printaTudo(){
           
           for (var teste : listaTestes) {
               System.out.println(teste);
            }
           return listaTestes; 
       }
       
       @Override
       public String toString(){
           var retorna = """
                         Nome: %s
                         numero: %d
                         data: %s
                         """.formatted(nome, numero, dataInicio); 
           return retorna;
       }
    }
}
