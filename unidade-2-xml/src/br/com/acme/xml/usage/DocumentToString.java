package br.com.acme.xml.usage;

import br.com.acme.xml.XMLHandler;
import org.w3c.dom.Document;

public class DocumentToString {

    public static void main(String[] args) {
        Document doc = XMLHandler.readXmlFile("./guarana-conf.xml");
        
        String s = XMLHandler.xml2String(doc);
        System.out.println( s );
        System.out.println("Length: "+s.length() );
        
    }
}
