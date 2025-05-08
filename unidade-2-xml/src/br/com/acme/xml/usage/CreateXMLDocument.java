package br.com.acme.xml.usage;

import br.com.acme.xml.XMLHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * <?xml version="1.0" encoding="iso-8859-1"?>
 * <Mail>
 *   <From> ... </From>
 *   <To> ... </To>
 *   <Subject> ... </Subject>
 *   <Body> ... </Body>
 * </Mail>
 * 
 */
public class CreateXMLDocument {

    public static void main(String[] args) {
  
        Document doc = XMLHandler.newDocument();

        // <Mail>
        Element root = doc.createElement("Mail");
        doc.appendChild(root);

        // <From>
        Element from = doc.createElement("From");
        from.setTextContent("viagens@acme.com.br");
        root.appendChild(from);
        
      

        // <To>
        Element to = doc.createElement("To");
        to.setTextContent("rzfrantz@unijui.edu.br");
        root.appendChild(to);

        // <Subject>
        Element subject = doc.createElement("Subject");
        subject.setTextContent("Your Travel Booking #5874926811");
        root.appendChild(subject);

        // <Body>
        Element body = doc.createElement("Body");
        body.setTextContent("This is to confirm your booking.\n"
                + "Flight Details:\n"
                + "Departure date: 01/Feb/2026 \n"
                + "Departure flight: IB3457 \n"
                + "Return date: 15/Apr/2026 \n"
                + "Return flight: IB8816 \n\n\n"
                + "Hotel Datails:\n"
                + "Checkin: 01/Feb/2026 \n"
                + "Checkout: 15/Apr/2026 \n\n\n"
                + "TRAVEL TOTAL COST: R$ 2356,73");
        root.appendChild(body);

        XMLHandler.writeXmlFile(doc, "./booking-msg.xml");

    }
}
