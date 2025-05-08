package br.com.acme.xml.usage;

import br.com.acme.xml.XMLHandler;
import java.util.UUID;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class SetValueToXMLTag {

    public static void main(String[] args) throws XPathExpressionException {

        Document doc = XMLHandler.readXmlFile("./order-template.xml");
        
        // Set NODE value -- UNIQUE NODE NAME
        doc.getElementsByTagName("OrderId").item(0).setTextContent(UUID.randomUUID().toString());

        //                -- MULTIPLE NODE NAME
        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        Node quantityExpresso = (Node) xpath.evaluate("//Drinks/Drink[@id='2']/Quantity", doc, XPathConstants.NODE);
        quantityExpresso.setTextContent("1");

        
        // Set ATTRIBUTE value
        Node id = (Node) xpath.evaluate("//Drinks/Drink[@id='2']/@id", doc, XPathConstants.NODE);        
        id.setTextContent("99");
        
        
        XMLHandler.writeXmlFile(doc, "./order-msg.xml");

    }
}
