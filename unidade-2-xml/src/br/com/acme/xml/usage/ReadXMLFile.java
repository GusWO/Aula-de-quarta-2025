package br.com.acme.xml.usage;

import br.com.acme.xml.XMLHandler;
import org.w3c.dom.Document;

public class ReadXMLFile {

    public static void main(String[] args) {

        Document doc = XMLHandler.readXmlFile("curriculo.xml");
        if ( doc != null ) { 
            System.out.println("Documento XML carregado para memória com sucesso!");
        }
        
        // pode-se manipular o documento...
        
        //Document doc_2 = XMLHandler.newDocument();
        
        XMLHandler.writeXmlFile(doc, "_new_curriculo.xml");
        
    }
    
}
