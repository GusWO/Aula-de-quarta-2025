package br.com.acme.xml.usage;

import br.com.acme.xml.XMLHandler;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;

public class ReadXMLTagValues {

    public static void main(String[] args) {
     
        try {
            
            Document doc = XMLHandler.readXmlFile("./guarana-conf.xml");
            
            // Read NODE values
            XPathExpression e1 = XMLHandler.getXPathExpression("//monitoring/work-queue/file");
            String f = (String) e1.evaluate(doc, XPathConstants.STRING);
            
            XPathExpression e2 = XMLHandler.getXPathExpression("//monitoring/work-queue/interval");
            long i = ((Double) e2.evaluate(doc, XPathConstants.NUMBER)).longValue();
            
            // Read ATTRIBUTE values
            XPathExpression e3 = XMLHandler.getXPathExpression("//monitoring/work-queue/@enabled");
            boolean m = ((String) e3.evaluate(doc, XPathConstants.STRING)).equalsIgnoreCase("true");                
            
            System.out.println("File: "+f);
            System.out.println("Interval: "+i);
            System.out.println("Work Queue monitoring: "+m);
            
        } catch (XPathExpressionException ex) {
            System.out.println(ex);
        }
                
    }
}
