/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception;


public class Exemploexcepiton {

    
    public static void main(String[] args) {
        
        System.out.println("Inicio do main");
       
        int a = 10;
        int b = 0;
        foo(a, b);
        
        System.out.println("Fim do main");
    }
    
    private static void foo(int x, int y) throws ArithmeticException{
        //try {
            int r = x / y;
            System.out.println("Valor do r: %d".formatted(r));
        //} catch (ArithmeticException e) {
            //System.out.println("O valor do divisor, variavel y e %d, nao pode ser 0".formatted(y));
        //}
    }
}
