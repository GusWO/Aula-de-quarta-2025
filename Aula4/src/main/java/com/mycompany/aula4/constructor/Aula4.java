

package com.mycompany.aula4.constructor;


public class Aula4 {

    public static void main(String[] args) {
        
        Activity a = new Activity("Opa");
        
        System.out.println(a.getStartTime());
        System.out.println(a.getDescription());
        System.out.println(a.getDuration());
        
        Activity a2 = new Activity(80000);
        System.out.println(a2.getDuration());
        
        Activity a3 = new Activity("Open Security channel", 10000);
        /*String resA3 = """
                       startTime: 
                       description:
                       duration: 
                       """;*/
        System.out.println(a3.getDescription());
        System.out.println(a3.getStartTime());
        System.out.println(a3.getDuration());
    }
    
}
