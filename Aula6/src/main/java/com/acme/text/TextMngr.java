
package com.acme.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;


public class TextMngr {

    
    public static void main(String[] args) {
        
        String line = "Ijui, 02 de abril de 2025";
        
        writeTextToFile(line, "C:\\Users\\GUSTAV~1.OBA\\AppData\\Local\\Temp\\myText.txt\\");
        
        String texto = readTextFromFile("C:\\Users\\GUSTAV~1.OBA\\AppData\\Local\\Temp\\Universidade Regional do Noroeste do Estado do Rio Grande do Sul - Unijuí.html");
    }
    
    public static void writeTextToFile(String line, String fileName){
     
        try {
            File f =  new File(fileName);
            FileWriter fw = new FileWriter(fileName, false);
            BufferedWriter buffer = new BufferedWriter(fw);
            PrintWriter output = new PrintWriter(buffer);
            
            output.println(line);
            
            output.close();
            buffer.close();
            fw.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static String readTextFromFile(String fileName) {
        String text = "";

        try {

            File f = new File(fileName);
            FileReader reader = new FileReader(f);
            BufferedReader buffer = new BufferedReader(reader);

            String line = null;

            while ((line = buffer.readLine()) != null) {
                text = text + line + "/n";
            }

            return text;

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
