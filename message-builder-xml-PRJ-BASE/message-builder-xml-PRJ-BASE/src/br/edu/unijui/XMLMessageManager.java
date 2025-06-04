package br.edu.unijui;

import br.edu.unijui.Message.Priority;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLMessageManager {

    /**
     * Stores in an XML file every message in the list of generated messages.
     *
     * @param messageList the list of messages to be stored in the XML.
     * @param filename the name of the XML file
     */
    public static void store(String filename, List<Message> messageList) {

        // Implemente seu código aqui
        try {
            Document doc = XMLHandler.newDocument();

            Element root = doc.createElement("Messages"); // Nó raiz 
            doc.appendChild(root);

            for (Message msg : messageList) {
                Element messageElement = doc.createElement("Message");

                
                Attr idAttr = doc.createAttribute("id");
                idAttr.setValue(msg.getId().toString());
                messageElement.setAttributeNode(idAttr);

                
                Element priority = doc.createElement("Priority");
                priority.setTextContent(msg.getPriority().toString());
                messageElement.appendChild(priority);

                Element creationDate = doc.createElement("CreationDate");
                creationDate.setTextContent(msg.getCreationDate().toString());
                messageElement.appendChild(creationDate);

                Element expirationDate = doc.createElement("ExpirationDate");
                expirationDate.setTextContent(msg.getExpirationDate().toString());
                messageElement.appendChild(expirationDate);

                Element content = doc.createElement("Content");
                content.setTextContent(msg.getContent());
                messageElement.appendChild(content);

                root.appendChild(messageElement);
            }

            XMLHandler.writeXmlFile(doc, filename); 

        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    /**
     * Recover the list of messages previously stored.
     *
     * @param filename the name of the XML file in which messages are stored.
     * @return a list of recovered messages
     */
    public static List<Message> recover(String filename) {

        // Implemente seu código aqui
        List<Message> list = new ArrayList<Message>();
        
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder docbuil = dbf.newDocumentBuilder();
            Document doc = docbuil.parse(new File(filename));
            
            doc.getDocumentElement().normalize();
            
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            
            NodeList nodel = doc.getElementsByTagName("Message");
            
            for(int i = 0; i<nodel.getLength(); i++) {
                Node node = nodel.item(i);
                
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    
                    UUID id = UUID.fromString(element.getAttribute("id"));

                    String priorityStr = element.getElementsByTagName("Priority").item(0).getTextContent();
                    Priority priority = Priority.valueOf(priorityStr);

                    String creationStr = element.getElementsByTagName("CreationDate").item(0).getTextContent();
                    Date creationDate = sdf.parse(creationStr);

                    String expirationStr = element.getElementsByTagName("ExpirationDate").item(0).getTextContent();
                    Date expirationDate = sdf.parse(expirationStr);

                    String content = element.getElementsByTagName("Content").item(0).getTextContent();
                    
                    Message msg = new Message(id, creationDate);
      
                    msg.setPriority(priority);
                    msg.setExpirationDate(expirationDate);
                    msg.setContent(content);
                    
                    list.add(msg);
                }
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        }
        return list;
    }

    public static Date getDt(String dt) {
        try {
            DateFormat df = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy", Locale.ENGLISH);
            Date date = df.parse(dt);
            return date;
        } catch (ParseException ex) {
            return null;
        }
    }

    /**
     * Prints messages with a given priority.
     *
     * @param messageList the list of messages.
     * @param priority the priority to considered.
     */
    public static void printMessages(List<Message> messageList, Message.Priority priority) {

        boolean foundMessage = false;

        for (Message msg : messageList) {
            if (msg.getPriority().equals(priority)) {
                System.out.printf("%s -- %s -- %s -- %s -- %s \n", msg.getId().toString(),
                        msg.getPriority().name(),
                        msg.getCreationDate(),
                        msg.getExpirationDate(),
                        msg.getContent());
                foundMessage = true;
            }
        }

        if (!foundMessage) {
            System.out.println("Não há mensagens com essa prioridade!");
        }

    }

}
