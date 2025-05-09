package com.acme.exercicios;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.SortOrder;

public class Contadorpalavras {

    public static void main(String[] args) {

        String texto = "A inteligência artificial (IA) tem se tornado uma das tecnologias mais transformadoras do século XXI, impactando uma vasta gama de setores, desde a saúde até a educação e o entretenimento. A capacidade das máquinas de aprender com dados e melhorar seu desempenho ao longo do tempo tem revolucionado a maneira como as empresas operam e como as pessoas interagem com a tecnologia. Por exemplo, na área da saúde, algoritmos de IA estão sendo usados para detectar doenças precocemente, como câncer, com uma precisão que muitas vezes supera os diagnósticos humanos. Além disso, as IAs estão permitindo avanços significativos no desenvolvimento de tratamentos personalizados, ajustados ao perfil genético de cada paciente.\n"
                + "\n"
                + "Ao mesmo tempo, a IA levanta questões éticas e sociais que precisam ser cuidadosamente abordadas. Questões como privacidade de dados, segurança no uso de IA e o impacto da automação no mercado de trabalho são tópicos amplamente discutidos. Enquanto algumas pessoas temem que a IA substitua empregos humanos, outros acreditam que ela pode criar novas oportunidades e melhorar a eficiência das tarefas cotidianas. O desafio será garantir que a implementação dessa tecnologia seja feita de forma ética, equilibrada e com benefícios para a sociedade como um todo.";
        
        
        String[] palavras = texto.split(" ");//separando tudo e "fazendo virar token" para ser contado
        
        System.out.println("Numero de palavras: "+ palavras.length);
        
        HashSet<String> mySet = new HashSet<>();
        for(String p: palavras){
            mySet.add(p);
        }
        System.out.println("Palavras únicas: "+mySet.size());
        
        //A partir daqui, eu busco pela palavra e vai me dizer quantas vezes ela aparece
        /*Scanner scan = new Scanner(in);
        String p1 ="";
        
        System.out.println("Digite a palavra q vc deseja procurar: ");
        p1 = scan.nextLine();
        
        while (!p1.equals("000")){
           int contagemIguais = 0;
           for(String s : palavras){   
               if(p1.equals(s)){
                    contagemIguais++;
                }
            } 
           System.out.println(" "+p1);
           System.out.println("Numero de vezes que a palavra acima repetiu: "+contagemIguais);
           System.out.println("Digite a palavra q vc deseja procurar: ");
           p1 = scan.nextLine();
        } */
        
        
        
        //fazer o sort
        List<String> palavrasEmOrdem = Arrays.asList(palavras);
        
        Collections.sort(palavrasEmOrdem);
        String resposta = """
                          Palavras em ordem: %s
                          """.formatted(palavrasEmOrdem);
        
        System.out.println(resposta);
        
        //ordem decrescente de frequência
        
        List<String> palavrasOrdemDec = palavrasEmOrdem.stream().distinct()
                .sorted((p1, p2) -> )
        }
    
}
    
    


